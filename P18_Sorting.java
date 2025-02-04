public class P18_Sorting {

    public static void bubble(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }  
            }
        }
    }

    public static void selection(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        int count[] = new int [largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int idx=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[idx]=i;
                idx++;
                count[i]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        //insertion(arr);
        // int arr[]={1,2,5,3,1,2,4,6,1};
         counting(arr);
        //Arrays.sort(arr);
        print(arr);
    }
}
