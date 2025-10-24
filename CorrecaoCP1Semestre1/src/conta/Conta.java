package conta;

public class Conta {
	private String nomeCliente;
	private int numeroConta;
	private double saldo;
	
	public Conta(String nomeCliente, int numeroConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldo = 0;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Não é possivel realizar o deposito de um valor negativo!");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo indisponível ou valor inválido");
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		
		if (contaDestino != null && valor > 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("A transferência NÃO foi realizada!");
		}
		
	}
	
	
}
