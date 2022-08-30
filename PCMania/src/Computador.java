public class Computador {
    public String marca;
    public float preco;
    MemoriaUSB memousb;
    SistemaOperacional so;
    HardwareBasico hb;

    public Computador(String marca, float preco, String nomesop, int tiposop, String nomehard, float capahard, MemoriaUSB memousb)
    {
        this.marca=marca;
        this.preco=preco;
        this.memousb=memousb;


        so=new SistemaOperacional(nomesop, tiposop);
        hb=new HardwareBasico(nomehard, capahard);
    }

    void mostraPCConfigs()
    {

        System.out.println("Marca do PC: " +this.marca);
        System.out.println("Preco do PC: "+this.preco);
        System.out.println("Sistema Operacional: " +this.so.nome);
        System.out.println("Tipo do Sistema Operacional: " +this.so.tipo);
        System.out.println("Hardware Basico: " +this.hb.nome);
        System.out.println("Capacidade do Hardware Basico: " +this.hb.capacidade);
       addMemoriaUSB(this.memousb);

        System.out.println("================================");
    }

    void addMemoriaUSB(MemoriaUSB memoriaUSB)
    {
        System.out.println("O PC acompanha um " + memoriaUSB.nome + " de capacidade " + memoriaUSB.capacidade + "Gb");
    }

}
