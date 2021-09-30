package com.example.movistore

class Samsung():Celular(marca="",modelo="",cantidadChips = 0,Bateria("X",0,0,0)){

constructor(marca:String,modelo:String,cantidadChips:Int,bateria: Bateria):this() {
this.marca=marca
this.modelo=modelo
this.cantidadChips=cantidadChips
this.bateria=bateria

}

 override fun encender(){
        println("Encendiendo el Celular SHAM SUNG!!!")
    }

override fun juegosDisponibles(){
        println("Apa samsung, tengo el gear of wars")
    }

override fun sacarFoto(){
        println("sacando una foto desde un celular samsung")
    }
}