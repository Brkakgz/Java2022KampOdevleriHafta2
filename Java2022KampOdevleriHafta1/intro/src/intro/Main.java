package intro;

public class Main {

	//Main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello world!"); 
		//sys=systemin kısaltmasıdır. Ctrl+Space bize tamamlaycıyı açar
		String ortaMetin ="İlginizi Çekebilir";
		String altMetin ="Vade Süresi";
		//Değişken isimlendirmeleri Java'da camelCase yazılır. Yani ilk kelime küçük sonrakiler büyük.
		
		System.out.println(ortaMetin);
		
		int vade=12;
		//integer = Tamsayı
		
		double dolarDun= 18.15;
		double dolarBugun=18.12;
		
		boolean dolarDustuMu = false; //Şartlı durumdur.True veya false değerleri alabilir
		
		String okYonu="";//Ok yönünü boş bıraktık şartlarda değer atadık
		
		if (dolarBugun<dolarDun) // if yazıp ztrl+space ile boolu kendisi görüp ekler
		//if true döner	
		{
			okYonu="down.svg"; //Şarta göre ok yönünü tanımladık
			System.out.println(okYonu);//Ok yönünü yazdırdık
		}
		
		else if(dolarBugun>dolarDun)
		{
			okYonu="up.svg"; //Şarta göre ok yönünü tanımladık
			System.out.println(okYonu);//Ok yönünü yazdırdık
		}
	
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		//Array - açılır liste düşün
		String[] krediler= {"Hızlı Kredi","Maaşını Halk Banktan","Mutlu Emekli"};
		//Tırnak içinde yazılanlar bize normalde DB databseden gelir
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		//Böyle yaparsak yapacağımız iş bitmez binlerce bilgi olabilir bu yüzden döngü kullanıcaz amelelik yapmıyoruz
		
		for (int i = 0; i < krediler.length; i++) //for ctrl+space array olanı seçtik
			// 1. nereden başlayayım, 2. nereye kadar yapayım, 3. i 1 1 artsın demek
			//lenght kaç elemandan oluşuyorsun demek oluyor burada 3ten küçük olduu sürece oluyor
		{
			System.out.println(krediler[i]);
		}
		
	}

}
