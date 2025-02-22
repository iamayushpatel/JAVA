public class P44_Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animals{
    Animals(){
        System.out.println("Animal Constructor");
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();
}

class Horse extends Animals{
    Horse(){
        System.out.println("Horse Constructor");
    }
    void walk(){
        System.out.println("Walks");
    }
}