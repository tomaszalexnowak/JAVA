import java.util.Scanner;

public class UczenSzkolyAdvanced extends Ucze�Klasy {
	Scanner dzienniczek = new Scanner(System.in);
	void Ustaw_Imie()
	{
		System.out.print("Witaj, podaj imi� ucznia: ");
		String imie = dzienniczek.nextLine();
		this.imie = imie;
	}
	void Ustaw_Reszte()
	{
			System.out.print("Podaj nazwisko: ");
				String nazwisko = dzienniczek.nextLine();
				this.nazwisko = nazwisko;
			System.out.print("Podaj pesel: ");
				String pesel = dzienniczek.nextLine();
				this.pesel = pesel;
			System.out.print("Podaj nazw� szko�y: ");
				String szkola = dzienniczek.nextLine();
				this.Nazwa_Szkoly = szkola;
			System.out.print("Podaj nazw� klasy: ");
				String klasa = dzienniczek.nextLine();
				this.klasa = klasa;
		dzienniczek.close();
	}
}
