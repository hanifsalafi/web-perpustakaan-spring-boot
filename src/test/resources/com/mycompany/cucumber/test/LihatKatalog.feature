# language: id

Fitur: Mengelola Buku
       Lihat Katalog

	@Normal
	Skenario: Lihat Katalog 
		Dengan Data buku beserta katalognya yang sudah tersedia di database
		Ketika Memasukan Katalog buku "Edukasi"
		Maka respon dari sistem akan menampilkan "Buku Ditemukan"

        @Duplikat
        Skenario: Lihat Katalog 
		Dengan Data buku beserta katalognya yang sudah tersedia di database
		Ketika Memasukan Katalog buku "Eduk"
		Maka respon gagal dari sistem akan menampilkan "Buku Tidak Ditemukan"
