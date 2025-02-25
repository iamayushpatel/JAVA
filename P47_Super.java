public class P47_Super {
    public static void main(String[] args) {
       Horse h = new Horse(); 
    }
}

class Animals{
    Animals(){
        System.out.println("Animal Constructor");
    }
}
class Horse extends Animals{
    Horse(){
        super();
        System.out.println("Horse Constructor");
    }
}