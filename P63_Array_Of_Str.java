public class P63_Array_Of_Str {

    public static String[] mergesort(String arr[],int si,int ei){
        if(si==ei){
            String A[] = {arr[si]};
            return A;
        }
        int mid=si+(ei-si)/2;
        String arr1[]=mergesort(arr,si,mid);
        String arr2[]=mergesort(arr,mid+1,ei);
        String arr3[]=merge(arr1,arr2);
        return arr3;
    }
    
    public static String[] merge(String arr1[],String arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        String temp[] = new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(isSmaller(arr1[i],arr2[j])){
                temp[idx++]=arr1[i++];
            }else{
                temp[idx++]=arr2[j++];
            }
        }

        while(i<m){
            temp[idx++]=arr1[i++];
        }
        while(j<n){
            temp[idx++]=arr2[j++];
        }
        return temp;
    }
        //Return true if str1 appears before str2 in alphabetical order
    public static boolean isSmaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        String a[]=mergesort(arr,0,arr.length-1);//why stored in string a
        for(int i=0;i<arr.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}