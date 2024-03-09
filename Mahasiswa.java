package StudiKasus2;

class Mahasiswa {
    private String namaMahasiswa;
    private String nimMahasiswa;
    private String alamatMahasiswa;

    public Mahasiswa (String nama, String nim, String alamat){
        this.namaMahasiswa = nama;
        this.nimMahasiswa = nim;
        this.alamatMahasiswa = alamat;
    }

    public String getNamaMahasiswa(){
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;

    }

    public String getNimMahasiswa(){
        return  nimMahasiswa;

    }
    public void setNimMahasiswa(String nimMahasiswa){
        this.nimMahasiswa = nimMahasiswa;

    }
    public  String getAlamatMahasiswa(){
        return alamatMahasiswa;
    }

    public void setAlamatMahasiswa(String alamatMahasiswa) {
        this.alamatMahasiswa = alamatMahasiswa;
    }

}
