import java.util.Scanner;

public class Pekerjaan{
	Scanner input=new Scanner(System.in);
	String jenis;
    boolean ceklembur;
    float pajak;
    int gaji,gajilembur,gajitotal;
    short lembur=10000;
    byte jam;
    char kantoran;
    double gajiBersih;
       
		
	void bekerjaSebagai(){
        System.out.print("Bekerja Sebagai : ");
        jenis=input.nextLine();
	}
	void terimaGaji(){
        System.out.print("Gaji : Rp. 10000 \n");
        gaji=10000;
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
	Pekerjaan(){
		this.jam=jam;
	}
    void bekerjaDi(){
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
    void gajiTotal(){
        gajitotal=gaji+gajilembur;
    }
}