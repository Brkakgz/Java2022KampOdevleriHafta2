package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		//ogrencciler[4]="Ali"; yaparsak dizimiz 4 elemanlı olabildiği için hata alırız. Yukarıdan dizi boyutunu arttırmamız gereklidir.
		
		for (int i=0;i<ogrenciler.length;i++)
			{
			System.out.println(ogrenciler[i]);
			}
		System.out.println("-------------------");
		
		//Farklı bir kullanım üstteki for ile aynıdır.
		for(String ogrenci:ogrenciler) // Öğrenciler dizisinteki tüm öğrencileri gez anlamına gelir
		{
			System.out.println(ogrenci);
		}
		

	}

}
