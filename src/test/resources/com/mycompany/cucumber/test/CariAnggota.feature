# language: id

Fitur: Mengelola Member
        Mencari Data Member

	@Normal
	Skenario: Mencari Data Member
		Dengan Data member yang sudah tersedia di database
		Ketika Memasukan nama member "hanif"
		Maka respon dari sistem "Data member ditemukan"

        @Gagal
        Skenario: Mencari Data Member
		Dengan Data member yang sudah tersedia di database
		Ketika Memasukan nama member "salafi"
		Maka respon gagal dari sistem "Data member tidak ditemukan"
