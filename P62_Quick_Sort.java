public class P62_Quick_Sort {

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int pIdx = partation(arr, si, ei);
        quickSort(arr, si, pIdx-1); // Left
        quickSort(arr, pIdx+1, ei); // Right
    }

    public static int partation(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}