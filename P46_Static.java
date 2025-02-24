public class P46_Static {
    public static void main(String[] args) {
        Student ayush = new Student();
        ayush.name = "Ayush";
        ayush.schoolName = "CVV";

        Student aksh = new Student();
        aksh.name = "Aksh";
        aksh.schoolName = "LDRP";

        ayush.show();
        aksh.show();
    }
}

class Student{
    String name;
    static String schoolName;
    public void show(){
        System.out.println(name + " : " + schoolName);
    }
}
