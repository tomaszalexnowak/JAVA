public class Test_klas {

	public static void main(String[] args) {
		// string testowy
		String test = "Ala ma kota";
		// Pusta klasa, bez parametrów i konstruktora
		System.out.println("Pusta klasa: ");
		KlasaBazowa klasaBazowa = new KlasaBazowa();
		
		// Prosta klasa z konstruktorem
		KlasaRozszerzona kr1 = new KlasaRozszerzona(5);
		KlasaRozszerzona kr2 = new KlasaRozszerzona(10);
		
		// Klasa z wieloma konstruktorami
		System.out.print("Klasa z wieloma konstruktorami, ale bez parametrów: ");
		KlasaMulti pusta = new KlasaMulti();
		KlasaMulti tekst = new KlasaMulti(test);
		KlasaMulti multi = new KlasaMulti(5,3);
				
		// Wyniki dla klasy z jednym konstruktorem
		System.out.println("Klasa z jednym konstruktorem: " + kr1.x);
		System.out.println("Klasa z jednym konstruktorem: " + kr2.x);
		
		// Wyniki dla klas z wieloma konstruktorami
		System.out.println("Klasa z wieloma konstruktorami, ale bez tekstu: " + multi.a);
		System.out.println("Klasa z wieloma konstruktorami, ale bez tekstu: " + multi.b);
		System.out.println("Klasa z wieloma konstruktorami, ale bez tekstu: " + multi.w);
		System.out.println("Klasa z wieloma konstruktorami, ale bez liczb: " + tekst.a);
		System.out.println("Klasa z wieloma konstruktorami, ale bez liczb: " + tekst.w);
		
		KlasaStatyczna statyk = new KlasaStatyczna(2,3);
		System.out.println(statyk.x);
		KlasaStatyczna statyk2 = new KlasaStatyczna(2,3,5);
		System.out.println(statyk2.x);
		KlasaStatyczna statyk3 = new KlasaStatyczna(7,8);
		System.out.println(statyk3.x);

	}

}
