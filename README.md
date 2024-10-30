Sistem Tiket Kereta
Proyek ini adalah sistem sederhana untuk mengelola tiket kereta, yang mencakup informasi penumpang, kereta, rute perjalanan, serta detail tiket.

Struktur Kode
Proyek ini menggunakan beberapa kelas sebagai berikut:

1. Kereta2
Mewakili seorang penumpang.
Atribut:
name: Nama penumpang.
Metode:
Kereta2(String name): Konstruktor untuk membuat objek Kereta2 dengan nama penumpang.
getName(): Mengembalikan nama penumpang.
2. Train
Mewakili kereta.
Atribut:
trainName: Nama kereta.
Metode:
Train(String trainName): Konstruktor untuk membuat objek Train dengan nama kereta.
getTrainName(): Mengembalikan nama kereta.
3. Route
Mewakili rute perjalanan dari stasiun keberangkatan ke stasiun tujuan.
Atribut:
departureStation: Nama stasiun keberangkatan.
arrivalStation: Nama stasiun kedatangan.
Metode:
Route(String departureStation, String arrivalStation): Konstruktor untuk membuat objek Route dengan stasiun keberangkatan dan kedatangan.
getDepartureStation(): Mengembalikan stasiun keberangkatan.
getArrivalStation(): Mengembalikan stasiun kedatangan.
4. Ticket
Mewakili tiket perjalanan.
Atribut:
kereta2: Objek dari kelas Kereta2, mewakili penumpang.
train: Objek dari kelas Train, mewakili kereta.
route: Objek dari kelas Route, mewakili rute perjalanan.
departureTime: Waktu keberangkatan.
price: Harga tiket.
Metode:
Ticket(Kereta2 kereta2, Train train, Route route, String departureTime, double price): Konstruktor untuk membuat objek Ticket dengan informasi lengkap tiket.
printTicketDetails(): Mencetak detail tiket.
5. Main
Berfungsi sebagai titik awal program.
Membuat objek Kereta2, Train, Route, dan Ticket, lalu menampilkan detail tiket melalui metode printTicketDetails().
Cara Menjalankan Program
Kompilasi kode menggunakan perintah berikut:
javac Setelah/Main.java
