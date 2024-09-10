public abstract class Banco implements Design{
    private int conta;
    private double saldo;
    private boolean status;
    private String nome;

    public Banco(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
        this.status = true;
        this.saldo = 0;
    }

    @Override
    public void depositar(double x) {
        this.saldo =+ x;

    
    }

    @Override
    public void sacar(double y) {
        this.saldo -= y;
    
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    

}
