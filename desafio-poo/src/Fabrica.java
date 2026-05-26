import dispositivos.Iphone;

public class Fabrica {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println();
 
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println();
        
        iphone.iniciarCorreioVoz();
        iphone.ligar();
        iphone.atender();
    }
}