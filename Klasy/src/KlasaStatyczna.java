public class KlasaStatyczna {
	int x;
	
	KlasaStatyczna(int a, int b)
	{
		x = a + b;
	}
	
	KlasaStatyczna(int a, int b, int c){
		x = a + b + c;
	}
	
	static {
		System.out.println("Wyniki dodawania: " );
	}
}
