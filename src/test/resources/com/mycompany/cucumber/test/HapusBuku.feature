# language: id

Normal
Scenario : Menghapus Buku
	Dengan ID Buku  yang akan dihapus ada dan data buku yang akan dihapus ada di database
	Ketika mencari data buku dengan id yang akan dihapus dan hapus buku
	Maka respon "Buku Berhasil dihapus",
@Duplikat
Scenario : Menghapus Buku
	Dengan ID Buku yang akan dihapus ada dan data buku yang akan dihapus tidak ada di database
	Ketika mencari data buku dengan id yang akan dihapus
	Maka respon "Buku tidak ada"
