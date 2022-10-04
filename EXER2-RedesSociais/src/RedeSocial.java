public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    abstract public void postarFoto();
    abstract public void postarVideo();
    abstract public void postarComentario();

    public void curtirPublicacao() {
        System.out.print("Curtiu uma publicacao ");
    }

}
