$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mycompany/cucumber/test/CariAnggota.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Member",
  "description": "      Mencari Data Member",
  "id": "mengelola-member",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Mencari Data Member",
  "description": "",
  "id": "mengelola-member;mencari-data-member",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data member yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukan nama member \"hanif\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon dari sistem \"Data member ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "CariAnggotaContext.Data_member_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 189246434,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hanif",
      "offset": 23
    }
  ],
  "location": "CariAnggotaContext.Memasukan_nama_member(String)"
});
formatter.result({
  "duration": 5295140,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data member ditemukan",
      "offset": 20
    }
  ],
  "location": "CariAnggotaContext.respon_dari_sistem(String)"
});
formatter.result({
  "duration": 101238,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mencari Data Member",
  "description": "",
  "id": "mengelola-member;mencari-data-member",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data member yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukan nama member \"salafi\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal dari sistem \"Data member tidak ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "CariAnggotaContext.Data_member_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 53184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salafi",
      "offset": 23
    }
  ],
  "location": "CariAnggotaContext.Memasukan_nama_member(String)"
});
formatter.result({
  "duration": 105902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data member tidak ditemukan",
      "offset": 26
    }
  ],
  "location": "CariAnggotaContext.respon_gagal_dari_sistem(String)"
});
formatter.result({
  "duration": 84443,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/CariBuku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Buku",
  "description": "          Mencari Data Buku",
  "id": "mengelola-buku",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Mencari Data Buku",
  "description": "",
  "id": "mengelola-buku;mencari-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data buku yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukan data buku dengan judul \"impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon pencarian \"Data buku ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "CariBukuContext.Data_buku_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 116634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "impal",
      "offset": 34
    }
  ],
  "location": "CariBukuContext.Memasukan_data_buku_dengan_judul(String)"
});
formatter.result({
  "duration": 835093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data buku ditemukan",
      "offset": 18
    }
  ],
  "location": "CariBukuContext.respon_pencarian(String)"
});
formatter.result({
  "duration": 90508,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mencari Data Buku",
  "description": "",
  "id": "mengelola-buku;mencari-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data buku yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukan data buku dengan judul \"belajar impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal pencarian dengan pesan \"Data buku tidak ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "CariBukuContext.Data_buku_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 68581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "belajar impal",
      "offset": 34
    }
  ],
  "location": "CariBukuContext.Memasukan_data_buku_dengan_judul(String)"
});
formatter.result({
  "duration": 89107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data buku tidak ditemukan",
      "offset": 37
    }
  ],
  "location": "CariBukuContext.respon_gagal_pencarian_dengan_pesan(String)"
});
formatter.result({
  "duration": 94706,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/HapusBuku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Buku",
  "description": "          Menghapus Data Buku",
  "id": "mengelola-buku",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Menghapus Data Buku",
  "description": "",
  "id": "mengelola-buku;menghapus-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data buku yang akan dihapus tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukkan data buku yang akan dihapus dengan judul \"impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon sukses hapus dengan pesan \"Buku Berhasil Dihapus\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "HapusBukuContext.Data_buku_yang_akan_dihapus_tersedia_di_database()"
});
formatter.result({
  "duration": 102637,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "impal",
      "offset": 53
    }
  ],
  "location": "HapusBukuContext.Memasukkan_data_buku_yang_akan_dihapus_dengan_judul(String)"
});
formatter.result({
  "duration": 318642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku Berhasil Dihapus",
      "offset": 34
    }
  ],
  "location": "HapusBukuContext.respon_sukses_hapus_dengan_pesan(String)"
});
formatter.result({
  "duration": 116166,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Menghapus Data Buku",
  "description": "",
  "id": "mengelola-buku;menghapus-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data buku yang akan dihapus tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukkan data buku yang akan dihapus dengan judul \"belajar impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal hapus dengan pesan \"Buku Tidak Ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "HapusBukuContext.Data_buku_yang_akan_dihapus_tersedia_di_database()"
});
formatter.result({
  "duration": 56450,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "belajar impal",
      "offset": 53
    }
  ],
  "location": "HapusBukuContext.Memasukkan_data_buku_yang_akan_dihapus_dengan_judul(String)"
});
formatter.result({
  "duration": 85376,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku Tidak Ditemukan",
      "offset": 33
    }
  ],
  "location": "HapusBukuContext.respon_gagal_hapus_dengan_pesan(String)"
});
formatter.result({
  "duration": 90974,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/LihatKatalog.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Buku",
  "description": "     Lihat Katalog",
  "id": "mengelola-buku",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Lihat Katalog",
  "description": "",
  "id": "mengelola-buku;lihat-katalog",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data buku beserta katalognya yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukan Katalog buku \"Edukasi\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon yang akan ditampilkan \"Buku Ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "LihatKatalogContext.Data_buku_beserta_katalognya_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 91440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edukasi",
      "offset": 24
    }
  ],
  "location": "LihatKatalogContext.Memasukkan_Katalog_buku(String)"
});
formatter.result({
  "duration": 125964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku Ditemukan",
      "offset": 30
    }
  ],
  "location": "LihatKatalogContext.respon_yang_akan_ditampilkan(String)"
});
formatter.result({
  "duration": 153489,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Lihat Katalog",
  "description": "",
  "id": "mengelola-buku;lihat-katalog",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data buku beserta katalognya yang sudah tersedia di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukan Katalog buku \"Eduk\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal akan ditampilkan \"Buku Tidak Ditemukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "LihatKatalogContext.Data_buku_beserta_katalognya_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 53184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Eduk",
      "offset": 24
    }
  ],
  "location": "LihatKatalogContext.Memasukkan_Katalog_buku(String)"
});
formatter.result({
  "duration": 98905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku Tidak Ditemukan",
      "offset": 31
    }
  ],
  "location": "LihatKatalogContext.respon_gagal_akan_ditampilkan(String)"
});
formatter.result({
  "duration": 198276,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/PengembalianBuku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Buku",
  "description": "     Pengembalian Data Buku",
  "id": "mengelola-buku",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Mengembalikan Data Buku",
  "description": "",
  "id": "mengelola-buku;mengembalikan-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data buku yang sudah tersedia di database dan sedang dalam masa peminjaman",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukkan data buku yang dipinjam dengan judul \"impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon pengembalian \"Buku berhasil dikembalikan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "PengembalianBukuContext.Data_buku_yang_sudah_tersedia_di_database_dan_sedang_dalam_masa_peminjaman()"
});
formatter.result({
  "duration": 95639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "impal",
      "offset": 49
    }
  ],
  "location": "PengembalianBukuContext.Memasukkan_data_buku_yang_dipinjam_dengan_judul(String)"
});
formatter.result({
  "duration": 103570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku berhasil dikembalikan",
      "offset": 21
    }
  ],
  "location": "PengembalianBukuContext.respon_pengembalian(String)"
});
formatter.result({
  "duration": 106836,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mengembalikan Data Buku",
  "description": "",
  "id": "mengelola-buku;mengembalikan-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Gagal"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data buku yang sudah tersedia di database dan sedang dalam masa peminjaman",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukkan data buku yang dipinjam dengan judul \"belajar impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon pengembalian gagal \"Buku gagal dikembalikan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "PengembalianBukuContext.Data_buku_yang_sudah_tersedia_di_database_dan_sedang_dalam_masa_peminjaman()"
});
formatter.result({
  "duration": 54118,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "belajar impal",
      "offset": 49
    }
  ],
  "location": "PengembalianBukuContext.Memasukkan_data_buku_yang_dipinjam_dengan_judul(String)"
});
formatter.result({
  "duration": 83043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku gagal dikembalikan",
      "offset": 27
    }
  ],
  "location": "PengembalianBukuContext.respon_pengembalian_gagal(String)"
});
formatter.result({
  "duration": 306512,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/TambahAnggota.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Member",
  "description": "Menambahkan Data Member",
  "id": "mengelola-member",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Mendaftarkan Member Baru",
  "description": "",
  "id": "mengelola-member;mendaftarkan-member-baru",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data member baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukan data member dengan nama \"hanif\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon \"user sukses dimasukan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TambahAnggotaContext.Data_member_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database()"
});
formatter.result({
  "duration": 101704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hanif",
      "offset": 35
    }
  ],
  "location": "TambahAnggotaContext.memasukan_data_member_dengan_nama(String)"
});
formatter.result({
  "duration": 113834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user sukses dimasukan",
      "offset": 8
    }
  ],
  "location": "TambahAnggotaContext.respon(String)"
});
formatter.result({
  "duration": 104037,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mendaftarkan Member Baru",
  "description": "",
  "id": "mengelola-member;mendaftarkan-member-baru",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Duplikat"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data member baru yang akan dimasukan tersedia dan tidak duplikat dengan data yang telah ada di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukan data member dengan nama \"salafi\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal dengan pesan \"duplikat\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TambahAnggotaContext.Data_member_baru_yang_akan_dimasukan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database()"
});
formatter.result({
  "duration": 188479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salafi",
      "offset": 35
    }
  ],
  "location": "TambahAnggotaContext.memasukan_data_member_dengan_nama(String)"
});
formatter.result({
  "duration": 174483,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "duplikat",
      "offset": 27
    }
  ],
  "location": "TambahAnggotaContext.respon_gagal_dengan_pesan(String)"
});
formatter.result({
  "duration": 107769,
  "status": "passed"
});
formatter.uri("com/mycompany/cucumber/test/TambahBuku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Buku",
  "description": "          Menambahkan Data Buku",
  "id": "mengelola-buku",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Menambah Data Buku",
  "description": "",
  "id": "mengelola-buku;menambah-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 6,
      "name": "@Normal"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Data buku yang akan dimasukkan tersedia dan tidak duplikat dengan data yang telah ada di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 9,
  "name": "Memasukkan data buku yang akan ditambahkan dengan judul \"impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 10,
  "name": "respon berhasil dengan pesan \"Buku berhasil dimasukkan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TambahBukuContext.Data_buku_yang_akan_dimasukkan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database()"
});
formatter.result({
  "duration": 196876,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "impal",
      "offset": 57
    }
  ],
  "location": "TambahBukuContext.memasukkan_data_buku_yang_akan_ditambahkan_dengan_judul(String)"
});
formatter.result({
  "duration": 158621,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku berhasil dimasukkan",
      "offset": 30
    }
  ],
  "location": "TambahBukuContext.respon_berhasil_dengan_pesan(String)"
});
formatter.result({
  "duration": 113834,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Menambah Data Buku",
  "description": "",
  "id": "mengelola-buku;menambah-data-buku",
  "type": "scenario",
  "keyword": "Skenario",
  "tags": [
    {
      "line": 12,
      "name": "@Duplikat"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Data buku yang akan dimasukkan tersedia dan tidak duplikat dengan data yang telah ada di database",
  "keyword": "Dengan "
});
formatter.step({
  "line": 15,
  "name": "Memasukkan data buku yang akan ditambahkan dengan judul \"belajar impal\"",
  "keyword": "Ketika "
});
formatter.step({
  "line": 16,
  "name": "respon gagal tambah dengan pesan \"Buku gagal dimasukkan\"",
  "keyword": "Maka "
});
formatter.match({
  "location": "TambahBukuContext.Data_buku_yang_akan_dimasukkan_tersedia_dan_tidak_duplikat_dengan_data_yang_telah_ada_di_database()"
});
formatter.result({
  "duration": 53184,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "belajar impal",
      "offset": 57
    }
  ],
  "location": "TambahBukuContext.memasukkan_data_buku_yang_akan_ditambahkan_dengan_judul(String)"
});
formatter.result({
  "duration": 90041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Buku gagal dimasukkan",
      "offset": 34
    }
  ],
  "location": "TambahBukuContext.respon_gagal_tambah_dengan_pesan(String)"
});
formatter.result({
  "duration": 177282,
  "status": "passed"
});
});