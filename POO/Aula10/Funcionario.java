package POO.Aula10;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Metodos Especiais
    public String getSetor(){
        return setor;
    }
    public boolean getTrabalhando(){
        return trabalhando;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }

    // Metodos
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
}
