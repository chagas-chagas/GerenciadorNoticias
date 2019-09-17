package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerenciadorView {

	BufferedReader buffReader;
	
	public GerenciadorView() {
		this.buffReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int montarMenuPrincipal() throws IOException {
		System.out.println("==== MENU PRINCIPAL ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Editorias");
		System.out.println("2 - Jornalistas");
		System.out.println("3 - Notícias");
		System.out.println("4 - Sair");
		System.out.println("Informe a sua opção: ");
		
		return Integer.parseInt(buffReader.readLine());
	}

	public int montarMenuEditoria() throws IOException {
		System.out.println("==== EDITORIAS ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Listar");
		System.out.println("5 - Sair");
		System.out.println("Informe a sua opção: ");

		return Integer.parseInt(buffReader.readLine());
	}
	
	public int montarMenuJornalista() throws IOException {
		System.out.println("==== JORNALISTAS ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Listar");
		System.out.println("5 - Sair");
		System.out.println("Informe a sua opção: ");

		return Integer.parseInt(buffReader.readLine());
	}
	
	public int montarMenuNoticia() throws IOException {
		System.out.println("==== NOTÍCIAS ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Listar");
		System.out.println("5 - Sair");
		System.out.println("Informe a sua opção: ");

		return Integer.parseInt(buffReader.readLine());
	}	

}
