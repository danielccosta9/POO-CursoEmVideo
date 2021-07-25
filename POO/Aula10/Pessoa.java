package POO.Aula10;

public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;

    // Metodos Especiais
    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


    // Metodos
    public void fazerAniv(){
        this.idade ++;
    }

    // toString
    public String toString(){
        return "Pessoa{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + "}";
    }
}
