import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String[] toys = new String[5];
        toys[0] = "batman";
        toys[1] = "ironman";
        toys[2] = "robin";
        toys[3] = "capitan sovjet";
        toys[4] = "hotweels";


        String[] comrade = new String[5];
        comrade[0] = "Esseen";
        comrade[1] = "Olsson";
        comrade[2] = "Kjellin";
        comrade[3] = "Larsson Svensdotter";
        comrade[4] = "Ödin";


        Integer[] numbers = new Integer[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;


        for (int i = 0; i < toys.length; i++) {

            System.out.println(comrade[i] + " ger " + toys[i] + " betyget " + numbers[i]);

        } */

        ArrayList<String> cities = new  ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Tell me a city now:");
                cities.add(scan.nextLine());

                if (Objects.equals(cities.getLast(), "exit")) {
                    break;
                }

                System.out.println();
                for (String city : cities) {
                    System.out.println(city);
                }
                System.out.println();

            } catch (Exception e) {
                System.out.println("Try again");
                System.out.println();
            }
        }
    }
}