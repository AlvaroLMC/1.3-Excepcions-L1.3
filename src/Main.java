import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String archivo = "countries.txt";
        HashMap<String, String> paisesCapitales = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length == 2) {
                    String pais = partes[0].trim();
                    String capital = partes[1].trim();
                    paisesCapitales.put(pais, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar el contenido del HashMap
        System.out.println("Contenido del HashMap:");
        for (String pais : paisesCapitales.keySet()) {
            System.out.println("País: " + pais + " - Capital: " + paisesCapitales.get(pais));
        }

        System.out.println("Ingrese el nombre de usuario: ");
        String nombre = scanner.nextLine();

        int count = 0;
        int aciertos = 0;

        while (count < 10) {
            List<String> claves = new ArrayList<>(paisesCapitales.keySet());
            Random rand = new Random();
            int indiceAleatorio = rand.nextInt(claves.size());


            String paisSeleccionado = claves.get(indiceAleatorio);
            System.out.println((count+1) + ". País: " + paisSeleccionado + " - Capital: ");
            String capitalIngresada = scanner.nextLine();

            if (paisesCapitales.get(paisSeleccionado).equalsIgnoreCase(capitalIngresada)) {
                aciertos++;
            }

            count++;
        }

        String categoria = "categoria.txt";

        try (FileWriter writer = new FileWriter(categoria, true)) {
            writer.write(nombre + " " + aciertos + "\n");
            System.out.println("Datos guardados exitosamente");

        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}