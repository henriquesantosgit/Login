package br.edu.fatecpg.login.model;

import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel{
	private String loginC = "admin";
	private String senhaC = "1234";


	@Override
	public void login(String usuario, String senha) {
		int acesso=0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o usuário e em seguida a senha: ");
			usuario = scan.nextLine();
			senha = scan.nextLine();
			if(usuario.equals(loginC)&& senha.equals(senhaC)) {
				System.out.println("Bem-Vindo(a), "+usuario);
				System.out.println("Para sair digite 0");
				acesso = 1;
				int opSair;
				opSair = scan.nextInt();
				if(opSair==0) {
					SistemaDeSeguranca sistemaDeSeguranca = new SistemaDeSeguranca();
					sistemaDeSeguranca.logout();
				}
				
			}
			
		}while(acesso==0);
		
		
	}

	@Override
	public void logout() {
		System.out.println("Usuário Desconectado.");
		
	}

}
