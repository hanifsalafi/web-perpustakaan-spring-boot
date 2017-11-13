# language: id

Fitur: Mengelola Buku
            Menghapus Data Buku

        @Normal
        Skenario: Menghapus Data Buku
                Dengan Data buku yang akan dihapus tersedia di database
                Ketika Memasukkan data buku yang akan dihapus dengan judul "impal"
                Maka respon sukses hapus dengan pesan "Buku Berhasil Dihapus"

        @Gagal
        Skenario: Menghapus Data Buku
                Dengan Data buku yang akan dihapus tersedia di database
                Ketika Memasukkan data buku yang akan dihapus dengan judul "belajar impal"
                Maka respon gagal hapus dengan pesan "Buku Tidak Ditemukan"
