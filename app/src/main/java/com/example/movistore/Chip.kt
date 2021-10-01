package com.example.movistore

class Chip {
var empresa:String=""
var numeroTelefono:Int=0



    constructor(empresa:String, numeroTelefono:Int) {
        this.empresa = empresa
        this.numeroTelefono = numeroTelefono
    }

 fun mostrar():Unit{
    println("la compania es ${this.empresa} y el numero es ${this.numeroTelefono}")
}

}