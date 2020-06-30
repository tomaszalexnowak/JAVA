package zestaw1;

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		Scanner wczytacz = new Scanner(System.in);
		System.out.print("Podaj wyraz do odwrocenia: ");
		String do_odwrocenia = wczytacz.next();
		StringBuilder tekst = new StringBuilder(do_odwrocenia);
		System.out.println(tekst.reverse());
	}

}
