package Methods;

import java.security.MessageDigest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBul();

	}

	public static void sayiBul() {

		int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int aranan = 6;
		boolean varMi = false;

		message("Arad���n�z say� : " + aranan);

		for (int sayi : sayilar) {
			if (sayi == aranan) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			message("Arad���n�z say� mevcuttur. ");
		} else {
			message("Arad���n�z say� mevcut de�ildir. ");
		}

	}

	public static void message(String mesaj) {
		System.out.println(mesaj);
	}

}
