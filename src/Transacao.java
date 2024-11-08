
public class Transacao {

	private String tipo;
	private double valor;
	private double saldoAposTransacao;
	
	public Transacao(String tipo, double valor, double saldoAposTransacao) {
		this.tipo = tipo;
		this.valor = valor;
		this.saldoAposTransacao = saldoAposTransacao;
	}
	
	@Override
	public String toString() {
		return String.format("Tipo: %s | Valor: %.2f | Saldo após transação: %.2f", tipo, valor, saldoAposTransacao);
	}
}
