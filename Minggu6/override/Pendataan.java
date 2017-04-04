public class Pendataan extends Pekerjaan{
	Pekerjaan kerja = new Pekerjaan();
	Manusia org = new Manusia();
	short waktu;
	byte jam,bonus=1;


	@Override
    void kerjaLembur(){
        System.out.print("Lembur? : Ya\n");
        ceklembur=true;        
    }

    @Override
    void bekerjaDi(){
        System.out.print("Bekerja di Kantor [Y/N] : ");
        super.bekerjaDi();
    }
	
    void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        super.jam=input.nextByte();
        gajilembur=super.jam*lembur;
    }

    @Override
    void gajiTotal(){
        gajitotal=gaji+gajilembur;
        System.out.println("Gaji+Lembur : Rp. "+gajitotal);
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
		penggaji.gajiTotal();
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