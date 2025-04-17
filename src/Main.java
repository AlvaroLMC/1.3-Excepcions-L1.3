import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String fileName = "countries.txt";
        HashMap<String, String> countryCapitals = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countryCapitals.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        int count = 0;
        int score = 0;

        while (count < 10) {
            List<String> keys = new ArrayList<>(countryCapitals.keySet());
            Random rand = new Random();
            int randomIndex = rand.nextInt(keys.size());

            String selectedCountry = keys.get(randomIndex);
            System.out.println((count + 1) + ". Country: " + selectedCountry + " - Capital: ");
            String enteredCapital = scanner.nextLine();

            if (countryCapitals.get(selectedCountry).equalsIgnoreCase(enteredCapital)) {
                score++;
            }

            count++;
        }

        String outputFile = "categories.txt";

        try (FileWriter writer = new FileWriter(outputFile, true)) {
            writer.write(username + " " + score + "\n");
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving the data: " + e.getMessage());
        }
    }
}
