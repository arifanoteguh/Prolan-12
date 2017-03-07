import java.util.Scanner;

public class Manusia{
	Scanner input=new Scanner(System.in);
	String nama;
	int umur;

	void bernama(){
		System.out.print("Nama Lengkap : ");
		nama=input.nextLine();
	}
	void berumur(){
		System.out.print("Umur : ");
		umur=input.nextInt();
	}
}