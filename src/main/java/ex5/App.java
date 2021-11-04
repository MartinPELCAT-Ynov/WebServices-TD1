package ex5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            int numberEnfants = 0;

            int[] ages = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int age : ages) {
                if (isChild(age)) {
                    numberEnfants++;
                }
            }
            System.out.println("Nombre d'enfants pouvant daire du toboggan: ".concat(String.valueOf(numberEnfants)));
        }
    }

    public static boolean isChild(int age) {
        return age >= 5 && age <= 9;
    }

}
