public class MainClass {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Jose", "jose@inatel.br");

        Facebook facebook1 = new Facebook("fb1234", 500);
        GooglePlus googlePlus1 = new GooglePlus("gp1234", 10);
        Twitter twitter1 = new Twitter("tt1234", 100);
        Instagram instagram1 = new Instagram("ins1234", 800);

        System.out.println("--------------------------------------------");
        System.out.println("Nome do usuario: " + usuario1.getNome());
        System.out.println("Email do usuario: " + usuario1.getEmail());
        System.out.println("-------------------------------------------");

        usuario1.Usuario(facebook1);
        usuario1.Usuario(googlePlus1);
        usuario1.Usuario(twitter1);
        usuario1.Usuario(instagram1);

        for (int i = 0; i < usuario1.redeSocial.length; i++) {
            if (usuario1.redeSocial[i] != null) {
                if (usuario1.redeSocial[i] instanceof Facebook) {
                    Facebook fb = (Facebook) usuario1.redeSocial[i];
                    fb.compartilhar();
                    fb.postarFoto();
                    fb.fazStreaming();
                    System.out.println("--------------------------");

                }
                else if (usuario1.redeSocial[i] instanceof GooglePlus) {
                    GooglePlus gp = (GooglePlus) usuario1.redeSocial[i];
                    gp.compartilhar();
                    gp.fazStreaming();
                    gp.curtirPublicacao();
                    System.out.println("---------------");
                }
                else if (usuario1.redeSocial[i] instanceof Twitter) {
                    Twitter tt = (Twitter) usuario1.redeSocial[i];
                    tt.compartilhar();
                    tt.curtirPublicacao();
                    tt.postarComentario();
                    System.out.println("---------------");
                }
                else if (usuario1.redeSocial[i] instanceof Instagram) {
                    Instagram inst = (Instagram) usuario1.redeSocial[i];
                   inst.postarComentario();
                   inst.postarVideo();
                   inst.postarFoto();
                    System.out.println("---------------");
                }
                }
            }
        }
    }

