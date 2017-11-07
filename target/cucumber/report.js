$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/mycompany/cucumber/test/EditAnggota.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: id"
    }
  ],
  "line": 3,
  "name": "Mengelola Member",
  "description": "      Mengedit Data Member",
  "id": "mengelola-member",
  "keyword": "Fitur"
});
formatter.scenario({
  "line": 7,
  "name": "Mengedit Data Member",
  "description": "",
  "id": "mengelola-member;mengedit-data-member",
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
  "location": "EditAnggotaContext.Data_member_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 164875804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hanif",
      "offset": 23
    }
  ],
  "location": "EditAnggotaContext.Memasukan_nama_member(String)"
});
formatter.result({
  "duration": 4390536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data member ditemukan",
      "offset": 20
    }
  ],
  "location": "EditAnggotaContext.respon_dari_sistem(String)"
});
formatter.result({
  "duration": 112901,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Mengedit Data Member",
  "description": "",
  "id": "mengelola-member;mengedit-data-member",
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
  "location": "EditAnggotaContext.Data_member_yang_sudah_tersedia_di_database()"
});
formatter.result({
  "duration": 51319,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "salafi",
      "offset": 23
    }
  ],
  "location": "EditAnggotaContext.Memasukan_nama_member(String)"
});
formatter.result({
  "duration": 86775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Data member tidak ditemukan",
      "offset": 26
    }
  ],
  "location": "EditAnggotaContext.respon_gagal_dari_sistem(String)"
});
formatter.result({
  "duration": 183348,
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
  "duration": 124564,
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
  "duration": 132495,
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
  "duration": 177749,
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
  "duration": 63448,
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
  "duration": 111501,
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
  "duration": 111968,
  "status": "passed"
});
});