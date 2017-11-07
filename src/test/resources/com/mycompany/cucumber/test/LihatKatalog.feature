# language: id

Fitur: Mengelola Buku
       Melihat Data Buku

	@Normal
	Skenario: Mengedit Data Member
		Dengan Data member yang sudah tersedia di database
		Ketika Memasukan nama member "hanif"
		Maka respon dari sistem "Data member ditemukan"

        @Duplikat
        Skenario: Mengedit Data Member
		Dengan Data member yang sudah tersedia di database
		Ketika Memasukan nama member "salafi"
		Maka respon gagal dari sistem "Data member tidak ditemukan"   
