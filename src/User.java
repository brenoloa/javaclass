public class User extends Banco{

    public User(int conta, String nome) {
        super(conta, nome);
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Num Conta: " + this.getConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Situação da conta: " + this.getStatus());
    }
    
}
