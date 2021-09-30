package com.example.movistore

fun main(){

//var bateriasony = Bateria("sony",2500,2015,65)
//bateriasony.estadoCarga()

var bateriaa10 = Bateria("Samsung",3000,2015,99)
var a10 = Samsung("Samsung","A10",1,bateriaa10)
a10.encender()
a10.juegosDisponibles()
a10.sacarFoto()
bateriaa10.estadoCarga()
println(a10)

println("-------------->")
//Crearlo de esta forma funcionaria pero no puedo consultar los metodos del objeto del tipo Bateria
//var a20 =Samsung("Samsung","A10",1,Bateria("Samsung",5000,2021,99))
//Bateria.????
//a20.encender()

//var bateriagenerica = Bateria("Generica",1500,2020,90)
//var generic = Celular("ACME","ABC123",1,bateriagenerica)
//generic.encender()
//generic.juegosDisponibles()
//bateriagenerica.estadoCarga()
//generic.sacarFoto()
//bateriagenerica.estadoCarga()
//println(generic)


}