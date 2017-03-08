import java.util.Scanner;

public class Pekerjaan{
	Scanner input=new Scanner(System.in);
	String jenis;
    boolean ceklembur;
    float pajak;
    int gaji,gajilembur;
    short lembur;
    byte jam;
    char kantoran;
    double gajiBersih;
        

	void bekerjaSebagai(){
        System.out.print("Bekerja Sebagai : ");
        jenis=input.nextLine();
	}
	void terimaGaji(){
        System.out.print("Gaji : Rp. ");
        gaji=input.nextInt();
	}
    void kerjaLembur(){
        System.out.print("Lembur? [True/False] : ");
        ceklembur=input.nextBoolean();            
    }
    void upahLembur(){
        System.out.print("Upah Lembur/Jam : Rp. ");
        lembur=input.nextShort();
    }
    void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        jam=input.nextByte();
        gajilembur=jam*lembur;
    }
    void bekerjaDi(){
        System.out.print("Bekerja di Kantor [Y/N] : ");
        kantoran=input.next().charAt(0);            
    }
    void bayarPajak(){
        pajak = (float) gaji*(10f/100f);
        System.out.println("Pajak : "+pajak);
    }
    void sisaGaji(){
        gajiBersih = gaji-pajak+gajilembur;
        System.out.println("Sisa Gaji : "+gajiBersih);
    }
}