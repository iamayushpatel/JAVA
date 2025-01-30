public class P9_Linear_Search {

    public static int linearSearch(String menu[],String key) {
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int numbers[]={2,4,6,8,10,12,14,16,18};
        // int key=10;
        String menu[]={"Dosa","Samosa"};
        String key="Samosa";
        int index=linearSearch(menu, key);
        if(index==-1){
            System.err.println("Not found");
        }else{
            System.out.println("Index Is :: " + index);
        }
    }
}
