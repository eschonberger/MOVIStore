package com.example.movistore

open class Celular {

    var marca: String = ""
    var modelo: String = ""
    var cantidadChips: Int = 0
    var bateria: Bateria
    lateinit var chips:Chip


    //Con sobrecarga para los chips
constructor(marca: String, modelo: String, cantidadChips: Int, bateria: Bateria, chip:Chip) {
        this.marca = marca
        this.modelo = modelo
        this.cantidadChips = cantidadChips
        this.bateria = bateria
        this.chips = chip
    }

constructor(marca: String, modelo: String, cantidadChips: Int, bateria: Bateria) {
        this.marca = marca
        this.modelo = modelo
        this.cantidadChips = cantidadChips
        this.bateria = bateria
}


    open fun encender() {
        println("Encendiendo el Celular ${this.marca} modelo ${this.modelo}")
    }

    open fun juegosDisponibles() {
        println("los juegos son Tetris y Maniac Mansion ")
    }

    open fun sacarFoto() {
        println("sacando una foto desde el celular generico")

        //Consume bateria al tomar la foto
        this.bateria.cargaActual = this.bateria.cargaActual - 2

    }

    open fun cambiarBateria(){
        if (this.bateria.anioFabricacion < 2018) {
            println("Se recomienda cambiar la bateria del Telefono")
        }

    }

    override fun toString():String {
        //Invoca el chequeo de la bateria
        cambiarBateria()

        //this.chips.mostrar()

        return "El celular es de tipo Generico posee ${this.cantidadChips} chip tiene ${this.bateria.cargaActual}% de bateria. El numero de Telefono es: ${this.chips.numeroTelefono}"

    }


}