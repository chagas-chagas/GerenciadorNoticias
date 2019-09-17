package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Editoria;

public class ManipuladorEditoria {
	ArrayList<Editoria> editorias = new ArrayList<Editoria>();

	public void cadastrar(Editoria editoria) {
		this.editorias.add(editoria);
	}

	public void alterar(Editoria editoria) {
		for (Editoria e : editorias) {
			if (e.getIdEditoria() == editoria.getIdEditoria()) {
				this.editorias.set(this.editorias.indexOf(e), editoria);
				break;
			}
		}
	}

	public void excluir(Editoria editoria) {
		this.editorias.remove(editoria);
	}

	public void listar() {
		System.out.println("\n===============Editorias Cadatradas ===============");

		for(Editoria editoria : editorias) {
			System.out.println("Código " + editoria.getIdEditoria() + " - " + editoria.getNome());
		}
		
		System.out.println("=================================================== \n");
	}

	public List<Editoria> getEditorias() {
		return this.getEditorias();
	}
	
	public Editoria getEditoriaById(int idEditoria) {
		Editoria editoria = null;
		for (Editoria e : editorias) {
			if (e.getIdEditoria() == idEditoria) {
				editoria = e;
			}
		}
		
		return editoria;
	}	

}
