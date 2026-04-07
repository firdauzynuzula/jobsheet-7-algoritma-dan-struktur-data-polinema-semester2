public class Mahasiswa11 {
    // Atribut
    public String nama;
    public String nim;
    public double nilaiIpk;
    public String kelas;
    
    // Konstruktor default
    public Mahasiswa11() {
    }
    
    // Konstruktor dengan parameter
    public Mahasiswa11(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.nilaiIpk = ip;
    }
    
    // Metode untuk mengecek kelayakan kelulusan
    public boolean siapLulus() {
        return nilaiIpk >= 2.0;
    }
    
    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai IPK: " + nilaiIpk);
        System.out.println("Kelas: " + kelas);
    }
}
