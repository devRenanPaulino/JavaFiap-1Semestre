package conta;

public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta("Renan", 123);
		System.out.println("Titular: " + c1.getNomeCliente());
		System.out.println("Conta: " + c1.getNumeroConta());
		System.out.println("Saldo: " + c1.getSaldo());
		c1.depositar(1000);
		System.out.println("Saldo: " + c1.getSaldo());
		
		System.out.println("==========================");
		
		Conta c2 = new Conta("Olívia", 456);
		System.out.println("Titular: " + c2.getNomeCliente());
		System.out.println("Conta: " + c2.getNumeroConta());
		System.out.println("Saldo: " + c2.getSaldo());
		
		c1.transferir(c2, 500);
		
		System.out.println("Titular: " + c2.getNomeCliente());
		System.out.println("Saldo: " + c2.getSaldo());
		
		System.out.println("Titular: " + c1.getNomeCliente());
		System.out.println("Saldo: " + c1.getSaldo());
	}
}
