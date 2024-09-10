/*2. Escribir un programa en Java que, para cualquier ruta indicada por el
usuario, muestre:
a. Si el fichero existe o no
b. Si se trata de un directorio o de un fichero
c. En caso de ser un fichero, debe mostrar los siguientes datos:
i. Nombre
ii. Tamaño
iii. Permisos de lectura y escritura */
import java.io.File;
public class ficheros {
    public static void main(String[] args) {
        //verificar si hay ruta como arg7umento
        if(args.length == 0){
            System.out.println("Por favor, proporciona la ruta");
            return;
        }

        //obtiene la ruta que pasa el usuario
        String ruta = args[0];
        //crea un objeto file con la ruta
        File archivo = new File(ruta);

        //verifica si el archivo existe
        if(!archivo.exists()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("Es un archivo");
        }
        //si es fichero muestra nombre tamaño y permisos
        System.out.println("Nombre: "+archivo.getName());
        System.out.println("Tamaño: "+archivo.length()+" bytes");
        System.out.println("Permisos de lectura: "+ (archivo.canRead() ? "Si" : "No"));
        System.out.println("Permisos de escruta: "+ (archivo.canWrite() ? "Si" : "No"));
    }
}
