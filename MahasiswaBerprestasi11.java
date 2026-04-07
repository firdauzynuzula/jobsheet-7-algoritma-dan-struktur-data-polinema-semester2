public class MahasiswaBerprestasi11 {
    // Atribut
    private Mahasiswa11[] listMhs;
    private int idx;
    
    // Konstruktor
    public MahasiswaBerprestasi11() {
        listMhs = new Mahasiswa11[5];
        idx = 0;
    }
    
    // Metode untuk menambah mahasiswa
    public void tambah(Mahasiswa11 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
            System.out.println("Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas array penuh!");
        }
    }
    
    // Metode untuk menampilkan semua mahasiswa
    public void tampil() {
        System.out.println("\n========== Daftar Mahasiswa ==========");
        for (int i = 0; i < idx; i++) {
            System.out.println((i + 1) + ". ");
            listMhs[i].tampilkanInfo();
            System.out.println();
        }
    }
    
    // Metode sequential search berdasarkan nilai IPK
    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].nilaiIpk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    // Metode untuk menampilkan posisi
    public void tampilPoisisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nilai IPK " + x + " ditemukan!");
            System.out.println("Posisi index: " + pos);
        } else {
            System.out.println("Data dengan nilai IPK " + x + " tidak ditemukan!");
        }
    }
    
    // Metode untuk menampilkan data dari hasil search
    public void tampilDataSearch(double x, int pos) {
        System.out.println("\n========== Hasil Pencarian ==========");
        if (pos != -1) {
            System.out.println("Data ditemukan pada posisi " + pos + ":");
            listMhs[pos].tampilkanInfo();
        } else {
            System.out.println("Data dengan nilai IPK " + x + " tidak ditemukan");
        }
    }
}
