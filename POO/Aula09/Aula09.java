package POO.Aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Daniel", 21, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Apredendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciante", "Pedro Paulo", 250, p[0]);
        l[2] = new Livro("POO em 30 Dias", "Desconhecido", 320, p[1]);

        l[0].abrir();
        l[0].folhear(320);
        System.out.println(l[0].detalhes());
    }
}
