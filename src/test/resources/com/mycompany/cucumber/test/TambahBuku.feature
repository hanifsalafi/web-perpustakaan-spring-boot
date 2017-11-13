# language: id

Fitur: Mengelola Buku
            Menambahkan Data Buku

        @Normal
        Skenario: Menambah Data Buku
                Dengan Data buku yang akan dimasukkan tersedia dan tidak duplikat dengan data yang telah ada di database
                Ketika Memasukkan data buku yang akan ditambahkan dengan judul "impal"
                Maka respon berhasil dengan pesan "Buku berhasil dimasukkan"

        @Duplikat
        Skenario: Menambah Data Buku
                Dengan Data buku yang akan dimasukkan tersedia dan duplikat dengan data yang telah ada di database
                Ketika memasukkan data buku yang akan ditambahkan dengan judul "belajar impal"
                Maka respon gagal tambah dengan pesan "Buku gagal dimasukkan"

