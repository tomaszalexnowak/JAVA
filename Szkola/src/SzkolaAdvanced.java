
public class SzkolaAdvanced {

	public static void main(String[] args) {
		UczenSzkolyAdvanced uczen = new UczenSzkolyAdvanced();
		uczen.Ustaw_Imie();
		uczen.Ustaw_Reszte();
		
		System.out.print("\nDodano nowego ucznia!"
				+ "\nImiê: " + uczen.imie
				+ "\nNazwisko: " + uczen.nazwisko
				+ "\nPesel: " + uczen.pesel
				+ "\nSzkola: " + uczen.Nazwa_Szkoly
				+ "\nKlasa: " + uczen.klasa
				+ "\nGRATULACJE!"
				);
	}

}
