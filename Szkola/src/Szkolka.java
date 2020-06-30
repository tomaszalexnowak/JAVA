
public class Szkolka {

	public static void main(String[] args) {
		Uczen podstawowy = new Uczen();

		podstawowy.imie = "Tomasz";
		podstawowy.nazwisko = "Tester";
		podstawowy.pesel = "0700800900";
		
		System.out.println(podstawowy.imie + " " + podstawowy.nazwisko + " " + podstawowy.pesel);
		
		UczenSzkoly gimnazjalista = new UczenSzkoly();
		
		gimnazjalista.imie = "Je¿";
		gimnazjalista.nazwisko = "Jezzy";
		gimnazjalista.pesel = "123456787";			//	<-	Fun fact: jeden z administratorów
		gimnazjalista.Nazwa_Szkoly = "Superaœna"; 	//		w Rene uwa¿a to za
													//		za has³o nie do z³amania,
		System.out.println(gimnazjalista.imie + " "	//		bo nikt nie ma takich umiejêtnoœci
		+ gimnazjalista.nazwisko + " "				//		w okolicy
		+ gimnazjalista.pesel + " "
		+ gimnazjalista.Nazwa_Szkoly);
		
		UczeñKlasy licealista = new UczeñKlasy();
		
		licealista.imie = "Pan";
		licealista.nazwisko = "Jan";
		licealista.pesel = "90090990009";
		licealista.Nazwa_Szkoly = "Prywatna";
		licealista.klasa = "A++, jak w lodówkach";
		
		System.out.println(licealista.imie + " "
		+ licealista.nazwisko + " "
		+ licealista.pesel + " "
		+ licealista.Nazwa_Szkoly + " "
		+ licealista.klasa);
	}

}
