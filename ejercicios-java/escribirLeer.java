import java.io.*;
//Escribir y luego leer un archivo de texto
public class escribirLeer {
    public static void main(String[] args) {
        String nombreArchivo = "mensaje.txt";
        String mensaje = "¡Hola, mundo!";

        // Escribir en el archivo
        try (PrintWriter pw = new PrintWriter(nombreArchivo)) {
            pw.println(mensaje);
            System.out.println("Mensaje escrito en el archivo '" + nombreArchivo + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Leyendo el contenido del archivo '" + nombreArchivo + "':");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
