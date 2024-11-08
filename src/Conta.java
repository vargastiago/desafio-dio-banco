import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected List<Transacao> historicoTransacoes = new ArrayList<>();
	
	public Conta(Cliente cliente) {
		agencia = AGENCIA_PADRAO;
		numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		saldo -= valor;
		historicoTransacoes.add(new Transacao("Saque", valor, saldo));
	}

	public void depositar(double valor) {
		saldo += valor;
		historicoTransacoes.add(new Transacao("Depósito", valor, saldo));
	}

	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		historicoTransacoes.add(new Transacao("Transferência", valor, saldo));
	}
	
	protected void imprimirInfo() {
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("Agência: %d\n", agencia);
		System.out.printf("Conta: %d\n", numero);
		System.out.printf("Saldo: %.2f\n", saldo);
	}
	
	protected void imprimirHistorico() {
		System.out.println("Histórico de Transações:");
		for (Transacao transacao : historicoTransacoes) {
			System.out.println(transacao);
		}
	}
	
	abstract void imprimirExtrato();
}
