public class P45_Interface {
    public static void main(String[] args) {
        Check obj = new Check();
        obj.print();
        obj.show();
    }
}

interface Printable{
    void print();
}
interface Showable{
    void show();
}

class Check implements Printable, Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Ayush");
    }
}