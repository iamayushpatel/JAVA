public class P53_First_Last_Occ {

    public static int firstOcc(int arr[],int key,int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    public static int lastOcc(int arr[],int key,int i){
        if (i == arr.length) {
            return -1;
        }
        int found = lastOcc(arr, key, i+1);
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,8,9,5,7};
        System.out.println(firstOcc(arr, 5, 0));
        System.out.println(lastOcc(arr, 5, 0));
    }   
}
