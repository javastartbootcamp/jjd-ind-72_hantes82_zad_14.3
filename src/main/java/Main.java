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
        for (Map.Entry<String, Country> entry : countries.entrySet()) {
            if (entry.getKey().equals(code)) {
                Country country = entry.getValue();
                System.out.printf("%s (%s) ma %d ludności.", country.getCountryName(), country.getCountryCode(),
                        country.getPeopleNumber());
                return;
            }

        }
        System.out.println("Kod kraju " + code + " nie został znaleziony.");
    }

}
