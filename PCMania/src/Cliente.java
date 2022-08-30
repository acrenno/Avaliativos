public class Cliente
{
    public String nome;
    public long cpf;

    Computador[] computadors = new Computador[100];

    MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive" , 16);
    MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive" , 32  );
    MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo" , 1000);

    Computador comp1=new Computador("Positivo", 1300, "Linux" , 32, "Pentium Core i3 1200Mhz" , 4, memoriaUSB1 );
    Computador comp2=new Computador("Acer", 1800, "Windows" , 64, "Pentium Core i5 2260Mhz" , 8, memoriaUSB2);
    Computador comp3=new Computador("Vaio", 2800, "Windows" , 64, "Pentium Core i7 3500Mhz" , 16, memoriaUSB3 );

    int pc1=0;
    int pc2=0;
    int pc3=0;

    public Cliente(String nome, long cpf)
    {
        this.nome=nome;
        this.cpf=cpf;
    }

    public float calculaTotalCompra()
   {
       float soma;

       soma = pc1 * comp1.preco + pc2 * comp2.preco + pc3 * comp3.preco;

       return soma;
   }

    }


