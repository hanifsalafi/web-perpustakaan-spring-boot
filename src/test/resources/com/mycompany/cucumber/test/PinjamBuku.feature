# language: id

Fitur: Mengelola Buku
       Mencari Data Buku

	@Normal
	Skenario: Mencari Data Buku
		Dengan Data buku yang telah tersedia di database
                Ketika input data member dengan nama "dzulfi"
		Dan input data buku dengan judul "impal"
		Maka respon dari sistem adalah "Peminjaman Berhasil"

        @Gagal
        Skenario: Mencari Data Buku
		Dengan Data buku yang telah tersedia di database
                Ketika input data member dengan nama "dzulfi"
		Dan input data buku dengan judul "dzulfi"
		Maka respon dari sistem iyalah "Peminjaman Gagal"
