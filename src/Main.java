import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

    HashMap<String,String> cars = new HashMap<String,String>();


        cars.put("Chevy","Camaro");
        cars.put("Ford","Escape");
        cars.put("Honda","CRV");
        cars.put("Volkswagen","Golf");

        System.out.println("Original HashMap with four elements:  \n");

        for(String i : cars.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(cars.get(i)+ "\n");
        }

        cars.put("Toyota","Camry");

        System.out.println("HashMap with new car added:   \n");

        for(String i : cars.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(cars.get(i)+ "\n");
        }

        cars.remove("Honda","CRV");

        System.out.println("HashMap with car removed:   \n");

        for(String i : cars.keySet()) {

            System.out.print(i+"\t" + "= ");
            System.out.println(cars.get(i) + "\n");
        }

    }
}