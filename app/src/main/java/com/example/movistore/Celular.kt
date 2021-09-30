package com.example.movistore

open class Celular {

var marca:String = ""
var modelo:String = ""
var cantidadChips:Int=0
var bateria:Bateria



constructor(marca:String, modelo:String, cantidadChips:Int, bateria: Bateria){
    this.marca=marca
    this.modelo=modelo
    this.cantidadChips=cantidadChips
    this.bateria=bateria

}


open fun encender(){
    println("Encendiendo el Celular ${this.marca} modelo ${this.modelo}")
    }

open fun juegosDisponibles(){
    println("los juegos son BLAH BLAH BLAH")
}

open fun sacarFoto(){
    println("sacando una foto desde el celular generico")
}

}