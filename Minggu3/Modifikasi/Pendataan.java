public class Pendataan{
	public static void main(String argv[]){
		Pekerjaan kerja = new Pekerjaan();
		Manusia org = new Manusia();

		org.bernama();
		org.berumur();
		org.jenisKelamin();
		kerja.bekerjaSebagai();
		kerja.bekerjaDi();
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
		org.hidupDalamDetik();
	}
}