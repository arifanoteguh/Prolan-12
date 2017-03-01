import java.util.Scanner;

public class InputOutput3{
	public static void main(String argv[]){
		Scanner input=new Scanner(System.in);
		String nama;

		System.out.print("Nama : ");
		nama=input.nextLine();
		System.out.print("Namamu adalah : "+nama);
	}
}