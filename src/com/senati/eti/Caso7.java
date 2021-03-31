package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		// for ascendente de 1 en 1
		for (int x = 1; x <= 10; x++) 
			System.out.println(x + ". Bienvenido(a) al curso " + nombre + ".");
		
		System.out.println("=================================");
		
		for (int j = 20; j >=0; j -= 2)
			System.out.println(j);
	}

}
