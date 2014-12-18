package perusahaan;

import java.util.Scanner;
public class MainPerusahaan{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		Perusahaan per0 = new Perusahaan();
		Pegawai peg0 = new Pegawai(650,12,1);

		System.out.print("Inputkan NIP : ");
		peg0.setNip(input.nextInt());
		System.out.print("Inputkan Nama : ");
		peg0.setNama(input.next());
		System.out.print("Inputkan Kode Perusahaan : ");
		per0.setKode(input.next());
		System.out.print("Inputkan Nama Perusahaan : ");
		per0.setnPerusahaan(input.next());

		System.out.println("");

		System.out.println("Nama Perusahaan : "+per0.getnPerusahaan());
		System.out.println("Kode Perusahaan : "+per0.getKode());
		System.out.println("Nama Ketua : "+peg0.getNama());
		System.out.println("Gaji Total : "+peg0.gajiTotal());

	}
}