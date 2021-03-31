package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", estado = "", continuar = "S";
		int edad = 0, num_part = 0, aptos = 0;
		
		
		while(continuar.equals("S") || continuar.equals("s")) {
			num_part ++;
			
			System.out.println("===========================");
			System.out.println("Registro " + num_part + ": ");
			System.out.println("===========================");
			
			System.out.print("Nombre del particpante: ");
			nombre = sc.nextLine();
			System.out.print("Edad del participante: ");
			edad = sc.nextInt();
			
			// Reinicio de la lectura del texto.
			sc.nextLine();
			
			if(edad < 18)
				estado = "Menor de edad";
			else {
				estado = "Apto para votar";
				aptos ++;
			}
				
			System.out.print("Estado del participante: " + estado);
			System.out.println();
			System.out.println("¿Desea continuar con otro participante? <S/N>");
			continuar = sc.nextLine();
			
		}
		System.out.println("===========================");
		System.out.println("       R E S U M E N       ");
		System.out.println("===========================");
		System.out.println("Cantidad de participantes: " + num_part);
		System.out.println("Cantidad de aptos para votar: " + aptos );
		
		
	
		

	}

}