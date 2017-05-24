package arifanoteguhwicaksono.pkg10114134.encapintegration;

import java.util.Scanner;

public class Pekerjaan extends GajidanLembur implements Info{
    Scanner input=new Scanner(System.in);
    String jenis, ceklembur2;
    boolean ceklembur;
    int gaji, gajilembur;
    private int gajitotal;
    short lembur;
    byte jam;
    double gajiBersih;
       
		
    void bekerjaSebagai(){
    System.out.print("Bekerja Sebagai : ");
    jenis=input.nextLine();
    }
    
    @Override
    public void terimaGaji(){
        System.out.println("Gaji : Rp. 10000");
        gaji=10000;
    }
    
    void kerjaLembur(){
        System.out.print("Lembur? [True/False] : ");
        ceklembur=input.nextBoolean();            
    }

    @Override
    public void upahLembur(){
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
    
    public void getGajiTotal(){
        gajitotal=gaji+gajilembur;
        System.out.println("Gaji+Lembur : Rp. "+gajitotal);
    }

    @Override
    public void dataUtama() {
        System.out.println("Data Pekerjaan");
    }

    @Override
    public void dataKedua() {
        System.out.println("Data Pekerjaan Lanjutan");
    }

    @Override
    public void info() {
        System.out.println("Info Pekerjaan");
    }
}