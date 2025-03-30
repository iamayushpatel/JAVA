public class P64_Majority_Element {

   // O(n^2)
    public static int majority(int nums[]){
        int majoCount = nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if (nums[j] == nums[i]) {
                    count += 1;
                }
            }
            if (count > majoCount) {
                return nums[i];
            }
        }
        return -1;
    }
    
    // O(nlogn)
    // public static int countInRange(int nums[],int n,int si,int ei){
    //     int count = 0;
    //     for(int i=si;i<ei;i++){
    //         if (nums[i] == n) {
    //             count ++;
    //         }
    //     }
    //     return count;
    // }

    // public static int majority(int nums[],int si,int ei){
    //     if (si == ei) {
    //         return nums[si];
    //     }
    //     int mid=si+(ei-si)/2;
    //     int left = majority(nums, si, mid);
    //     int right = majority(nums, mid+1, ei);
    //     if (left == right) {
    //         return left;
    //     }

    //     int lCounter = countInRange(nums, left, si, ei);
    //     int rCounter = countInRange(nums, right, si, ei);
    //     return lCounter > rCounter ? left : right;
    // }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
         System.out.println(majority(nums));
        //System.out.println(majority(nums, 0, nums.length-1));
    }
}