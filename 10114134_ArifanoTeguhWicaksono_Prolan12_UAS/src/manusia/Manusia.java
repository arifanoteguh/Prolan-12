package manusia;

import java.util.Scanner;
import pekerjaan.Info;

public class Manusia implements Info{
    Scanner input=new Scanner(System.in);
    String nama;
    private byte umur;
    char jk;

    public void Manusia(){
        System.out.print("Nama Lengkap : ");
        nama=input.next();
    }

    public void setBerumur(){
        System.out.print("Umur : ");
        umur=0;
        while(umur<17){
            umur=input.nextByte();
            if(umur<17){
                System.out.println("Umur tidak bisa lebih kecil dari 17 Tahun");
                System.out.print("Umur : ");
            }
        }
    }

    void jenisKelamin(){
        System.out.print("Jenis Kelamin? [L/P] : ");
        jk=input.next().charAt(0);   
    }

    @Override
    public void dataUtama() {
        System.out.println("Data Pribadi");
    }
    
    @Override
    public void dataKedua() {
        System.out.println("Data Pribadi Lanjutan");
    }
    
    @Override
    public void info() {
        System.out.println("Info Pribadi");
    }

}