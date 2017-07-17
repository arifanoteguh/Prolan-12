package pekerjaan;

import java.util.Scanner;

public class Pekerjaan extends GajidanLembur implements Info{
    public Scanner input=new Scanner(System.in);
    public String jenis, ceklembur2;
    public boolean ceklembur;
    public int gajilembur;
    private double gajitotal;
    public short lembur;
    public byte jam;
    public double gaji, gajiBersih;
       
		
    public void bekerjaSebagai(){
    System.out.print("Bekerja Sebagai : ");
    jenis=input.next();
    }
    
    @Override
    public void terimaGaji(){
        System.out.print("Gaji : ");
        gaji=0;
        while(gaji<=0){
            gaji=input.nextDouble();
            if(gaji<=0){
                System.out.println("Gaji Tidak Bisa Lebih Kecil dari Rp.1");
                System.out.print("Gaji : ");
            }
        }
    }
    
    public void kerjaLembur(){
        System.out.print("Lembur? [True/False] : ");
        ceklembur=input.nextBoolean();            
    }

    @Override
    public void upahLembur(){
        System.out.print("Upah Lembur/Jam : Rp. ");
        lembur=0;
        while(lembur<=0){
            lembur=input.nextShort();
            if(lembur<=0){
                System.out.println("Upah lembur Tidak Bisa Lebih Kecil dari Rp.1");
                System.out.print("Upah Lembur/Jam : Rp. ");
            }
        }
    }

    public void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        jam=-1;
        while(jam<0){
            jam=input.nextByte();
            gajilembur=jam*lembur;
            if(jam<0){
                System.out.println("Jam lembur tidak bisa lebih kecil dari 0jam");
                System.out.print("Lama Lembur dalam Jam : ");
            }
        }
    }

    public Pekerjaan(){
            this.jam=jam;
    }
    
    public double setGajiTotal(){
        gajitotal=gaji+gajilembur;
        return gajitotal;
    }

    public void setGaji(double gaji){
        this.gaji=gaji;
    }
    
    public double getGaji(){
        return gaji;
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