package POO4;

public class Entrada {
    public static void main (String[] args) {
        // Crear un objeto Usuario
        Usuario usuario = new Usuario(10, "usuario@example.com", "Usuario1");

        // Incrementar el número de mensajes del usuario
        usuario.incrementarMensajes();

        // Mostrar información del usuario
        System.out.println("Usuario:");
        System.out.println("Mensajes: " + usuario.numeroMensajes);
        System.out.println("Correo electrónico: " + usuario.correoElectronico);
        System.out.println("Nombre de foro: " + usuario.nombreForo);
        System.out.println();     

        // Crear un objeto Moderador
        Moderador moderador = new Moderador(5, "moderador@example.com", "Moderador1");

        // Incrementar el número de mensajes del moderador
        moderador.incrementarMensajes();

        // Incrementar el número de mensajes eliminados del moderador
        moderador.incrementarMensajesEliminados();

        // Mostrar información del moderador
        System.out.println("Moderador:");
        System.out.println("Mensajes: " + moderador.numeroMensajes);
        System.out.println("Correo electrónico: " + moderador.correoElectronico);
        System.out.println("Nombre de foro: " + moderador.nombreForo);
        System.out.println("Mensajes eliminados: " + moderador.numeroPostsEliminados);
        System.out.println();

        // Crear un objeto Administrador
        Administradores administrador = new Administradores(20, "admin@example.com", "Admin1");

        // Incrementar el número de mensajes del administrador
        administrador.incrementarMensajes();

        // Incrementar el número de mensajes eliminados del administrador
        administrador.incrementarMensajesEliminados();

        // Añadir un email baneado a la lista del administrador
        administrador.añadirEmailBaneado("usuario@example.com");
        administrador.añadirEmailBaneado("otro@example.com");

        // Mostrar información del administrador
        System.out.println("Administrador:");
        System.out.println("Mensajes: " + administrador.numeroMensajes);
        System.out.println("Correo electrónico: " + administrador.correoElectronico);
        System.out.println("Nombre de foro: " + administrador.nombreForo);
        System.out.println("Mensajes eliminados: " + administrador.numeroPostsEliminados);
        System.out.println("Número de baneos: " + administrador.obtenerNumeroBaneos());
        System.out.println("Emails baneados:");
        administrador.mostrarEmailsBaneados();
    }
}
