1. Tunjukkan pada kode program yang mana proses divide dijalankan!
JAWAB:
Proses divide (pembagian) dijalankan pada baris yang menghitung titik tengah array:
int mid = (left + right) / 2;
Baris ini membagi ruang pencarian menjadi dua bagian: elemen di sebelah kiri mid dan elemen di sebelah kanan mid. Dengan cara ini, array dibagi menjadi dua bagian secara terus-menerus sampai ditemukan elemen yang dicari atau pencarian selesai.

---

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
JAWAB:
Proses conquer (penaklukan) dijalankan pada bagian perbandingan dan penyesuaian range pencarian:
if (data[mid].ambilNilaiIpk() == cari) {
    return mid;
} else if (data[mid].ambilNilaiIpk() < cari) {
    left = mid + 1;
} else {
    right = mid - 1;
}
Pada bagian ini, program membandingkan nilai IPK di tengah dengan nilai yang dicari, kemudian menyesuaikan batas pencarian (left atau right) berdasarkan hasil perbandingan.

---

3. Apa fungsi left, right, dan mid?
JAWAB:
- left: Variabel yang menyimpan indeks batas kiri dari ruang pencarian. Dimulai dari 0 (elemen pertama array).
- right: Variabel yang menyimpan indeks batas kanan dari ruang pencarian. Dimulai dari n-1 (elemen terakhir array).
- mid: Variabel yang menyimpan indeks titik tengah antara left dan right. Digunakan untuk membagi array menjadi dua bagian. Dihitung dengan rumus: mid = (left + right) / 2.

---

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
JAWAB:
Tidak, program tidak akan berjalan dengan benar jika data IPK tidak urut. Alasannya adalah:
- Binary search memerlukan data yang sudah terurut (sorted) sebagai prasyarat fundamental.
- Algoritma ini bekerja dengan prinsip membagi dua untuk menghilangkan setengah dari ruang pencarian pada setiap iterasi.
- Jika data tidak urut, perbandingan di mid tidak memberikan informasi yang benar tentang di mana data seharusnya berada.
- Hasilnya adalah kemungkinan data yang dicari tidak ditemukan meskipun sebenarnya ada dalam array, atau hasil pencarian menjadi tidak akurat.

---

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai.
JAWAB:
Jika data diurutkan dari terbesar ke terkecil, binary search standar TIDAK akan memberikan hasil yang benar. Program perlu dimodifikasi:

Kode asli (untuk urutan ascending):
if (data[mid].ambilNilaiIpk() == cari) {
    return mid;
} else if (data[mid].ambilNilaiIpk() < cari) {
    left = mid + 1;
} else {
    right = mid - 1;
}

Kode yang dimodifikasi (untuk urutan descending):
if (data[mid].ambilNilaiIpk() == cari) {
    return mid;
} else if (data[mid].ambilNilaiIpk() > cari) {  // Ubah dari < menjadi >
    left = mid + 1;
} else {
    right = mid - 1;
}

Dengan modifikasi ini, program akan mencari ke arah yang benar saat data diurutkan menurun (descending).

---

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
JAWAB:
Binary search menentukan bahwa data tidak ditemukan melalui kondisi loop:
while (left <= right) {
    // Proses pencarian
}
- Program terus melakukan pencarian selama kondisi `left <= right` masih bernilai true.
- Jika data dicari tetapi tidak ditemukan, maka nilai `left` akan terus bertambah dan nilai `right` akan terus berkurang.
- Pada suatu titik, kondisi `left > right` akan menjadi true, yang berarti ruang pencarian sudah habis (kosong).
- Ketika loop berhenti, jika nilai return belum diberikan, itu berarti data yang dicari tidak ada dalam array.
- Biasanya program akan mengembalikan nilai -1 atau pesan "Data tidak ditemukan" untuk menginformasikan bahwa pencarian gagal.

---

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
JAWAB:
Program dapat dimodifikasi dengan menambahkan input dari keyboard menggunakan Scanner:

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = inputan.nextInt();
        inputan.nextLine(); // Membersihkan newline
        
        // Buat array mahasiswa sesuai jumlah yang diinput
        MahasiswaBerprestasi11[] daftarMahasiswa = new MahasiswaBerprestasi11[jumlah];
        
        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\\n--- Masukkan Data Mahasiswa " + (i + 1) + " ---");
            
            System.out.print("Nama: ");
            String nama = inputan.nextLine();
            
            System.out.print("NIM: ");
            String nim = inputan.nextLine();
            
            System.out.print("Nilai IPK: ");
            double nilaiIpk = inputan.nextDouble();
            
            System.out.print("Semester: ");
            int semester = inputan.nextInt();
            
            inputan.nextLine(); // Membersihkan newline
            System.out.print("Program Studi: ");
            String prodi = inputan.nextLine();
            
            System.out.print("Nilai Prestasi: ");
            double nilaiPrestasi = inputan.nextDouble();
            
            inputan.nextLine(); // Membersihkan newline
            System.out.print("Beasiswa: ");
            String beasiswa = inputan.nextLine();
            
            // Buat objek dan simpan di array
            daftarMahasiswa[i] = new MahasiswaBerprestasi11(nama, nim, nilaiIpk, semester, prodi, nilaiPrestasi, beasiswa);
        }
        
        // Tampilkan data mahasiswa
        System.out.println("\\n========================================");
        System.out.println("Data Mahasiswa yang Diinputkan");
        System.out.println("========================================");
        for (int i = 0; i < jumlah; i++) {
            daftarMahasiswa[i].tampilkanInfoLengkap();
            System.out.println();
        }
        
        inputan.close();
    }
}

Dengan modifikasi ini, program akan:
- Meminta pengguna memasukkan jumlah mahasiswa yang akan diinput
- Membuat array dengan ukuran sesuai jumlah yang diinput
- Meminta pengguna memasukkan data masing-masing mahasiswa secara berurutan
- Menampilkan semua data mahasiswa yang telah diinput.