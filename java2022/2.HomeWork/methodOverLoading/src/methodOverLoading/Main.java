package methodOverLoading;

public class Main {

	public static void main(String[] args) {
			
		DortIslem dortIslem = new DortIslem();
		int toplam = dortIslem.topla(5, 5);
		System.out.println(toplam);
		dortIslem.topla(5, 4, 3);
		
	}

}
