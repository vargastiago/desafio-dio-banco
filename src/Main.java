
public class Main {

	public static void main(String[] args) {
		// Cria conta corrente para a cliente Maria
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria");
		Conta cc = new ContaCorrente(cliente1);

//		Cria conta poupança para o cliente João
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João");
		Conta poupanca = new ContaPoupanca(cliente2);

		// Operações
		cc.depositar(100.00);
		((ContaCorrente) cc).cobrarTaxaMensal();
		cc.transferir(50, poupanca);

		// Imprimir extratos com histórico de transações
		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
	}

}
