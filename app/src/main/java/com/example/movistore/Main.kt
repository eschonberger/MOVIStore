package com.example.movistore



fun main(){

var chipmovistar = Chip ("movistar",151122)
//chipmovistar.mostrar()

var batgenerica = Bateria("Generica",2500,2015,95)
var generic = Celular("ACME","ABC123",1,batgenerica,chipmovistar)
println(generic)


//var a10 = Samsung("ACME","ABC123",1,batgenerica)
//println(a10)


println(chipmovistar.pin)
generic.obtenerPIN()


}