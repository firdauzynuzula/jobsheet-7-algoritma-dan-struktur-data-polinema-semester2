public class MahasiswaDemo11 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Program Demo Mahasiswa dan Mahasiswa Berprestasi");
        System.out.println("========================================\n");
        
        // Buat mahasiswa reguler 1
        System.out.println("--- Mahasiswa Reguler ---");
        Mahasiswa11 mahasiswa1 = new Mahasiswa11("12345678", "Ahmad Ridha", "XII-A", 3.2);
        mahasiswa1.tampilkanInfo();
        System.out.println("Siap Lulus: " + mahasiswa1.siapLulus());
        System.out.println("\n");
        
        // Buat mahasiswa reguler 2
        System.out.println("--- Mahasiswa Reguler 2 ---");
        Mahasiswa11 mahasiswa2 = new Mahasiswa11("87654321", "Siti Nurhaliza", "XII-B", 3.8);
        mahasiswa2.tampilkanInfo();
        System.out.println("Siap Lulus: " + mahasiswa2.siapLulus());
        System.out.println("\n");
        
        // Buat mahasiswa berprestasi 1
        System.out.println("--- Mahasiswa Berprestasi ---");
        MahasiswaBerprestasi11 mahasiswaBerprestasi1 = new MahasiswaBerprestasi11(
            "11223344", 
            "Budi Santoso", 
            "XII-A", 
            3.9, 
            92.5,
            "Beasiswa Penuh LPDP"
        );
        
        mahasiswaBerprestasi1.tampilkanInfo();
        System.out.println("Nilai Prestasi: " + mahasiswaBerprestasi1.nilaiPrestasi);
        System.out.println("Beasiswa: " + mahasiswaBerprestasi1.beasiswa);
        System.out.println("\n");
        
        // Buat mahasiswa berprestasi 2
        System.out.println("--- Mahasiswa Berprestasi 2 ---");
        MahasiswaBerprestasi11 mahasiswaBerprestasi2 = new MahasiswaBerprestasi11(
            "55667788", 
            "Nur Azizah", 
            "XII-B", 
            3.7, 
            88.0,
            "Beasiswa Akademik"
        );
        
        mahasiswaBerprestasi2.tampilkanInfo();
        System.out.println("Nilai Prestasi: " + mahasiswaBerprestasi2.nilaiPrestasi);
        System.out.println("Beasiswa: " + mahasiswaBerprestasi2.beasiswa);
        System.out.println("\n");
        
        // Tampilkan ringkasan
        System.out.println("========================================");
        System.out.println("Ringkasan Data Mahasiswa");
        System.out.println("========================================");
        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
        System.out.println(mahasiswaBerprestasi1);
        System.out.println(mahasiswaBerprestasi2);
        System.out.println("========================================\n");
        
        // Cek kelayakan kelulusan
        System.out.println("Cek Kelayakan Kelulusan:");
        System.out.println(mahasiswa1.nama + ": " + (mahasiswa1.siapLulus() ? "Siap Lulus" : "Belum Siap Lulus"));
        System.out.println(mahasiswa2.nama + ": " + (mahasiswa2.siapLulus() ? "Siap Lulus" : "Belum Siap Lulus"));
        System.out.println(mahasiswaBerprestasi1.nama + ": " + (mahasiswaBerprestasi1.siapLulus() ? "Siap Lulus" : "Belum Siap Lulus"));
        System.out.println(mahasiswaBerprestasi2.nama + ": " + (mahasiswaBerprestasi2.siapLulus() ? "Siap Lulus" : "Belum Siap Lulus"));
    }
}
