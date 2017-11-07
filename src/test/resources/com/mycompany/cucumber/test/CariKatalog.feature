# language: id

Fitur: Mengelola Buku
       Mencari Data Buku

	@Normal
	Skenario: Mencari Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul buku "dzulfiqar"
		Maka respon dari sistem "Data member ditemukan"

        @Duplikat
        Skenario: Mencari Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul buku "ridha"
		Maka respon gagal dari sistem "Data buku tidak ditemukan"   
