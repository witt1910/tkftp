package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import activities.CartaoDeEnfrentamento;
import activities.PlanilhaDeAtividadesSemanais;
import activities.RegistroDePensamentos;
import doa.DoaFactory;

public class IAlex {

	List<PlanilhaDeAtividadesSemanais> plaAtv = new ArrayList<>();
	List<RegistroDePensamentos> regPen = new ArrayList<>();
	
	public void apresentacao() {
		System.out.println("Ola, me chamo Alex.");
		System.out.println("Estou aqui para trabalharmos juntos e mudarmos");
		System.out.println("comportamentos, humor e pensamentos.");
		System.out.println("Para isso, nos basearemos na Psicologia Cognitivo-Comportamental,");
		System.out.println("que tem como objetivo a solução de problemas atuais,");
		System.out.println("modificação de comportamentos disfuncionais");
		System.out.println("e a melhoria da qualidade de vida.");
		System.out.println();
	}
	
	public void menuPrincipal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Opções:");
		System.out.println("1. Criar novo Cartão de Enfrentamento;");
		System.out.println("2. Criar nova Planilha de Atividades;");
		System.out.println("3. Criar novo Registro de Pensamentos;");
		if (!plaAtv.isEmpty()) {
			System.out.println("4. Acessar Planilha de Atividades;");
		} 
		if (!regPen.isEmpty()) {
			System.out.println("5. Acessar Registro de Pensamentos;");
		}
		System.out.println();
		System.out.println("6. Sair;");
		System.out.print("Digite a sua opção: ");
		int op = sc.nextInt();
		switch(op) {
			case 1:
				CartaoDeEnfrentamento cartEnfr = DoaFactory.novoCartaoDeEnfrentamento();
				System.out.println(cartEnfr.ok());
				break;
			case 2:
				PlanilhaDeAtividadesSemanais plaAtv = DoaFactory.novaPlanilhaDeAtividades();
				System.out.println(plaAtv.ok());
				break;
			case 3:
				RegistroDePensamentos regPen = DoaFactory.novoRegistroDePensamentos();
				System.out.println(regPen.ok());
				break;
				
		}
				
	}

}
