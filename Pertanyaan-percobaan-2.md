1. Tunjukkan pada kode program yang mana proses divide dijalankan!
JAWAB:
Proses divide (pembagian) dijalankan pada method findBinarySearch() di class MahasiswaBerprestasi11. Tepatnya pada baris:
int mid = (left + right) / 2;

Baris ini membagi ruang pencarian menjadi dua bagian:
- Elemen di sebelah kiri mid (indeks 0 sampai mid-1)
- Elemen di sebelah kanan mid (indeks mid+1 sampai right)

Dengan cara ini, array dibagi menjadi dua bagian secara terus-menerus sampai elemen ditemukan atau pencarian selesai.

---

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
JAWAB:
Proses conquer (penaklukan) dijalankan pada bagian perbandingan di dalam method findBinarySearch():
if (cari == listMhs[mid].nilaiIpk) {
    return (mid);
}
else if (listMhs[mid].nilaiIpk > cari) {
    return findBinarySearch(cari, left, mid - 1);
} else {
    return findBinarySearch(cari, mid + 1, right);
}

Pada bagian ini, program membandingkan nilai IPK di tengah (mid) dengan nilai yang dicari (cari), kemudian:
- Jika sama: return posisi mid (data ditemukan)
- Jika listMhs[mid].nilaiIpk lebih besar: cari di bagian kiri dengan recursive call
- Jika listMhs[mid].nilaiIpk lebih kecil: cari di bagian kanan dengan recursive call

---

3. Apa fungsi left, right, dan mid?
JAWAB:
- left: Variabel yang menyimpan indeks batas kiri dari ruang pencarian. Dimulai dari 0 (elemen pertama array) dan dapat berubah sesuai hasil perbandingan.
- right: Variabel yang menyimpan indeks batas kanan dari ruang pencarian. Dimulai dari (jumlahMahasiswa - 1) yaitu indeks elemen terakhir array yang valid.
- mid: Variabel yang menyimpan indeks titik tengah antara left dan right. Digunakan sebagai elemen referensi untuk perbandingan. Dihitung dengan rumus: mid = (left + right) / 2.

Ketiganya bekerja bersama-sama untuk mengimplementasikan strategi divide-and-conquer dalam binary search.

---

4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
JAWAB:
Tidak, program TIDAK akan berjalan dengan benar jika data IPK tidak terurut (sorted). Alasannya:
- Binary search memerlukan data yang SUDAH TERURUT sebagai prasyarat fundamental.
- Algoritma ini bekerja dengan prinsip membagi dua untuk menghilangkan setengah dari ruang pencarian pada setiap iterasi.
- Jika data tidak urut, perbandingan di mid tidak memberikan informasi yang benar tentang di mana data seharusnya berada.
- Hasilnya adalah kemungkinan besar data yang dicari tidak akan ditemukan meskipun sebenarnya ada dalam array.
- Data juga mungkin ditampilkan di posisi yang salah.

Contoh kesalahan:
Jika array tidak terurut: [3.2, 3.9, 3.5, 3.7, 3.8] dan mencari 3.2:
- mid akan menunjuk ke 3.5, program akan assume 3.2 ada di kanan (karena 3.2 < 3.5)
- Pencarian akan bergerak ke bagian kanan, melewatkan 3.2 yang sebenarnya ada di kiri
- Hasil: Data tidak ditemukan (SALAH)

---

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.9, 3.8, 3.7, 3.5, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary search agar hasilnya sesuai.
JAWAB:
Jika data diurutkan dari terbesar ke terkecil (DESCENDING), binary search standar dalam kode TIDAK akan memberikan hasil yang benar.

Proses dengan data [3.9, 3.8, 3.7, 3.5, 3.2] mencari 3.2:
1. left=0, right=4, mid=2 → listMhs[2].nilaiIpk = 3.7
2. Kode: 3.7 > 3.2? YES → cari di kanan (mid+1)
3. Tapi di descending, 3.2 sebenarnya ADA DI KIRI!
4. Hasil: Data tidak ditemukan (SALAH)

Untuk memperbaiki, data HARUS DIURUTKAN ASCENDING (dari kecil ke besar) dahulu sebelum melakukan binary search.

Alternatif: Modifikasi kode untuk descending:
if (cari == listMhs[mid].nilaiIpk) {
    return mid;
} else if (listMhs[mid].nilaiIpk < cari) {  // Ubah dari > menjadi <
    return findBinarySearch(cari, left, mid - 1);
} else {
    return findBinarySearch(cari, mid + 1, right);
}

Dengan modifikasi ini, program akan mencari ke arah yang benar saat data diurutkan menurun (descending).

---

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
JAWAB:
Binary search menentukan bahwa data tidak ditemukan melalui base case dalam recursive method:
if (right >= left) {
    // Proses pencarian
    ...
} 
return -1;  // Data tidak ditemukan

Penjelasannya:
- Program terus melakukan pencarian selama kondisi `right >= left` masih bernilai true.
- Jika data dicari tetapi tidak ditemukan, maka:
  - Nilai `left` akan terus bertambah (bergerak ke kanan)
  - Nilai `right` akan terus berkurang (bergerak ke kiri)
- Pada suatu titik, kondisi `right < left` akan menjadi true, yang berarti ruang pencarian sudah habis (kosong).
- Ketika kondisi `right >= left` menjadi false, recursive call berhenti dan method return -1.
- Return value -1 menginformasikan bahwa pencarian gagal/data tidak ada dalam array.

Contoh:
Array: [3.2, 3.5, 3.7, 3.8, 3.9] mencari 4.0
- left=0, right=4, mid=2 → 3.7 < 4.0 → cari kanan
- left=3, right=4, mid=3 → 3.8 < 4.0 → cari kanan  
- left=4, right=4, mid=4 → 3.9 < 4.0 → cari kanan
- left=5, right=4 → right < left → STOP, return -1

---

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
JAWAB:
Program sudah dimodifikasi dengan input dari keyboard. Berikut implementasinya di MahasiswaDemo11.java:

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
        
        // Lakukan binary search
        System.out.println("\n--- Pencarian Binary Search ---");
        System.out.print("Masukkan nilai IPK yang ingin dicari: ");
        double nilaiCariBinary = sc.nextDouble();
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCariBinary);

        // Tampilan hasil pencarian menggunakan binary search
        System.out.println("\n--- Hasil Pencarian meggunakan binary searching ---");
        int posisiBinary = list.findBinarySearch(nilaiCariBinary, 0, jumlahMahasiswa - 1);
        list.tampilPoisisi(nilaiCariBinary, posisiBinary);
        list.tampilDataSearch(nilaiCariBinary, posisiBinary);
    }
}

Dengan implementasi ini, program akan:
- Meminta pengguna memasukkan jumlah mahasiswa (fixed di 5, dapat diubah)
- Meminta pengguna memasukkan data masing-masing mahasiswa: NIM, Nama, Kelas, Nilai IPK
- Menampilkan semua data mahasiswa yang telah diinput
- Meminta pengguna memasukkan nilai IPK yang ingin dicari
- Melakukan binary search dan menampilkan hasil pencarian
- Gunakan method findBinarySearch(nilaiCari, 0, jumlahMahasiswa - 1) untuk mencari

CATATAN PENTING:
Binary search hanya akan bekerja dengan benar jika data IPK SUDAH TERURUT dalam urutan ASCENDING (dari kecil ke besar)!
Jika pengguna memasukkan data tidak terurut, hasil binary search akan tidak akurat.