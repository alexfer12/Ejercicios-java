package POO4;
import java.util.ArrayList;
import java.util.List;
public class Administradores extends Usuario {
    int numeroPostsEliminados;
    private List<String> emailsBaneados;

    public Administradores(int numeroMensajes, String correoElectronico, String nombreForo) {
        super(numeroMensajes, correoElectronico, nombreForo);
         numeroPostsEliminados = 0;
        emailsBaneados = new ArrayList<>();
    }
     // Constructor de Administrador que toma un objeto Usuario como parámetro
    public Administradores(Usuario usuario) {
        super(usuario.numeroMensajes, usuario.correoElectronico, usuario.nombreForo);
        numeroPostsEliminados = 0;
        emailsBaneados = new ArrayList<>();
    }
    // Método para cambiar el nombre del foro
    public void cambiarNombreForo(String nuevoNombre) {
        nombreForo = nuevoNombre;
    }

    // Método para incrementar el número de mensajes eliminados
    public void incrementarMensajesEliminados() {
        numeroPostsEliminados++;
    }

    // Método para añadir un email baneado a la lista
    public void añadirEmailBaneado(String email) {
        if (!emailsBaneados.contains(email)) {
            emailsBaneados.add(email);
        }
    }

    // Método para obtener el número de baneos en la lista
    public int obtenerNumeroBaneos() {
        return emailsBaneados.size();
    }

    // Método para mostrar uno a uno los emails de las personas baneadas
    public void mostrarEmailsBaneados() {
        for (String email : emailsBaneados) {
            System.out.println(email);
        }
    }
}
