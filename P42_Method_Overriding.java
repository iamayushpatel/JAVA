public class P42_Method_Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animals{
    void eat(){
        System.out.println("Eats Grass");
    }
}