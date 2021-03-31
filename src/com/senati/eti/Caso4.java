package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0, i = 1, num_mayor = 0;
		
		while(i <= 4) {
			
			System.out.print("Ingrese número " + i + ": ");
			int numero = sc.nextInt();
			
			if (numero > num_mayor) num_mayor = numero;
			
			i++;
		}
		
		System.out.println("El número mayor es " + num_mayor);
		

	}

}