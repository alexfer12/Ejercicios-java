package POO4;

public class Moderador extends Usuario{
    int numeroPostsEliminados;
    public Moderador(int numeroMensajes, String correoElectronico, String nombreForo) {
        super(numeroMensajes, correoElectronico, nombreForo);
        numeroPostsEliminados = 0;
    }
    //Incrementar mensajes
    public void incrementarMensajesEliminados(){
        setNumeroPostsEliminados(getNumeroPostsEliminados() + 1);
    }

    /**
     * @return the numeroPostsEliminados
     */
    public int getNumeroPostsEliminados() {
        return numeroPostsEliminados;
    }

    /**
     * @param numeroPostsEliminados the numeroPostsEliminados to set
     */
    public void setNumeroPostsEliminados(int numeroPostsEliminados) {
        this.numeroPostsEliminados = numeroPostsEliminados;
    }

    void incrementarMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
