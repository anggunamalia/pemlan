package StudiKasus2;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    public void tambahData(){
        Scanner input = new Scanner(System.in);

        System.out.println( "Masukkan nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan NIM: ");
        String nim = input.nextLine();
        System.out.println("Masukkan alamat: ");
        String alamat = input.nextLine();
        daftarMahasiswa.add(new Mahasiswa(nama, nim, alamat));
    }

    public void tampilData(){
        System.out.println("==================================");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs.getNimMahasiswa() + " | " + mhs.getNamaMahasiswa() + " | " + mhs.getAlamatMahasiswa());
        }
    }

    public static void main (String[]args){
        Main dataMahasiswa = new Main();
        boolean next = true;
        Scanner input = new Scanner(System.in);
        while (next){
            dataMahasiswa.tambahData();
            System.out.println("tambah lagi? (t jika tidak) ");
            String tambah = input.nextLine();
            if (tambah.equalsIgnoreCase("t")){
                next = false;
            }
        }
        dataMahasiswa.tampilData();
    }
}