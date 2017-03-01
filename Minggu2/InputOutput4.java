import java.util.Scanner;

public class InputOutput4{
	public static void main(String argv[]){
		Scanner input=new Scanner(System.in);
		String nama;
		char jenisKelamin;
		int tinggiBadan;
		boolean menikah;

		System.out.print("Nama           : ");
		nama=input.nextLine();
		System.out.print("Jenis Kelamin  : ");
		jenisKelamin=input.next().charAt(0);
		System.out.print("Tinggi Badan   : ");
		tinggiBadan=input.nextInt();
		System.out.print("Status Menikah : ");
		menikah=input.nextBoolean();
	}
}