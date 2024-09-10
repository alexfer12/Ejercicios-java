/*En este ejercicio, copiaremos el contenido de un archivo de texto a otro 
utilizando FileReader, FileWriter, BufferedReader y BufferedWriter. */
import java.io.*;
public class copiar {
    public static void main(String[] args) {
        String archivoOrigen = "archivo1.txt";
        String archivoDestino = "archivo2.txt";
        copiarArchivo(archivoOrigen, archivoDestino);
    }

    public static void copiarArchivo(String archivoOrigen, String archivoDestino) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDestino))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine(); // Agregar salto de línea
            }
            System.out.println("Contenido copiado de " + archivoOrigen + " a " + archivoDestino + " exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
            e.printStackTrace();
        }
    }
}