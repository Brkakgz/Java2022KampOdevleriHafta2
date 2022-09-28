package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
		if(varMi) //Parantez içinde varMi==true yazabilirdik aynı işlemdir
		{
			System.out.println("Sayı mevcuttur");
		}
		else 
		{
			System.out.println("Sayı mecvut değildir");
		}

	}

}
