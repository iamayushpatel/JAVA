public class P65_Inv_Count {
    // O(n^2)
    // public static int getInvCount(int arr[]){
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             if (arr[i]>arr[j]) {
    //                 count ++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    // O(nlogn)
    public static int mergeSort(int arr[],int si,int ei){
        int invCount = 0;
        if (ei>si) {
            int mid = si + (ei-si) / 2; // (si+ei)/2
            invCount = mergeSort(arr, si, mid) + mergeSort(arr, mid+1, ei) + merge(arr,si,mid+1,ei);
        }
        return invCount;
    }

    public static int merge(int arr[],int si,int mid,int ei){
        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid;
        int k = 0;
        int invCount = 0;

        while (i < mid && j <= ei) {
            if (arr[i]<arr[j]) {
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                invCount += (mid-i);
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main(String[] args){
        int arr[] = {1,20,6,4,5};
        //System.out.println(getInvCount(arr));
        System.out.println(mergeSort(arr, 0, arr.length-1));
    }
}