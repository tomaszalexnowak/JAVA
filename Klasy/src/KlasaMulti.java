public class KlasaMulti {
	int a, b;
	String w;
	KlasaMulti(){
		System.out.println("Jestem golasem");
	}
	KlasaMulti(int i, int j){
		a = i * j;
		b = i - j;
	}
	KlasaMulti(String w){
		this.w = w;
	}
}
