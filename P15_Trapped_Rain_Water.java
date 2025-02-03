public class P15_Trapped_Rain_Water {

    public static int trappedWater(int hieght[]){
        int n=hieght.length;

        int leftMax[]=new int[n];
        leftMax[0]=hieght[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(hieght[i], leftMax[i-1]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=hieght[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(hieght[i], rightMax[i+1]);
        }

        int water=0;
        for(int i=1;i<n;i++){
            int level = Math.min(leftMax[i], rightMax[i]);
            water += level - hieght[i];
        }
        return water;
    }

    public static void main(String[] args) {
        //int hieght[]={4,2,0,6,3,2,5};
        int hieght[]={4,2,0,3,2,5};
        System.out.println("Trapped Water : " + trappedWater(hieght));
    }
}