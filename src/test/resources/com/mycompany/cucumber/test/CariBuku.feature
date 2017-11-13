# language: id

Fitur: Mengelola Buku
            Mencari Data Buku

	@Normal
	Skenario: Mencari Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan data buku dengan judul "impal"
		Maka respon pencarian "Data buku ditemukan"

        @Gagal
        Skenario: Mencari Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan data buku dengan judul "belajar impal"
		Maka respon gagal pencarian dengan pesan "Data buku tidak ditemukan"
