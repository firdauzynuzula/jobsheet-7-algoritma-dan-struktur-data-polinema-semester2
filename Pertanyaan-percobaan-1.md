1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!
2. Jelaskan fungsi break pada kode program di bawah ini!
    if(listMhs[j].ipk==cari){
        pos=j;
        break;
    }

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan.
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?

Jawab:

1. Perbedaan metode tampilDataSearch dan tampilPoisisi pada class MahasiswaBerprestasi11:
- Metode tampilPoisisi(double x, int pos) digunakan untuk menampilkan apakah data ditemukan atau tidak, serta menampilkan posisi/indeks dari data yang ditemukan dalam array.
- Metode tampilDataSearch(double x, int pos) digunakan untuk menampilkan data lengkap (informasi mahasiswa) yang ditemukan berdasarkan posisi yang diberikan.

Contoh:
- tampilPoisisi(3.8, 1) akan menampilkan: "Data dengan nilai IPK 3.8 ditemukan! Posisi index: 1"
- tampilDataSearch(3.8, 1) akan menampilkan: Data ditemukan pada posisi 1: Nama: Siti Nurhaliza, NIM: 87654321, dst.

---

2. Fungsi break pada kode program di bawah ini:
if(listMhs[i].nilaiIpk == cari) {
    posisi = i;
    break;
}

Break digunakan untuk menghentikan loop for secara langsung setelah menemukan data yang dicari. Ketika kondisi if terpenuhi (nilai IPK cocok), program akan:
- Menyimpan indeks (i) ke dalam variabel posisi
- Langsung keluar dari loop dengan perintah break
- Tidak perlu memeriksa elemen-elemen berikutnya dalam array

Ini menghemat waktu proses karena tidak ada pencarian yang tidak perlu setelah data ditemukan.

---

3. Fungsi variabel pos atau indeks hasil pencarian dalam program sequential search:
Variabel pos (posisi) menyimpan informasi tentang di mana data yang dicari berada dalam array:
- Jika data ditemukan: pos berisi indeks/nomor posisi elemen dalam array (0, 1, 2, dst.)
- Jika data tidak ditemukan: pos tetap bernilai -1 (nilai inisialisasi awal)

Variabel ini sangat penting karena:
- Digunakan di method tampilPoisisi() untuk menentukan apakah data ditemukan atau tidak
- Digunakan di method tampilDataSearch() untuk mengakses dan menampilkan data yang ditemukan
- Membantu program membedakan antara "data ditemukan pada posisi berapa" dan "data tidak ditemukan"

---

4. Jika terdapat lebih dari satu data dengan nilai IPK yang sama:
Hasil pencarian sequential search akan menampilkan data PERTAMA yang ditemukan.

Alasan:
- Loop dimulai dari i = 0 (indeks pertama)
- Ketika menemukan IPK yang sama, perintah break langsung menghentikan loop
- Loop tidak akan melanjutkan ke elemen berikutnya

Contoh:
Jika array berisi: [IPK 3.8, IPK 3.7, IPK 3.8, IPK 3.5] dan mencari 3.8:
- Loop akan menemukan 3.8 pada indeks 0 (elemen pertama)
- break akan mengakhiri loop
- Program menampilkan data pada posisi 0 (data pertama dengan IPK 3.8)
- Data dengan IPK 3.8 pada indeks 2 tidak akan ditemukan

---

5. Jika perintah break dihapus dari kode program:
if(listMhs[i].nilaiIpk == cari) {
    posisi = i;
    // break dihapus
}

Yang akan terjadi:
- Loop akan terus berjalan hingga selesai memeriksa seluruh array
- Jika terdapat lebih dari satu data dengan nilai IPK yang sama, variabel posisi akan terus diperbarui
- Akibatnya, program akan menampilkan posisi dari data TERAKHIR yang ditemukan, bukan yang pertama

Contoh:
Pencarian IPK 3.8 dalam array [IPK 3.8, IPK 3.7, IPK 3.8, IPK 3.5]:
- i=0: posisi = 0 (IPK 3.8 ditemukan pertama kali)
- i=3: posisi = 2 (IPK 3.8 ditemukan lagi, posisi diperbarui)
- Loop selesai, return posisi = 2
- Hasil: Data terakhir yang ditemukan (posisi 2) ditampilkan

Dampak negatif:
- Tidak konsisten dengan kebiasaan sequential search (mendapatkan hasil pertama)
- Bisa membingungkan pengguna yang mengharapkan hasil pertama
- Tidak efisien karena terus memeriksa setelah data ditemukan
