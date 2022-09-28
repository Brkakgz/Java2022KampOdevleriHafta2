package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//Uygulamadaki sistemsel açıklara, hatalara bug denir 1 sayısı bug yaratır.
		
	int number = -500;
		int remainder = number %2;
		//System.out.println(remainder);
		boolean isPrime=true;
		if(number==1)
		{
			System.out.println("Sayı asal değildir");
			return;
			//Return fonksiyonu programımızı bitirir. Void'e geri döner.
			//return yapmasaydık sistemimizde bug oluşacaktı.
		}
		if(number<1) 
		{
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2;i<number;i++)
		{
			if (number% i==0)
			{
				isPrime = false;
			}
		}
		if (isPrime==true)
		{
			System.out.println("Sayı asaldır");
		}
		else 
		{
			System.out.println("Sayı asal değildir");
		}
		}

	}


