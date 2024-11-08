
public class ContaCorrente extends Conta {
	
	private static final double TAXA_MENSAL = 10.0;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void cobrarTaxaMensal() {
		if (saldo >= TAXA_MENSAL) {
			sacar(TAXA_MENSAL);
			System.out.println("Taxa mensal de %.2f cobrada.\n");
		} else {
			System.out.println("Saldo insuficiente para a cobrança de taxa mensal.");
		}
	}

	@Override
	void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		imprimirInfo();
		imprimirHistorico();
	}

}
