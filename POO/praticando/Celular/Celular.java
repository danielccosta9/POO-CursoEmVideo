package POO.praticando.Celular;

public class Celular {
    //Início dos atributos do Celular
    String marca;
    String modelo;
    String cor;
    int mesUso;
    boolean ligado;
    //Fim dos atributos do celular

    //Início dos metodos
    void status(){
        System.out.println("A cor do celular é: " + this.cor);
        System.out.println("O modelo do celular é: " + this.modelo);
        System.out.println("A marca do celular é: " + this.marca);
        System.out.println("A cor do celular é: " + this.cor);
        System.out.println("O tempo de uso dele em meses é: (" + this.mesUso + " meses)");
    }

    void ligado(){
        this.ligado = true;
    }

    void desligado(){
        this.ligado = false;
    }

    void mensagem(){
        if(this.ligado == false) {
            System.out.println("[ERRO!!] Não posso enviar mensagem, celular desligado");
        } else {
            System.out.println("Mandando mensagem para o sistema.");
        }
    }

    void uso() {
        if(this.mesUso >= 12) {
            System.out.println("O seu celular tem mais de 1 ano de uso.");
        } else {
            System.out.println("O seu celular tem menos de 1 ano de uso.");
        }
    }
}
