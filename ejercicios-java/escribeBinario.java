import java.io.*;
    //Escribe tres datos en un archivo binario
public class escribeBinario {
    public static void main(String[] args) {
        String nombreArchivo = "datos.bin";
        escribirDatosBinarios(nombreArchivo);
    }

    public static void escribirDatosBinarios(String nombreArchivo) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombreArchivo))) {
            // Escribir tres datos en el archivo binario
            dos.writeInt(10);    // Escribir un entero
            dos.writeDouble(3.14);  // Escribir un double
            dos.writeUTF("Hola");  // Escribir una cadena de texto en formato UTF-8
            
            System.out.println("Datos escritos en el archivo binario correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo binario.");
            e.printStackTrace();
        }
    }
}


