public class MahasiswaDemo11 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Program Demo Mahasiswa dengan Sequential Search");
        System.out.println("========================================\n");
        
        // Buat object MahasiswaBerprestasi11 untuk mengelola daftar mahasiswa
        MahasiswaBerprestasi11 daftarMahasiswa = new MahasiswaBerprestasi11();
        
        // Buat object Mahasiswa11
        Mahasiswa11 mhs1 = new Mahasiswa11("11223344", "Budi Santoso", "XII-A", 3.9);
        Mahasiswa11 mhs2 = new Mahasiswa11("87654321", "Siti Nurhaliza", "XII-B", 3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("12345678", "Ahmad Ridha", "XII-A", 3.2);
        Mahasiswa11 mhs4 = new Mahasiswa11("55667788", "Nur Azizah", "XII-C", 3.7);
        Mahasiswa11 mhs5 = new Mahasiswa11("99887766", "Rina Wijaya", "XII-B", 3.5);
        
        // Tambah mahasiswa ke dalam daftar
        System.out.println("--- Menambah Mahasiswa ---");
        daftarMahasiswa.tambah(mhs1);
        daftarMahasiswa.tambah(mhs2);
        daftarMahasiswa.tambah(mhs3);
        daftarMahasiswa.tambah(mhs4);
        daftarMahasiswa.tambah(mhs5);
        System.out.println();
        
        // Tampilkan semua mahasiswa
        daftarMahasiswa.tampil();
        
        // Lakukan sequential search
        System.out.println("\n--- Pencarian Sequential Search ---");
        double nilaiCari = 3.8;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari);
        int posisi = daftarMahasiswa.sequentialSearch(nilaiCari);
        daftarMahasiswa.tampilPoisisi(nilaiCari, posisi);
        daftarMahasiswa.tampilDataSearch(nilaiCari, posisi);
        
        // Pencarian kedua
        System.out.println("\n--- Pencarian Sequential Search Kedua ---");
        double nilaiCari2 = 3.2;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari2);
        int posisi2 = daftarMahasiswa.sequentialSearch(nilaiCari2);
        daftarMahasiswa.tampilPoisisi(nilaiCari2, posisi2);
        daftarMahasiswa.tampilDataSearch(nilaiCari2, posisi2);
        
        // Pencarian ketiga (tidak ditemukan)
        System.out.println("\n--- Pencarian Sequential Search Ketiga ---");
        double nilaiCari3 = 4.0;
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCari3);
        int posisi3 = daftarMahasiswa.sequentialSearch(nilaiCari3);
        daftarMahasiswa.tampilPoisisi(nilaiCari3, posisi3);
        daftarMahasiswa.tampilDataSearch(nilaiCari3, posisi3);
    }
}
