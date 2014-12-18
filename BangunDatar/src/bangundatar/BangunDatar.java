/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;
import java.util.Scanner;
public class BangunDatar {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Jumlah bangun datar : ");
        int a = data.nextInt();
        Bangun [] bgn = new Bangun [a];
        System.out.print("Jumlah segitiga : ");
        int jml = data.nextInt();
        for (int i = 0; i < jml; i++) 
        {
            bgn[i]=new Segitiga();
            System.out.print("Alas : ");
            ((Segitiga)bgn[i]).setAlas(data.nextDouble());
            System.out.print("Tinggi : ");
            ((Segitiga)bgn[i]).setTinggi(data.nextDouble());
            System.out.print("Sisi miring : ");
            ((Segitiga)bgn[i]).setMiring(data.nextDouble());
            System.out.println("");
        }
        System.out.print("Jumlah segi empat : ");
        int jum = data.nextInt();
        for (int i = jml; i < jum+jml; i++) 
        {
            bgn[i]=new SegiEmpat();
            System.out.print("Panjang : ");
            ((SegiEmpat)bgn[i]).setP(data.nextDouble());
            System.out.print("Lebar : ");
            ((SegiEmpat)bgn[i]).setL(data.nextDouble());
            System.out.println("");
        }
        System.out.print("Jumlah lingkaran : ");
        int jlh = data.nextInt();
        for (int i = jum+jml; i < jum+jml+jlh; i++) 
        {
            bgn[i]=new Lingkaran();
            System.out.print("Jari-jari : ");
            ((Lingkaran)bgn[i]).setR(data.nextDouble());
            System.out.println("");
        }
        System.out.println("No.\tBangun Datar\tKeliling\tLuas");
        System.out.println("==============================================");
        for (int i = 0; i < a; i++) 
        {
            System.out.print((i+1)+"\t");
            if (bgn[i] instanceof Segitiga) 
            {
                System.out.print("Segitiga\t");
            }
            else if (bgn[i] instanceof SegiEmpat)
            {
                System.out.print("Segi Empat\t");
            }
            else if (bgn[i] instanceof Lingkaran)
            {
                System.out.print("Lingkaran\t");
            }
            else{
            }
            System.out.println(bgn[i].keliling()+"\t"+bgn[i].luas());
        }
    }
}
