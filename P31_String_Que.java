import java.util.Arrays;
import java.util.Scanner;
public class P31_String_Que {

    public static void check(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //ch >= 'a' && ch <= 'z'
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count ++;
            }
        }
        System.out.println("Lower Case Vowels Is : " + count);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         check(str);
         sc.close();

        String str1 = "earth";
        String str2 = "heart";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char str1arr[] = str1.toCharArray();
            char str2arr[] = str2.toCharArray();
            Arrays.sort(str1arr);
            Arrays.sort(str2arr);

            boolean result = Arrays.equals(str1arr, str2arr);
            if(result){
                System.out.println("Anagrams");
            }else{
                System.out.println("Not An Anagrams");
            }
        }else{
            System.out.println("Not An Anagrams");
        }

    }
}
