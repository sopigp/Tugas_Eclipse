package com.sekolahqa.tugas_bintang;

public class Tugas_Persegi_Berulang2 {
	public static void main(String[] args) {
		int baris = 7;
		int jmlTampil = 1;
		int jmlSkip = 0;
		int tmpJmlTampilBaris = jmlTampil;
		for (int y = 1; y <= (baris * baris); y++) {
			int tmpJmlTampil = jmlTampil;
			int tmpJmlSkip = jmlSkip;
			for (int x = 1; x <= (baris * baris); x++) {
				if (tmpJmlSkip > 0) {
					System.out.print(" ");
					tmpJmlSkip--;
				} else if (tmpJmlTampil > 0) {
					System.out.print("*");
					tmpJmlTampil--;
				}
			}
			tmpJmlTampilBaris--;
			if (tmpJmlTampilBaris > 0) {
				System.out.println();
				continue;
			}
			System.out.println();
			jmlSkip += jmlTampil;
			jmlTampil += 2;
			tmpJmlTampilBaris = jmlTampil;
		}
	}
}