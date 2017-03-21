public class Pendataan extends Pekerjaan{
	Pekerjaan kerja = new Pekerjaan();
	Manusia org = new Manusia();
    byte jam,waktu;

    public void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        super.jam=input.nextByte();
        gajilembur=jam*lembur;
    }
    Pendataan(){
    	super();
    }

	public static void main(String argv[]){
		Pendataan gaji = new Pendataan();

		gaji.methodInput();
		gaji.methodInput("Mahasiswa");

		
		gaji.terimaGaji();
		gaji.kerjaLembur();
		if(gaji.ceklembur){
			gaji.upahLembur();
			gaji.jumlahLembur();
		}
/*		kerja.bayarPajak();
		kerja.sisaGaji();

		System.out.println("\n Extra : ");
		org.hidupDalamHari();
		org.hidupDalamJam();
		org.hidupDalamDetik();*/
	}


	private void methodInput(){
		org.berumur();
		org.jenisKelamin();
	}
	private void methodInput(String jenis){
		kerja.bekerjaSebagai();
	}
}