import java.util.Scanner;

public class Manusia{
	Scanner input=new Scanner(System.in);
	String nama;
	byte umur;
	char jk;
	int hari;
	long jam;
	float detik;

	void bernama(){
		System.out.print("Nama Lengkap : ");
		nama=input.nextLine();
	}
	void berumur(){
		System.out.print("Umur : ");
		umur=input.nextByte();
	}
	void jenisKelamin(){
		System.out.print("Jenis Kelamin? [L/P] : ");
		jk=input.next().charAt(0);
	}
	void hidupDalamHari(){
		hari=umur*365;
		System.out.println("Umur dalam hari : "+hari);
	}
	void hidupDalamJam(){
		jam=hari*24;
		System.out.println("Umur dalam jam : "+jam);
	}
	void hidupDalamDetik(){
		detik=jam*60;
		System.out.println("Umur dalam jam : "+detik);
	}
}