package arifanoteguhwicaksono.pkg10114134.encapintegration;

public class MainProgram extends Pekerjaan implements Info{
    Pekerjaan kerja = new Pekerjaan();
    Manusia org = new Manusia();
    short waktu;
    byte jam;

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
    
    @Override
    public void dataUtama() {
        System.out.println("Pendataan");
    }

    @Override
    public void dataKedua() {
        System.out.println("Data Gaji");
    }
    
    @Override
    public void info(){
        System.out.println("Total Gaji");
    }
    
    MainProgram(){
        super.jam+=1;
    }

    public static void main(String argv[]){
        MainProgram penggaji = new MainProgram();
        Info inface = new MainProgram();

        inface.dataUtama();
        penggaji.methodInput();
        penggaji.methodInput("Mahasiswa");

        inface.dataKedua();
        penggaji.terimaGaji();
        penggaji.kerjaLembur();
        if(penggaji.ceklembur){
                penggaji.upahLembur();
                penggaji.jumlahLembur();
        }
        System.out.println("=======================================");
        inface.info();
        penggaji.getGajiTotal();
    }

    private void methodInput(){
        org.Manusia();
        org.setBerumur();
        org.jenisKelamin();
    }
    private void methodInput(String jenis){
        kerja.bekerjaSebagai();
    }
}