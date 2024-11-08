import java.util.ArrayList;
import java.util.List;

public class Gerente {

	private String nome;
	private List<Cliente> clientesResponsaveis = new ArrayList<>();

	public Gerente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Cliente> getClientesResponsaveis() {
		return clientesResponsaveis;
	}

	public void adicionarCliente(Cliente cliente) {
		clientesResponsaveis.add(cliente);
	}
}
