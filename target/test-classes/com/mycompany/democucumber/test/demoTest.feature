# language: id

Fitur: Mengelola User
	Mengelola data user

	@Normal
	Skenario: Memasukan User Baru 
		Dengan Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem
		Ketika Memasukan data user dengan nama "badu"
		Maka respon "user sukses dimasukan"

        @Duplikat
        Skenario: Memasukan User Baru 
		Dengan Data user baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di sistem
		Ketika Memasukan data user dengan nama "deni"
		Maka respon gagal dengan pesan "duplicate"
