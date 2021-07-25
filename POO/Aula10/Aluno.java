package POO.Aula10;

public class Aluno extends Pessoa{
    // Atributos
    private int matr;
    private String curso;

    // Metodos Especiais
    public int getMatr(){
        return matr;
    }
    public String getCurso(){
        return curso;
    }

    public void setMatr(int matr){
        this.matr = matr;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    // Metodos
    public void cancelarMatr(){
        System.out.println("Matricula sera cancelada.");
    }
}
