package POO.praticando.Celular;

public class Aula02 {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Motorola";
        c1.modelo = "OneFusion";
        c1.cor = "Azul";
        c1.mesUso = 4;
        c1.status();
        c1.ligado();
        c1.mensagem();
        c1.uso();
    }
    
}
