package ex5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            int numberEnfants = 0;

            String[] ages = line.split(" ");
            for (String age : ages) {
                if (isChild(Integer.parseInt(age))) {
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
