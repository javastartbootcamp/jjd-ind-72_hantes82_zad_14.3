import java.util.*;
import java.util.Scanner;

public class Main {

    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        Map<String, Country> countries = FileOperations.loadCountriesFromFile("src/main/countries.csv");
        if (countries.isEmpty()) {
            return;
        }
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String code = scanner.nextLine();
        if (countries.get(code) == null) {
            System.out.println("Kod kraju " + code + " nie został znaleziony.");
        } else {
            Country country = countries.get(code);
            System.out.printf("%s (%s) ma %d ludności.", country.getName(), country.getCode(), country.getPeopleNumber());
        }
    }
}
