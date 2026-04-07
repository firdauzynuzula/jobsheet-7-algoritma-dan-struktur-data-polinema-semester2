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
            sc.nextLine();


            list.tambah(new Mahasiswa11(nim, nama, kelas, ipkValue));
            System.out.println();
        }
        
        // Tampilkan semua mahasiswa
        list.tampil();
        
        // Lakukan sequential search
        System.out.println("\n--- Pencarian Sequential Search ---");
        double nilaiCari = 3.8;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari);
        int posisi = list.sequentialSearching(nilaiCari);
        list.tampilPoisisi(nilaiCari, posisi);
        list.tampilDataSearch(nilaiCari, posisi);
        
        // Pencarian kedua
        System.out.println("\n--- Pencarian Sequential Search Kedua ---");
        double nilaiCari2 = 3.2;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari2);
        int posisi2 = list.sequentialSearching(nilaiCari2);
        list.tampilPoisisi(nilaiCari2, posisi2);
        list.tampilDataSearch(nilaiCari2, posisi2);
        
        // Pencarian ketiga (tidak ditemukan)
        System.out.println("\n--- Pencarian Sequential Search Ketiga ---");
        double nilaiCari3 = 4.0;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari3);
        int posisi3 = list.sequentialSearching(nilaiCari3);
        list.tampilPoisisi(nilaiCari3, posisi3);
        list.tampilDataSearch(nilaiCari3, posisi3);
    }
}
