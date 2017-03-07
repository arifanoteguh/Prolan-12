import java.util.Scanner;

public class Pekerjaan{
	Scanner input=new Scanner(System.in);
	String jenis;
	int gaji;

	void bekerjaSebagai(){
		System.out.print("Bekerja Sebagai : ");
		jenis=input.nextLine();
	}
	void terimaGaji(){
		System.out.print("Gaji : ");
		gaji=input.nextInt();
	}
}