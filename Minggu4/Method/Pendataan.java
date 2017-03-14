public class Pendataan{
	Pekerjaan kerja = new Pekerjaan();
	Manusia org = new Manusia();

	public static void main(String argv[]){
		Pendataan method = new Pendataan();

		method.methodInput();
		method.methodInput("Mahasiswa");

/*		
		kerja.terimaGaji();
		kerja.kerjaLembur();
		if(kerja.ceklembur){
			kerja.upahLembur();
			kerja.jumlahLembur();
		}
		kerja.bayarPajak();
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