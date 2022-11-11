package entidades;

public class Conta {

	private int numero;
	private String nome;
	private double saldo;

	// contrutor com numero e nome
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		
	}
	// construtor com numero, nome e deposito inicial
	public Conta(int numero, String nome, double inicialValor) {
		
		this.numero = numero;
		this.nome = nome;
		depositar(inicialValor);
		
		}
	
	// get  de numero 
	public int getNumero() {
		
		return numero;
	}
	
	// get nome
	
	public String getNome() {
		
		return nome;
	}
	
	// set nome 
	
	public void setNome(String nome ) {
		
		this.nome = nome;
	}
	
	// get saldo 
	
	public double getSaldo() {
		
		return saldo;
	}
	
	// método depositar
	public void depositar(double valor) {
		
		saldo += valor;
	}
	// metodo para sacar 
	public void sacar(double valor) {
		
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		
		return "Conta: " 
		+       numero 
		+       " Nome: " 
		+       nome 
		+       ", Saldo: $ " 
		+       saldo;
	}

}
