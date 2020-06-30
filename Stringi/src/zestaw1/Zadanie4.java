package zestaw1;

import java.util.Scanner;

public class Zadanie4 {

	public static void main(String[] args) {
		Scanner wpisywacz = new Scanner(System.in);
		System.out.println("Podaj zdanie z liczbami");
		String zdanie = wpisywacz.nextLine();
		
		int suma = 0;
		
		for(int i = 0; i < zdanie.length(); i++)
		{
			if(Character.isDigit(zdanie.charAt(i)))
			{
				suma = suma + Integer.parseInt(zdanie.charAt(i) + "");
			}
		}		
		System.out.print(suma);
	}
}