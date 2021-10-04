package com.example.movistore

open class Celular {

    var marca: String = ""
    var modelo: String = ""
    var cantidadChips: Int = 0
    var bateria: Bateria
    lateinit var chips:Chip

//Se crea el objeto Celular sin CHIPs
constructor(marca: String, modelo: String, cantidadChips: Int, bateria: Bateria) {
        this.marca = marca
        this.modelo = modelo
        this.cantidadChips = cantidadChips
        this.bateria = bateria
}

//Constructor con sobrecarga para que el celular tenga chip
    constructor(marca: String, modelo: String, cantidadChips: Int, bateria: Bateria, chip:Chip) {
        this.marca = marca
        this.modelo = modelo
        this.cantidadChips = cantidadChips
        this.bateria = bateria
        this.chips = chip
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

        return "El celular es de tipo Generico posee ${this.cantidadChips} chip tiene ${this.bateria.cargaActual}% de bateria. El numero de Telefono es: ${this.chips.numeroTelefono}"

    }

    fun cargaBateria(){
        return this.bateria.estadoCarga()
    }

    //Invoca el metodo recuperarPIN de la clase chips
    fun obtenerPIN():Unit{
        println(this.chips.recuperarPIN())
    }

    //Invoca el metodo recuperarPuk de la clase chips
    fun obtenerPUK():Unit{
        println(this.chips.recuperarPUK())
    }
}