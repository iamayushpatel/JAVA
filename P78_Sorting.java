import java.util.*;
public class P78_Sorting {

    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    Collections.sort(cars);
    System.out.println(cars);

    ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(3);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}