import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Program Demo Mahasiswa dengan Sequential Search");
        System.out.println("========================================\n");
        
        // Buat object MahasiswaBerprestasi11 untuk mengelola daftar mahasiswa
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();

        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 5; // Jumlah mahasiswa yang akan ditambahkan
        // Input data mahasiswa
        System.out.println("--- Input Data Mahasiswa ---");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Nilai IPK: ");
            String ipk = sc.nextLine();
            double ipkValue = Double.parseDouble(ipk);

            list.tambah(new Mahasiswa11(nim, nama, kelas, ipkValue));
            System.out.println();
        }
        
        // Tampilkan semua mahasiswa
        list.tampil();
        

        // Lakukan sequential search
        System.out.println("\n--- Pencarian Sequential Search ---");
        System.out.print("Masukkan nilai IPK yang ingin dicari: ");
        double nilaiCari = sc.nextDouble();
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari);



        System.out.println("\n--- Hasil Pencarian meggunakan sequential searching ---");
        int posisi = list.sequentialSearching(nilaiCari);
        list.tampilPoisisi(nilaiCari, posisi);
        list.tampilDataSearch(nilaiCari, posisi);
        
    }
}
