package com.mobile.crudfadilah

class Pinjaman {

    var id: Int? = null
    var name: String? = null
    var alamat: String? = null
    var pinjaman: String? = null

    constructor(id: Int, name: String, jenis: String, harga:String){
        this.id = id
        this.name = name
        this.alamat = jenis
        this.pinjaman = harga
    }
}