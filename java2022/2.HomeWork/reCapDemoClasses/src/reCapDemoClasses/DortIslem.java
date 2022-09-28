package reCapDemoClasses;

public class DortIslem {
	
	
	public int Topla (int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
		
	}
	
	public int Cikar (int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam = sayi-sayi;
		}
		return toplam;
		
	}
	
	public int Carp (int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam = sayi*sayi;
		}
		return toplam;
		
	}
	
	public int Bol (int... sayilar) {
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam = sayi/sayi;
		}
		return toplam;
		
	}

}
