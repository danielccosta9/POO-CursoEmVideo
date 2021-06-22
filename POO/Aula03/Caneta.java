package POO.Aula03;

public class Caneta {
    //Inicio dos atributos da Caneta
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    //Fim dos atributos

    //Inicio dos metodos
    void status() {
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A caneta está tampada? " + this.tampada);
        System.out.println("O modelo da caneta é: " + this.modelo);
        System.out.println("A ponta é: " + this.ponta);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("[ERRO!!] Não posso rabiscar!");
        } else{
            System.out.println("Estou Rabiscando!");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
    //Fim dos metodos
}
