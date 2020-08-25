package application;

import services.IAlex;

public class Program {

	public static void main(String[] args) {
		
		IAlex alex = new IAlex();
		
		alex.apresentacao();
		alex.menuPrincipal();
		
	}

}
