package com.example.movistore

// Para generar numeros random
import kotlin.random.Random

class Chip {
var empresa:String=""
var numeroTelefono:Int=0

//Para desbloquear el CHIP
var pin:Int=0

//Para desbloquear el CHIP luego de introducir 3 veces mal el PIN
var puk:Int=0


//Chip Comun, se genera automaticamente el pin y el puk
    constructor(empresa:String, numeroTelefono:Int) {
        this.empresa = empresa
        this.numeroTelefono = numeroTelefono

        //Invoca la funcion de generarPIN y la almacena en la propiedad
        this.pin= generarPIN()

        //Invoca la funcion de generarPUK y la almacena en la propiedad
        this.puk= generarPUK()
    }

    //Con PIN Especifico (Clonado) - Fuerzas de Seguridad Leer Contactos/SMS
    constructor(empresa:String, numeroTelefono:Int, pin:Int) {
        this.empresa = empresa
        this.numeroTelefono = numeroTelefono
        this.pin = pin
        this.puk= generarPUK()
    }

    //Con PIN y PUK Especifico (Clonado) - Fuerzas de Seguridad Leer Whatsapp/Telegram
    constructor(empresa:String, numeroTelefono:Int, pin:Int,puk:Int) {
        this.empresa = empresa
        this.numeroTelefono = numeroTelefono
        this.pin = pin
        this.puk=puk
    }

//Genera un pin entre 1000 y 9999
fun generarPIN():Int {
    //Requiere importar la libreria kotlin.random.Random
    var randomValues = Random.nextInt(1000, 9999)
    return randomValues
}

//Genera un pin entre 1000 y 9999
fun generarPUK():Int {
    //Requiere importar la libreria kotlin.random.Random
    var randomValues = Random.nextInt(10000000, 99999999)
    return randomValues
}

fun mostrar():Unit{
    println("la compania es ${this.empresa} y el numero es ${this.numeroTelefono}")
}

fun recuperarPIN():String {
return "el PIN del telefono ${this.numeroTelefono} es ${this.pin}"
    }

fun recuperarPUK():String {
    return "el PUK del telefono ${this.numeroTelefono} es ${this.puk}"
    }
}