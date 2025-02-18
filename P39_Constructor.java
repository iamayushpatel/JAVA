public class P39_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayush Patel";
        s1.roll = 236;
        
        //Student s2 = new Student("Ayush");

        Student s2 = new Student(s1);
        s2.roll = 241;
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student{
    String name;
    int roll;
    // No Perameterized
    Student(){
        System.out.println("Constructor Called !!");
    }
    // Perameterized
    Student(String name){
        this.name = name;
    }
    // Copy Constructor
    Student (Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }
}
