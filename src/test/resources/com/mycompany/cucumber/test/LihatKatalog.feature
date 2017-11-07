# language: id

Fitur: Mengelola Buku
       Melihat Data Buku

	@Normal
	Skenario: Melihat Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul member "dzulfiqar"
		Maka respon dari sistem "Data buku ditampilkan"

        @Duplikat
        Skenario: Melihat Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul buku "ridha"
		Maka respon gagal dari sistem "Data buku tidak ditemukan"   
