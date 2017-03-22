package pilihan;
import java.util.Scanner;

public class Pilihan {
    public byte Maksimum=-128,Minimum=127,jumlahAngka=0;
    public byte[] jumlah;
    char AB;
    
    void PilihanA(byte x){
        if(Maksimum<=jumlah[x]){
            Maksimum=jumlah[x];            
        }            
    }
    
    void PilihanB(byte x){
        if(Minimum>=jumlah[x]){
            Minimum=jumlah[x];            
        }            
    }
    
    public static void main(String[] args) {
        Pilihan Pilih = new Pilihan(); //Objek Pilihan
        Scanner input=new Scanner(System.in); //Scanner
        
        System.out.print("Masukkan Jumlah Angka : ");
        Pilih.jumlahAngka=input.nextByte(); //Input jumlahAngka di Global
        Pilih.jumlah=new byte[Pilih.jumlahAngka]; //Nentuin indeks dari array jumlah
        
        System.out.print("Masukkan Pilihan [A/B] : ");
        Pilih.AB=input.next().charAt(0); //Input AB di Global
        while(Pilih.AB!='A' && Pilih.AB!='B'){ //Validasi Pilihan
            System.out.println("Hanya Dapat Menginputkan [A/B]!");
            System.out.print("Masukkan Pilihan [A/B] : ");
            Pilih.AB=input.next().charAt(0);
        }
        
        for (byte i = 0; i < Pilih.jumlahAngka; i++) {
            System.out.print("Masukkan Angka ke-"+(i+1)+" : ");
            Pilih.jumlah[i]=input.nextByte();
            if(Pilih.AB=='A'){
                Pilih.PilihanA(i);
            }else{
                Pilih.PilihanB(i);
            }
        }
        if(Pilih.AB=='A'){
            System.out.println("Nilai Maksimum : "+Pilih.Maksimum);
        }else{
            System.out.println("Nilai Minimum : "+Pilih.Minimum);
        }
    }    
}
