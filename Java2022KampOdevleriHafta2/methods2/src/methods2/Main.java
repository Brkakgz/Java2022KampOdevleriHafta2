package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj ="Bugün hava çok güzel.";
		String yeniMesaj=mesaj.substring(0,2);
		String yeniMesaj2=sehirVer();
		System.out.println(yeniMesaj);
		System.out.println(yeniMesaj2);
		int sayi = topla(); //topla int değeri olduğundan kızmaz
		//int sati2 = sehirVer(); // sehirver string olursa kızar
		//int sayi = topla(5,7); //tek parametreli olmadığından olmaz
		int sayi2= topla2(55,7);
		System.out.println(sayi2);
		int toplam = topla3(2,3,4,5,6);
		System.out.println(toplam);
	}

	public static void ekle()
	{
		System.out.println("Eklendi");
	}
	public static void sil()
	{
		System.out.println("Silindi");
	}
	public static void guncelle()
	{
		System.out.println("Güncellendi");
	}
	
	public static int topla()
	{
		return 5;//5 döndürerek bitir anlamına gelir
	}
	public static String sehirVer()
	{
		return "Ankara";
	}
	public static int topla2(int sayi1, int sayi2)
	{
		return sayi1+sayi2;
	}
	
	public static int topla3(int... sayilar) //birden fazla int göndereceğimiz anlamına gelir
	{
		int toplam=0;
		for(int sayi:sayilar)
		{
			toplam=toplam+sayi;
		}
		return toplam;
	}
}

