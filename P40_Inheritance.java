public class P40_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animals{
    String colour;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("Swims In Water");
    }
}
