# language: id

Fitur: Mengelola Buku
       Mengedit Data Buku

	@Normal
	Skenario: Mengedit Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul buku "dzufiqar"
		Maka respon dari sistem "Data buku ditemukan"

        @Duplikat
        Skenario: Mengedit Data Buku
		Dengan Data buku yang sudah tersedia di database
		Ketika Memasukan judul buku "ridha"
		Maka respon gagal dari sistem "Data buku tidak ditemukan"   
