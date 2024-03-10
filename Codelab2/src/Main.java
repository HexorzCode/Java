import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt;
        Mahasiswa data = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==== Library System ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampil Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Choose option (1-3): ");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa:");
                    data.nama = scanner.next();
                    do {
                        System.out.print("Masukkan Nim Mahasiswa:");
                        data.nim = scanner.nextLong();
                        if (String.valueOf(data.nim).length() != 15) {
                            System.out.println("Panjang Nim Harus 15");
                        }
                    } while (String.valueOf(data.nim).length() != 15);
                    System.out.print("Masukkan Jurusan Mahasiswa:");
                    data.jurusan = scanner.next();
                    System.out.print("Data Mahasiswa berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.println("==== Data Mahasiswa ===");
                    System.out.println(data.TampilUniversitas());
                    System.out.println(data.TampilMahasiswa());
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Input Anda salah. Silakan pilih 1-3.");
                    break;
            }
        } while (opt != 3);

        scanner.close();
    }
}
