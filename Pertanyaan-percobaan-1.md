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

1. Metode tampilDataSearch digunakan untuk menampilkan data mahasiswa yang ditemukan berdasarkan hasil pencarian, sedangkan tampilPosisi digunakan untuk menampilkan posisi atau indeks dari data yang ditemukan dalam array.

2. Fungsi break pada kode program tersebut adalah untuk menghentikan proses pencarian lebih lanjut setelah menemukan data yang dicari. Ketika kondisi if terpenuhi (data ditemukan), break akan keluar dari loop, sehingga tidak perlu memeriksa elemen-elemen berikutnya dalam array.

3. Fungsi variabel pos atau indeks hasil pencarian dalam program sequential search adalah untuk menyimpan posisi atau indeks dari data yang ditemukan dalam array. Jika data ditemukan, pos akan berisi indeks dari elemen tersebut; jika tidak ditemukan, pos biasanya akan tetap dengan nilai awal (misalnya -1) untuk menunjukkan bahwa data tidak ada dalam array.

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data pertama yang ditemukan. Hal ini karena setelah menemukan data pertama yang cocok, perintah break akan menghentikan loop, sehingga tidak akan memeriksa elemen-elemen berikutnya yang mungkin juga memiliki nilai yang sama.

5. Jika perintah break dihapus dari kode di atas, maka program akan terus memeriksa seluruh elemen dalam array meskipun sudah menemukan data yang dicari. Akibatnya, jika terdapat lebih dari satu data dengan nilai yang sama, program akan menampilkan posisi dari data terakhir yang ditemukan, bukan yang pertama. Hal ini bisa menyebabkan kebingungan jika pengguna mengharapkan untuk mendapatkan posisi dari data pertama yang ditemukan.
