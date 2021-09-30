package com.example.movistore

class Bateria {
var marca:String = ""
var capacidadMah:Int=0
var anioFabricacion:Int=0
var cargaActual:Int=0



    constructor(marca: String, capacidadMah: Int, anioFabricacion: Int, cargaActual: Int) {
        this.marca = marca
        this.capacidadMah = capacidadMah
        this.anioFabricacion = anioFabricacion
        this.cargaActual = cargaActual
    }


    fun estadoCarga(){
        println("El estado de la carga es del ${this.cargaActual} porciento")
    }
}