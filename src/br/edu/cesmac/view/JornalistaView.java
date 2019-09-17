package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.model.Jornalista;

public class JornalistaView {
	
	BufferedReader buffReader;
	
	public JornalistaView() {
		buffReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public Jornalista ler() throws NumberFormatException, IOException {
		Jornalista jornalista = new Jornalista();
		
		System.out.println("Dados da Jornalista");
		System.out.println("Código: ");
		jornalista.setIdJornalista(Integer.parseInt(buffReader.readLine()));
		System.out.println("Nome: ");
		jornalista.setNome(buffReader.readLine());		
		
		return jornalista;
	}
	
	public int lerIdJornalista() throws NumberFormatException, IOException {
		System.out.println("Dados da Jornalista para Excluir");
		System.out.println("Código: ");

		return Integer.parseInt(buffReader.readLine());
	}		

}
