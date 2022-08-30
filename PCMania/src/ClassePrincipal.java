import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        Computador[] computadors = new Computador[100];

        Scanner cin = new Scanner(System.in);
        Cliente client = new Cliente("Jose", 1318);

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen Drive" , 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen Drive" , 32  );
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo" , 1000);

        Computador comp1=new Computador("Positivo", 1300, "Linux" , 32, "Pentium Core i3 1200Mhz" , 4, memoriaUSB1 );
        Computador comp2=new Computador("Acer", 1800, "Windows" , 64, "Pentium Core i5 2260Mhz" , 8, memoriaUSB2);
        Computador comp3=new Computador("Vaio", 2800, "Windows" , 64, "Pentium Core i7 3500Mhz" , 16, memoriaUSB3 );

        comp1.mostraPCConfigs();
        comp2.mostraPCConfigs();
        comp3.mostraPCConfigs();

        comp1 = computadors[0];
        comp2 = computadors[1];
        comp3 = computadors[2];

        boolean flag=true;

        while(flag) {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de compras!");
            System.out.println("1 - Produto 1");
            System.out.println("2 - Produto 2");
            System.out.println("3 - Produto 3");
            System.out.println("0 - Sair do menu ");

            int op = cin.nextInt();
            switch (op) {

                case 1:
                    client.pc1++;
                    break;
                case 2:
                    client.pc2++;
                    break;
                case 3:
                    client.pc3++;
                    break;
                case 0:
                    flag = false;
                    System.out.println("Voce saiu do menu!");
                    break;
                default:
                    System.out.println("DIGITE UM VALOR VALIDO");
                    break;

            }


        }

        System.out.println("Nome do cliente: " + client.nome);
        System.out.println("cpf do cliente: " + client.cpf);
        if(client.pc1 > 0 )
        {
            System.out.println( client.nome+" comprou " + client.pc1 + " do PC 1");
        }
        if(client.pc2 > 0 )
        {
            System.out.println(client.nome +" comprou " + client.pc2 + " do PC 1");
        }
        if(client.pc2 > 0 )
        {
            System.out.println( client.nome +" comprou " + client.pc2 + " do PC 1");
        }


        float valor = client.calculaTotalCompra();
        System.out.println("Total da pagar de R$ " +valor);

    } }

0
