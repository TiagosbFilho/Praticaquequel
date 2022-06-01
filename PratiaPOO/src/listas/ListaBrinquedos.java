package listas;

import java.util.ArrayList;
import java.util.List;

import repositorio.Brinquedo;

public class ListaBrinquedos {
	
	
	
	List<Brinquedo> brinquedos = new ArrayList<Brinquedo>();
	
	public ListaBrinquedos() {
		addProd();
	}
	 

	
	public void addProd() {
		
		Brinquedo brinquedo = new Brinquedo();
		
		brinquedo.setCodigo(1);
		brinquedo.setDescricao("Couro");
		brinquedo.setIdade(3);
		brinquedo.setPreco(50.00);
		brinquedo.setTipo("Bola");
		
		Brinquedo brinquedo1 = new Brinquedo();
		
		brinquedo1.setCodigo(2);
		brinquedo1.setDescricao("Bonita");
		brinquedo1.setIdade(10);
		brinquedo1.setPreco(200.00);
		brinquedo1.setTipo("Boneca Barbie");
		
		brinquedos.add(brinquedo);
		brinquedos.add(brinquedo1);
		
	}
	
	public void listaBrinquedo() {
		for (Brinquedo brinquedo : brinquedos) {
			System.out.print("| Cod:" + brinquedo.getCodigo());
			System.out.print(" | Brinquedo:" + brinquedo.getTipo());
			System.out.println(" | Preço:" + brinquedo.getPreco() +  "|");
			System.out.println();
		}
	}
	
	public Brinquedo getBrinquedo(int codigo) {

		for (Brinquedo brinquedo : brinquedos) {
			if (brinquedo.getCodigo() == codigo) {
				return brinquedo;
			}	
		}
		
		return new Brinquedo();
	}
	
	
	
}

