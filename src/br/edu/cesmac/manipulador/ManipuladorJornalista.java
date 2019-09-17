package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Jornalista;

public class ManipuladorJornalista {

	ArrayList<Jornalista> jornalistas = new ArrayList<Jornalista>();

	public void cadastrar(Jornalista jornalista) {
		this.jornalistas.add(jornalista);
	}

	public void alterar(Jornalista jornalista) {
		for (Jornalista j : jornalistas) {
			if (j.getIdJornalista() == jornalista.getIdJornalista()) {
				this.jornalistas.set(this.jornalistas.indexOf(j), jornalista);
				break;
			}
		}
	}

	public void excluir(Jornalista jornalista) {
		this.jornalistas.remove(jornalista);
	}

	public void listar() {
		System.out.println("\n===============Jornalistas Cadatradas ===============");

		for(Jornalista jornalista : jornalistas) {
			System.out.println("Código " + jornalista.getIdJornalista() + " - " + jornalista.getNome());
		}
		
		System.out.println("=================================================== \n");
	}

	public List<Jornalista> getJornalistas() {
		return this.getJornalistas();
	}
	
	public Jornalista getJornalistaById(int idJornalista) {
		Jornalista jornalista = null;
		for (Jornalista j : jornalistas) {
			if (j.getIdJornalista() == idJornalista) {
				jornalista = j;
			}
		}
		
		return jornalista;
	}	
	
}
