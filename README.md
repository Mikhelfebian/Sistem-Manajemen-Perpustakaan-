# Sistem Manajemen Perpustakaan Kampus

## Implementasi dan Pembahasan Bagian Anggota 1 (Array 1D dan Array 2D)

### 1. Deskripsi Fitur Anggota 1
Pada bagian ini, fokus utama pengembangan adalah mengimplementasikan **Array 1 Dimensi** dan **Array 2 Dimensi** ke dalam sistem manajemen perpustakaan berbasis Java.

* **Array 1 Dimensi** digunakan untuk menyimpan data nama-nama kategori buku yang tersedia di perpustakaan.
* **Array 2 Dimensi** digunakan untuk merepresentasikan matriks data jumlah peminjaman buku berdasarkan kategori dan hari dalam seminggu (Senin sampai Sabtu).

---

### 2. Penjelasan *Source Code* Baris demi Baris
Berikut adalah penjelasan rinci baris demi baris dari kode program yang diimplementasikan pada bagian Anggota 1:

* `import java.util.Scanner;`
  Berfungsi untuk mengimpor kelas `Scanner` dari pustaka bawaan Java, yang digunakan untuk membaca input teks atau angka dari pengguna melalui konsol.

* `public class Main {`
  Mendeklarasikan kelas utama (*main class*) dengan nama `Main` yang menjadi wadah bagi seluruh blok program Java.

* `public static void main(String[] args) {`
  Merupakan metode utama (*main method*) tempat eksekusi program dimulai oleh Java Virtual Machine (JVM).

* `Scanner scanner = new Scanner(System.in);`
  Menginisialisasi objek `scanner` baru agar program dapat mendeteksi dan membaca pilihan menu yang diketikkan oleh pengguna.

* `String[] kategoriBuku = {"Pemrograman", "Matematika", "Jaringan Komputer", "Basis Data"};`
  Mendeklarasikan dan menginisialisasi sebuah **Array 1 Dimensi** bertipe data `String` dengan nama `kategoriBuku` yang menyimpan empat elemen nama kategori buku perpustakaan.

* `int[][] dataPeminjaman = { {5, 8, 3, 6, 9, 4}, ... };`
  Mendeklarasikan dan menginisialisasi **Array 2 Dimensi** bertipe data `int` (integer) dengan nama `dataPeminjaman`. Matriks ini berukuran 4 baris (mewakili setiap kategori buku) dan 6 kolom (mewakili jumlah peminjaman dari hari Senin hingga Sabtu).

* `String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};`
  Mendeklarasikan Array 1 Dimensi bertipe `String` untuk menyimpan label nama-nama hari yang akan digunakan sebagai header kolom pada tabel laporan peminjaman.

* `boolean jalan = true;` dan `while (jalan) { ... }`
  Membuat variabel kontrol *boolean* bernilai `true` untuk menjalankan perulangan *while* terus-menerus agar menu interaktif dapat diakses berulang kali hingga pengguna memilih untuk keluar.

* `int pilihan = scanner.nextInt();`
  Membaca angka pilihan menu yang dimasukkan oleh pengguna melalui konsol.

* **Struktur Percabangan `switch (pilihan)`:**
  * `case 1:` Menjalankan blok kode untuk menampilkan isi Array 1 Dimensi menggunakan perulangan `for` (`for (int i = 0; i < kategoriBuku.length; i++)`), mencetak nomor urut beserta nama kategori buku satu per satu.
  * `case 2:` Menjalankan blok kode untuk menampilkan data Array 2 Dimensi. Menggunakan perulangan bersarang (*nested loop*) di mana perulangan luar (`i`) mengatur baris kategori dan perulangan dalam (`j`) mengatur kolom hari, serta memanfaatkan fungsi `String.format` agar keluaran teks tercetak rapi menyerupai tabel.
  * `case 3:` Mengubah nilai variabel `jalan` menjadi `false` untuk menghentikan perulangan *while* dan keluar dari menu Anggota 1.
  * `default:` Menampilkan pesan peringatan apabila pengguna memasukkan angka pilihan di luar rentang menu yang tersedia.

* `scanner.close();`
  Menutup objek `scanner` setelah perulangan selesai untuk mencegah kebocoran sumber daya memori (*resource leak*).

---

### 3. Skenario Pengujian Fitur Anggota 1

* **Skenario Pengujian Tampilan Kategori (Menu 1)**
  * **Langkah:** Pengguna menjalankan program, lalu memasukkan angka `1` pada menu interaktif.
  * **Hasil yang Diharapkan:** Program mencetak daftar empat kategori buku secara berurutan mulai dari nomor 1 hingga 4 (*Pemrograman, Matematika, Jaringan Komputer, Basis Data*).

* **Skenario Pengujian Tampilan Data Peminjaman (Menu 2)**
  * **Langkah:** Pengguna memasukkan angka `2` pada menu interaktif.
  * **Hasil yang Diharapkan:** Program menampilkan tabel matriks yang menyelaraskan nama kategori buku dengan jumlah peminjaman harian dari hari Senin sampai Sabtu secara rapi dan terstruktur.

* **Skenario Pengujian Keluar Menu (Menu 3)**
  * **Langkah:** Pengguna memasukkan angka `3`.
  * **Hasil yang Diharapkan:** Program mencetak pesan keluar (`"Keluar dari menu Anggota 1"`) dan menghentikan eksekusi perulangan menu.
