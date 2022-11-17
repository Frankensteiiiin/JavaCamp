package Methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = sehirVer();
		System.out.println(message);
		int sayi = topla(5, 8);
		System.out.println(sayi);

		int toplam = topla1(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(toplam);
	}

	public static void add() {
		System.out.println("Eklendi.");
	}

	public static void delete() {
		System.out.println("Silindi.");
	}

	public static void update() {
		System.out.println("GŁncellendi.");
	}

	// Parametreli metod
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

	// Variable Arguments
	public static int topla1(int... sayilar) {

		int toplam = 0;

		for (int i : sayilar) {
			toplam += i;
		}

		return toplam;
	}

}
