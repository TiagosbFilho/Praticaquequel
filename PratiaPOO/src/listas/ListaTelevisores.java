package listas;

import java.util.ArrayList;
import java.util.List;

import repositorio.Televisores;
public class ListaTelevisores {

List<Televisores> televisores = new ArrayList<Televisores>();
	 
	
	public void addProd() {
		
		Televisores televisor = new Televisores();
		
		televisor.setCodigo(1);
		televisor.setDescricao("Couro");
		televisor.setTamanho(3);
		televisor.setPreco(20.50);
		televisor.setTecnologia("Bola");
		
		Televisores televisor1 = new Televisores();
		
		televisor.setCodigo(1);
		televisor.setDescricao("Couro");
		televisor.setTamanho(3);
		televisor.setPreco(20.50);
		televisor.setTecnologia("Bola");
		
		televisores.add(televisor);
		televisores.add(televisor1);
		
	}
	
	
	public void listaTelevisor() {
		for (Televisores televisor : televisores) {
			System.out.println("Cod:" + televisor.getCodigo());
			System.out.println("Descricao:" + televisor.getDescricao());
			System.out.println("Idade:" + televisor.getTamanho());
			System.out.println("Idade:" + televisor.getPreco());
			System.out.println("Idade:" + televisor.getTecnologia());
			
		}
	}
	
	
}

	

