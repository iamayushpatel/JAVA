import java.util.*;
public class P17_Array_Oue {

    /* Q-1 Given an integer array nums, return true if any value appears at twice in the array 
    and return false if every element is distinct */

    public static boolean check1(int nums[]) {   // O(n^2)
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean check2(int nums[]) {
        HashSet<Integer> set = new HashSet<>();   // O(n)
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    /* Q-2 Search in rotated sorted array  */

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
        int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if(nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    /* Q-3 Buy and sell stocks  */

    public static int buyOrSell(int price[]) {

        int buyPrice = price[0];
        int maxProfit = 0;

        for(int i=1;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice; //Today's Profit
                maxProfit = Math.max(maxProfit, profit); //Max Profit
            } else {
                buyPrice = price[i]; //Update Buy Price
            }
        }
        return maxProfit;
    }

    /* Q-4 Trapped rain water */ //O(n)

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int water = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }
        return water;        
    }

    /* Q-5 Calculate triplets which has sum 0 */

    public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>>result = new ArrayList <List<Integer>> ();
        for (int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                if (nums[i] + nums[j] + nums [k] == 0) {
                    List<Integer> triplet = new ArrayList<Integer> ();
                        triplet.add(nums[i]);
                        triplet.add(nums [j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
    result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
    return result;
    }


    public static void main(String[] args) {
        // int nums[] = {4,5,6,7,0,1,4};
        // System.out.println(check1(nums));   // Q-1
        
        // int target = 0;
        // System.out.println(search(nums, target));  // Q-2

        //int price[] = {7,1,5,3,6,4};
        //System.out.println("Max Price : " + buyOrSell(price));   // Q-3

        //int height[]={4,2,0,3,2,5};
        //System.out.println(trap(height));   // Q-4

        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));   // Q-5
    }
}