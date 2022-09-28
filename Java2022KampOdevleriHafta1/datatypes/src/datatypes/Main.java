package datatypes;

public class Main {

	public static void main(String[] args) {
		int sayi=12;
		// sayi="Ankara"; yapamayız. "Ankara" int türünde olmadığından mümkün değil.
		//sayi=13111111111; int türünün sınırını aşamayız hata alırız.
		
		byte sayi2=12;
		//sayi2=129; yapamayız byte +127 sınırındadır. Sınırını aşar.
		
		double sayi3=12.5;
		//int sayi3= 12.5; yapamayız. int yerine double kullanabiliriz. Ondalıklı sayıları int ile tanımlayamayız.
		
		char karakter = 'A'; //Çift tırnak değil tek karakter içinde tanımlamalıyız. Tek karakter kullanırız 'AB' yapamayız.
		String sehir="ANKARA"; //Karakter topluluğudur.
		
		boolean dogruMu=false; //0 veya 1, Doğru veya Yanlış anlamı vardır. Sorgu için kullanılır. Örneğin kişi 15 yaşından büyük mü ? Gibi sorularda kullanılabilir.
	}

}
