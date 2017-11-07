# language: id

Fitur: Mengelola Buku
       Melihat Katalog Buku

	@Normal
	Skenario: Melihat Katalog Buku
		Dengan Data kategori buku yang sudah tersedia di database
		Ketika Memasukan kategori buku "dzulfiqar"
		Maka respon dari sistem "Data buku ditampilkan"

        @Duplikat
        Skenario: Melihat Katalog Buku
		Dengan Data kategori buku yang sudah tersedia di database
		Ketika Memasukan kategori buku "ridha"
		Maka respon gagal dari sistem "Data kategori buku tidak ditemukan"   
