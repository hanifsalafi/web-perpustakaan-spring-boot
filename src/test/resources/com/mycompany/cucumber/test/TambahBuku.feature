# language: id

Feature : Menambah Data Buku

@Normal
Scenario : Menambah Data Buku
	Dengan Data buku yang akan dimasukkan tersedia dan tidak duplikat dengan data yang telah ada di database
	Ketika Memasukkan data buku
	Maka respon "Buku berhasil dimasukkan"
@Duplikat
Scenario : Menambah Data Buku
	Dengan Data buku yang akan dimasukkan tersedia dan duplikat dengan data yang telah ada di database
	Ketika memasukkan data buku
	Maka respon "Buku gagal dimasukkan"

