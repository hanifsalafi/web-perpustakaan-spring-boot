# language: id

Fitur: Mengelola Buku
       Pengembalian Data Buku

	@Normal
	Skenario: Mengembalikan Data Buku
		Dengan Data buku yang sudah tersedia di database dan sedang dalam masa peminjaman
                Ketika Memasukkan data buku yang dipinjam dengan judul "impal"
		Maka respon pengembalian "Buku berhasil dikembalikan"

        @Gagal
        Skenario: Mengembalikan Data Buku
		Dengan Data buku yang sudah tersedia di database dan sedang dalam masa peminjaman
                Ketika Memasukkan data buku yang dipinjam dengan judul "belajar impal"
		Maka respon pengembalian gagal "Buku gagal dikembalikan"