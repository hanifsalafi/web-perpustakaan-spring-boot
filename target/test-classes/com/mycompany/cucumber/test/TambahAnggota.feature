# language: id

Fitur: Mengelola Member
	Menambahkan Data Member

	@Normal
	Skenario: Mendaftarkan Member Baru 
		Dengan Data member baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di database
		Ketika Memasukan data member dengan nama "hanif"
		Maka respon "user sukses dimasukan"

        @Duplikat
        Skenario: Mendaftarkan Member Baru
		Dengan Data member baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di database
		Ketika Memasukan data member dengan nama "salafi"
		Maka respon gagal dengan pesan "duplikat"
    

