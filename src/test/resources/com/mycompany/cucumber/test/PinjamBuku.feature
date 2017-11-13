# language: id

Fitur: Mengelola Buku
       Mencari Data Buku

	@Normal
	Skenario: Mencari Data Buku
		Dengan Data buku yang telah sudah tersedia di database
                Ketika Memasukkan data member dengan nama "dzulfi"
		Dan Memasukkan data buku dengan judul "impal"
		Maka respon dari sistem "Peminjaman Berhasil"

        @Gagal
        Skenario: Mencari Data Buku
		Dengan Data buku yang telah sudah tersedia di database
                Ketika Memasukkan data member dengan nama "dzulfi"
		Dan Memasukkan data buku dengan judul "dzulfi"
		Maka respon dari sistem "Peminjaman Gagal"
