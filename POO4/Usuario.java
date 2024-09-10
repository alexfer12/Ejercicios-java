package POO4;

public class Usuario {
    int numeroMensajes;
    String correoElectronico;
    String nombreForo;
    
    //Constructor
    public Usuario(int numeroMensajes, String correoElectronico, String nombreForo){
        this.numeroMensajes = numeroMensajes;
        this.correoElectronico = correoElectronico;
        this.nombreForo = nombreForo;
    }
    //GETTER Y SETTER
    public int getNumeroMensajes() {
        return numeroMensajes;
    }
    public void setNumeroMensajes(int numeroMensajes) {
        this.numeroMensajes = numeroMensajes;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getNombreForo() {
        return nombreForo;
    }
    public void setNombreForo(String nombreForo) {
        this.nombreForo = nombreForo;
    }
    //metodo incrementar num mensajes
    public void incremetarMensajes(){
        numeroMensajes++;
    }
    //metodo decrementar
    public void decrementarMensajes(){
        numeroMensajes--;
    }
    //metodo modificar correo electronico
    public void modificarCorreo(String nuevoCorreo){
        correoElectronico = nuevoCorreo;
    }

    void incrementarMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
