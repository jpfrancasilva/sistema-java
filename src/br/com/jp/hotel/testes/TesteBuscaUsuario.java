package br.com.jp.hotel.testes;

import br.com.jp.hotel.dao.UsuarioDAO;

public class TesteBuscaUsuario {

	public static void main(String[] args) {

		String email = "";
		String senha = "admin";

		boolean existeUsuario = new UsuarioDAO().buscaPorEmailESenha(email, senha);

		if (existeUsuario == false) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println("Usuário: ");
			System.out.println("Nome: ");
			System.out.println("Senha: ");
		}

	}

}
