package com.example.movistore

// Para generar numeros random
import kotlin.random.Random

class Chip {
var empresa:String=""
var numeroTelefono:Int=0
var pin:Int=0



    constructor(empresa:String, numeroTelefono:Int) {
        this.empresa = empresa
        this.numeroTelefono = numeroTelefono

        //Invoca la funcion de generarPIN y la almacena en la propiedad
        this.pin= generarPIN()
    }

//Genera un pin entre 1000 y 9999
fun generarPIN():Int {
    //Requiere importar la libreria kotlin.random.Random
    var randomValues = Random.nextInt(1000, 9999)
    return randomValues
}

fun mostrar():Unit{
    println("la compania es ${this.empresa} y el numero es ${this.numeroTelefono}")
}

fun recuperarPIN():String {
return "el PIN del telefono ${this.numeroTelefono} es ${this.pin}"
    }

}