package repositorio;

public class Brinquedo extends Produto {

	String tipo;
	int idade;

	String[] listaBonecos = { "Ben 10", "Max Steel", "SuperMan" };
	String[] listaCarros = { "Caminhões", "Carrinhos HotWheels", "Automóvel rural" };
	String[] listaBonecas = { "Barbie", "Polly Pocket", "My Little Poney" };



	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
