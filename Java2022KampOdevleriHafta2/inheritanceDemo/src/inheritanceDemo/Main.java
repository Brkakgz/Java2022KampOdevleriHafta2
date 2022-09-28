package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager()); // Öğretmeni istediğimiz gibi değiştirebiliriz Base kredi manager hepsinin annesi olur. Referans olur.

	}

}
