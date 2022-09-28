package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}
	public static void sayiBulmaca()
	{
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi : sayilar)
		{
			if(sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if(varMi) 
		{
			System.out.println("Sayı mevcuttur:" + aranacak);
			mesaj="Sayı mevcuttur:" + aranacak;
			mesajVer(mesaj);
		}
		else 
		{
			System.out.println("Sayı mecvut değildir:" + aranacak);
			mesajVer("Sayı mevcut değildir:" + aranacak);
		}
	}
	public static void mesajVer(String mesaj) // Parametreli metod
	{
		System.out.println(mesaj);
	}
}
