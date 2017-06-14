package arifanoteguhwicaksono.pkg10114134.encapintegration;

public class MainProgram extends Pekerjaan implements Info{
    Pekerjaan kerja = new Pekerjaan();
    Manusia org = new Manusia();
    short waktu;
    byte jam;
    double jmlPajak;
    int data;

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
        gaji=kerja.gaji;
    }

    public static void main(String argv[]){
        MainProgram penggaji = new MainProgram();
        
        penggaji.methodInputData();
    }
    
    public void methodPajak(double gaji){
        Pajak<Double> pjkGen = new Pajak<>();
    
        if(gaji>=1000000){
            gaji=pjkGen.JumlahGaji(gaji);
            jmlPajak=0.05*gaji;
            System.out.println("Biaya Pajak : Rp. "+jmlPajak);
        }else if(gaji>=3000000){
            gaji=pjkGen.JumlahGaji(gaji);
            jmlPajak=0.08*gaji;
            System.out.println("Biaya Pajak : Rp. "+jmlPajak);
        }else if(gaji>=5000000){
            gaji=pjkGen.JumlahGaji(gaji);
            jmlPajak=0.1*gaji;
            System.out.println("Biaya Pajak : Rp. "+jmlPajak);
        }else{
            System.out.println("Tidak dikenakan Pajak");
        }
    }
    
    public void methodInputData(){
        double gaji;
        MainProgram penggaji = new MainProgram();
        Info inface = new MainProgram();
        Pekerjaan kerja = new Pekerjaan();
        Manusia org = new Manusia();
     
        System.out.print("Jumlah Data Yang Akan Dimasukkan : ");
        data = input.nextInt();
        for (int i = 0; i < data; i++) {
            System.out.println("=======================================");
            System.out.println("Data Ke - "+(i+1));
            System.out.println("----");
            inface.dataUtama();
            System.out.println("----");
            org.Manusia();
            org.setBerumur();
            org.jenisKelamin();
            kerja.bekerjaSebagai();
        
            System.out.println("\n----");
            inface.dataKedua();
            System.out.print("----\n");
            kerja.terimaGaji();
            gaji=kerja.gaji;
            kerja.kerjaLembur();
            if(kerja.ceklembur){
                    kerja.upahLembur();
                    kerja.jumlahLembur();
            }

            System.out.println("=======================================");

            System.out.println("\n----");
            inface.info();
            System.out.print("----\n");
            System.out.println("Gaji+Lembur : Rp. "+kerja.setGajiTotal());
            penggaji.methodPajak(gaji);

        }
    }
}