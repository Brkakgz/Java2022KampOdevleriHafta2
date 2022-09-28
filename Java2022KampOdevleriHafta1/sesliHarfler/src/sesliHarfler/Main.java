package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf ='B';
		
		switch(harf)
		{
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
			default:
				System.out.println("İnce Sesli Harf");
				//Aslında Programımızda bug bulunuyor. Gördüğünüz gibi B girişi yaptığımızda ince sesli harf mesajını veriyor
		}

	}

}
