package zestaw1;

import java.util.Scanner;

public class Zadanie3 {

	public static void main(String[] args) {
		Scanner podajka = new Scanner(System.in);
		System.out.println("Podaj wyraz:");
		String wyraz = podajka.nextLine();
		StringBuilder test = new StringBuilder(wyraz).reverse();
	
		if(wyraz.toLowerCase().equals(test.toString().toLowerCase()))
			{
				System.out.print(true);
			}
		else
			{
				System.out.print(false);
			}
	}

}
