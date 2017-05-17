package arifanoteguhwicaksono.pkg10114134.encapintegration;

public class Pendataan extends Pekerjaan{
    Pekerjaan kerja = new Pekerjaan();
    Manusia org = new Manusia();
    short waktu;
    byte jam,bonus=1;

    @Override
    void kerjaLembur(){
        System.out.print("Lembur? [Y/T]: ");
        ceklembur2=input.nextLine();
        ceklembur = "Y".equals(ceklembur2);
    }
	
    @Override
    void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        super.jam=input.nextByte();
        gajilembur=super.jam*lembur;
    }
    
    Pendataan(){
            super.jam+=1;
    }

    public static void main(String argv[]){
            Pendataan penggaji = new Pendataan();

            penggaji.methodInput();
            penggaji.methodInput("Mahasiswa");

            penggaji.terimaGaji();
            penggaji.kerjaLembur();
            if(penggaji.ceklembur){
                    penggaji.upahLembur();
                    penggaji.jumlahLembur();
            }
            System.out.println("=======================================");
            penggaji.getGajiTotal();
    }

    private void methodInput(){
            org.setBerumur();
            org.jenisKelamin();
    }
    private void methodInput(String jenis){
            kerja.bekerjaSebagai();
    }
}