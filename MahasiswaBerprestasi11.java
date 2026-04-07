public class MahasiswaBerprestasi11 extends Mahasiswa11 {
    // Atribut tambahan untuk mahasiswa berprestasi
    public double nilaiPrestasi;
    public String beasiswa;
    private String[] penghargaan;
    private int jumlahPenghargaan;
    
    // Konstruktor default
    public MahasiswaBerprestasi11() {
    }
    
    // Konstruktor dengan parameter
    public MahasiswaBerprestasi11(String nm, String name, String kls, double ip, 
                                   double nilaiPrestasi, String beasiswa) {
        super(nm, name, kls, ip);
        this.nilaiPrestasi = nilaiPrestasi;
        this.beasiswa = beasiswa;
        this.penghargaan = new String[10];
        this.jumlahPenghargaan = 0;
    }
    
    // Metode untuk menambah penghargaan
    public void tambahPenghargaan(String penghargaanBaru) {
        if (jumlahPenghargaan < penghargaan.length) {
            penghargaan[jumlahPenghargaan] = penghargaanBaru;
            jumlahPenghargaan++;
            System.out.println("Penghargaan '" + penghargaanBaru + "' berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas penghargaan penuh!");
        }
    }
    
    // Metode untuk menghitung skor prestasi
    public double hitungSkorPrestasi() {
        return (nilaiIpk * 0.5) + (nilaiPrestasi * 0.3) + (jumlahPenghargaan * 0.2);
    }
    
    // Metode untuk mengecek apakah mahasiswa berprestasi
    public boolean adalahBerprestasi() {
        return nilaiIpk >= 3.5 && nilaiPrestasi >= 85;
    }
    
    // Override metode tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nilai Prestasi: " + nilaiPrestasi);
        System.out.println("Beasiswa: " + beasiswa);
    }
    
    // Override metode tampilkanInfoLengkap
    @Override
    public void tampilkanInfoLengkap() {
        tampilkanInfo();
        System.out.println("Jumlah Penghargaan: " + jumlahPenghargaan);
        if (jumlahPenghargaan > 0) {
            System.out.println("Daftar Penghargaan:");
            for (int i = 0; i < jumlahPenghargaan; i++) {
                System.out.println("  " + (i + 1) + ". " + penghargaan[i]);
            }
        }
        System.out.println("Skor Prestasi: " + String.format("%.2f", hitungSkorPrestasi()));
        System.out.println("Kategori: " + (adalahBerprestasi() ? "Berprestasi" : "Reguler"));
        System.out.println("Siap Lulus: " + siapLulus());
    }
    
    // Override metode toString
    @Override
    public String toString() {
        return "MahasiswaBerprestasi11{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", nilaiIpk=" + nilaiIpk +
                ", kelas='" + kelas + '\'' +
                ", nilaiPrestasi=" + nilaiPrestasi +
                ", beasiswa='" + beasiswa + '\'' +
                ", jumlahPenghargaan=" + jumlahPenghargaan +
                '}';
    }
}
