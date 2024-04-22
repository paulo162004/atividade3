package principal;

import java.util.ArrayList;

import funcao.Funcao;
import model.People;

public class Principal {

	public static void main(String[] args) {
		Funcao funcao = new Funcao();
		ArrayList<People> pessoas = new ArrayList<>();
		
		funcao.receberUsuario();
		funcao.printUser();
		funcao.relatorio(pessoas);
	}
	
}
