package POO.Aula06;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metodo Contrutor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Getteres e Setteres
    private int getVolume() {
        return this.volume;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    // Importados do Controlador
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("------- MENU ------");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());

            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        }
        else{
            System.out.println("Impossivel mostrar Menu");
        }

    }

    @Override
    public void fecharMenu() {
        if (this.getLigado()){
            System.out.println("Fechando Menu...");
        }
        else{
            System.out.println("Impossivel fechar Menu");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
        else{
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && (this.getTocando())) {
            this.setTocando(false);
        } else {
            System.out.println("Nao consegui pausar");
        }
    }
}
