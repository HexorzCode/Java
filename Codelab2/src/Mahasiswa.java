public class Mahasiswa {
    String nama;
    long nim;
    String jurusan;
    static String TampilUniversitas () {
        return "Universitas Muhammadiyah Malang";
    }
    String TampilMahasiswa(){
        return "Nama Mahasiswa : " + nama + "\nNim Mahasiswa : " + nim + "\nJurusan Mahasiswa : " + jurusan;
    }
}
