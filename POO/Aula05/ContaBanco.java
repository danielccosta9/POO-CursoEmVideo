package POO.Aula05;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    
    // Metodos Getteres e Setteres
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    

    // Metodos
    public void estatusAtual(){
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-----------------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC"){
            this.saldo = 50;
        }
        else if(t == "CP"){
            this.saldo = 150;
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada porque ainda tem dinheiro");
        }
        else if (this.getSaldo() < 0){
            System.out.println("Conta nao pode ser fechada pois tem debito");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizadi com sucesso na conta de " + this.getDono());
            }
            else{
                System.out.println("Saldo insuficente para saque");
            }
        }
        else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (tipo == "CC"){
            v = 12;
        }
        else if (tipo == "CP"){
            v = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }
        else{
            System.out.println("Impossivel pagar uma conta fechada!");
        }
    }

    // Metodo Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
}