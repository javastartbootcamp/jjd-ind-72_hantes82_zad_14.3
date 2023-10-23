import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOperations {
    public static Map<String, Country> loadCountriesFromFile(String filePath) {
        File file = new File(filePath);
        Map<String, Country> countries = new HashMap<>();
        try (
                Scanner scan = new Scanner(file);
        ) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lineArray = line.split(";");
                countries.put(lineArray[0], new Country(lineArray[0], lineArray[1], Long.parseLong(lineArray[2])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv.");
        }
        return countries;
    }
}
