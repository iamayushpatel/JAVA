public class P56_Remove_Dup_String {

    public static void remove(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(idx);
        if (map[curr - 'a'] == true) {
            remove(str, idx+1, newStr, map);
        }else{
            map[curr - 'a'] = true;
            remove(str, idx+1, newStr.append(curr), map);
        }
    }

    public static void main(String[] args) {
        String str = "apanacollage"; //aayushpatel
        remove(str, 0, new StringBuilder(), new boolean[26]);
    }
}
