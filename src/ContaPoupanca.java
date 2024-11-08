
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		imprimirInfo();
		imprimirHistorico();
	}

}
