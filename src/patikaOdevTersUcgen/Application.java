package patikaOdevTersUcgen;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int number = sc.nextInt();
		
		// i 'yi sıfır'dan baslat girdigimiz sayiya kadar birbir arttır.
		for(int i = 0; i < number; i++) {
			for(int j = 0 ; j <= i; j++) { // j'yi sıfır'dan baslat i'ye kucuk esit olana kadar birbir arttır.
				System.out.print(" "); // her arttırmada bosluk bas
			}
			// k'yi girdigimiz sayinin 2 katindan bir eksik olacak sekilde baslat ve i'nin iki katının bir fazlasına esit olana kadar tek tek azalt.
			for(int k = 2 * number - 1;  k >= (2 * i + 1); k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
