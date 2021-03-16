package com.mygalon.akuah;

import java.util.Scanner;
public class Kang_galon {
	
	static double liter, hasil;
	static int galon;
	
	public static Scanner lon;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	lon = new Scanner(System.in);	
	liter =  3.785;
	
	System.out.println("Masukkan jumlah air galon : ");
	galon= lon.nextByte();
	
	hasil = galon*liter;
	System.out.println("Hasil konversi : " + hasil + " liter ");
	
  }
}
