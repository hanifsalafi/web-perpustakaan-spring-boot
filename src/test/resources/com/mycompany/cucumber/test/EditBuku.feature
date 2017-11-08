# language: id

Feature : Mengedit Buku

@Normal
Scenario : Mengedit Data Buku
	Dengan Data Buku  dan ID buku yang akan diedit dan Data Buku yang akan di database ada
        Ketika ID buku yang akan diedit diari dan edit buku
	Maka Respon "Buku berhasil diedit"

@Duplikat
Scenario : Mengedit Data Buku
	Dengan Data Buku dan ID buku yang akan diedit dan Data Buku yang akan di database tidak ada
        Ketika buku yang dicari dengan ID buku yang akan diedit 
	Maka Respon "Buku tidak berhasil diedit"
