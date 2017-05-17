package arifanoteguhwicaksono.pkg10114134.encapintegration;

import java.util.Scanner;

public class Manusia{
	Scanner input=new Scanner(System.in);
	String nama;
	private byte umur;
	char jk;

	public Manusia(){
            System.out.print("Nama Lengkap : ");
            this.nama=input.nextLine();
	}
        
        public void setBerumur(){
            System.out.print("Umur : ");
            umur=input.nextByte();
        }
	
        void jenisKelamin(){
            System.out.print("Jenis Kelamin? [L/P] : ");
            jk=input.next().charAt(0);
        }
}