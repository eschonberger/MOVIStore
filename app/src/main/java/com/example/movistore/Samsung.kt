package com.example.movistore

class Samsung():Celular(marca="",modelo="",cantidadChips = 0,Bateria("X",0,0,0),Chip("Y",0,0,0)){

constructor(marca:String,modelo:String,cantidadChips:Int,bateria: Bateria,chip:Chip):this() {
this.marca=marca
this.modelo=modelo
this.cantidadChips=cantidadChips
this.bateria=bateria
this.chips=chip

}

 override fun encender(){
        println("Encendiendo el Celular SHAM SUNG!!!")
    }

override fun juegosDisponibles(){
        println("Juego exclusivo de samsung -Gear of Wars-")
    }

override fun sacarFoto(){
        println("sacando una foto desde un celular samsung")

    //Consume bateria al tomar la foto - El consumo es mas optimo que el del celular generico
    this.bateria.cargaActual=this.bateria.cargaActual-1
    }

override fun toString():String{
    //Invoca el chequeo de la bateria
    cambiarBateria()

    return "El celular es un ${this.marca} modelo ${this.modelo}, posee ${this.cantidadChips} chip y tiene ${this.bateria.cargaActual}% de bateria"
}

}