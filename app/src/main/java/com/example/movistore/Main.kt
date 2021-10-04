package com.example.movistore

/*
MOVIStore permite crear objetos de tipo celular generico y equipos samsung, asignarle una bateria y chip.

BATERIA
Se emite un alerta, indicando reemplazar la bateria del telefono cuando esta es anterior al año 2018
Se puede consultar el estado de la bateria %Carga

FOTOS
Al sacar una foto en un celular generico la bateria pierde 2% de carga
Al sacar una foto en un celular Samsung  la bateria pierde 1% de carga

JUEGOS
Los juegos disponibles son distintos dependiendo el Celular
Generico: {Tetris y Maniac Mansion}
Samsung: {Gears of Wars}

PIN - PUK
Se puede recuperar tanto el PIN como el PUK del chip
 */

fun main(){

//CELULAR con Bateria Generica y chip movistar

//Creamos Bateria (Año 2016 ) Tiene que mostrar que se debe cambiar
var bat1 = Bateria("Generica",2000,2015,90)

//Creamos chip movistar
var movi1 = Chip("Movistar",1511223344)

//Creamos celular y asignamos composicion Bateria (bat1) y chip (movi1)
var cel1 = Celular("ACME","ABC1",1,bat1,movi1)

cel1.encender()

//Override ToString
println(cel1)

cel1.juegosDisponibles()

cel1.cambiarBateria()

cel1.cargaBateria() //Muestra 90%

cel1.sacarFoto()    //Resta 2% de Bateria

cel1.cargaBateria() //Muestra 88%

//obtener datos directo desde las propiedades almacenadas
println("El PIN almacenado en el CHIP es: " +movi1.pin + " el PUK es: " +movi1.puk)

cel1.obtenerPIN() // Retorna el PIN generado Dinamicamente - desde el objeto cel1
cel1.obtenerPUK()

println("***VERIFICAR QUE INDIQUE CAMBIAR LA BATERIA***")


//*************************OBJETO TIPO SAMSUNG

//println("**********OBJETO SAMSUNG")


//CELULAR con Bateria Samsung y chip Personal

//Creamos Bateria (Año 2021 ) NO muestra que se debe cambiar
//var bat2 = Bateria("Samsung",3000,2021,99)

//Creamos chip Personal
//var personal1 = Chip("Personal",1577777777)

//Creamos celular y asignamos composicion Bateria (bat2) y chip (personal1)
//var cel2 = Samsung("Samsung","A10",1,bat2,personal1)

//cel2.encender()

//Override ToString
//println(cel2)

//cel2.juegosDisponibles()

//cel2.cambiarBateria()

//cel2.cargaBateria() //Muestra 99%

//cel2.sacarFoto()    //Resta 1% de Bateria

//cel2.cargaBateria() //Muestra 98%

//cel2.obtenerPIN() // Retorna el PIN generado Dinamicamente - desde el objeto cel2

//cel2.obtenerPUK() // Retorna el PUK generado Dinamicamente - desde el objeto cel2


//*************************CELULAR CLONADO FUERZAS DE SEGURIDAD

//println("****CELULAR CLONADO - INVESTIGACION AF-2021-7151359**** requiere lectura Whatsapp - JUZGADO PENAL")

//Creamos Bateria (Año 2021 ) NO muestra que se debe cambiar
//var bat3 = Bateria("Samsung",3000,2021,99)

//Creamos chip Personal se utiliza el constructor clase chip     constructor(empresa:String, numeroTelefono:Int, pin:Int,puk:Int) {}
//var personal2 = Chip(cel2.chips.empresa,cel2.chips.numeroTelefono,cel2.chips.pin,cel2.chips.puk)

//Creamos celular y asignamos composicion Bateria (bat3) y chip (personal1)
//var cel3 = Samsung("Samsung","A10",1,bat3,personal2)

//cel3.encender()
//cel3.obtenerPIN()
//cel3.obtenerPUK()



//println("****CELULAR CLONADO - INVESTIGACION AF-2021-7151359**** requiere lectura SMS  - JUZGADO ECONOMICO")

//Creamos Bateria (Año 2021 ) NO muestra que se debe cambiar
//var bat4 = Bateria("Samsung",3000,2021,99)

//Creamos chip Personal se utiliza el constructor clase chip  constructor(empresa:String, numeroTelefono:Int, pin:Int) {}
//var personal3 = Chip(cel2.chips.empresa,cel2.chips.numeroTelefono,cel2.chips.pin)

//Creamos celular y asignamos composicion Bateria (bat4) y chip (personal3)
//var cel4 = Samsung("Samsung","A10",1,bat4,personal3)

//cel4.encender()
//cel4.obtenerPIN()
//cel4.obtenerPUK()



}