# language: id

Feature : Mengedit Buku

@Normal
Scenario : Mengedit Data Buku
	Dengan Data Buku yang udah tersedia di database 
        Ketika memasukkan nama buku "bukuWitsqa"
	Maka Respon "Buku berhasil diedit"

@Duplikat
Scenario : Mengedit Data Buku
	Dengan Data Buku yang udah tersedia di database
        Ketika memasukkan nama buku "bukuWitsqa"
	Maka Respon "Buku tidak berhasil diedit"

