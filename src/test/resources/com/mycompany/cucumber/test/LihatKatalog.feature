# language: id

Fitur: Mengelola Buku
       Lihat Katalog

	    @Normal
	    Skenario: Lihat Katalog
		Dengan Data buku beserta katalognya yang sudah tersedia di database
		Ketika Memasukan Katalog buku "Edukasi"
		Maka respon yang akan ditampilkan "Buku Ditemukan"

        @Gagal
        Skenario: Lihat Katalog
		Dengan Data buku beserta katalognya yang sudah tersedia di database
		Ketika Memasukan Katalog buku "Eduk"
		Maka respon gagal akan ditampilkan "Buku Tidak Ditemukan"
