package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade='F';
		
		switch (grade)
		{
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			//B ve C çıktısı aynı olacak olsaydı  15 ve 16. satırları silebilirdik
			System.out.println("Çok İyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
			
		}

	}

}
