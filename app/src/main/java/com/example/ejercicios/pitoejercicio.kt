package com.example.ejercicios
val PI = 3.14159
fun main(){
    //Ejercicio1
    var edad=20
    var nombre="Raúl"
    var altura =1.73

    //Ejercicio2
    var radio =2
    var area=PI*(radio*radio)
    println(area)

    //Ejercicio3
    saludar(nombre,edad)

    //Ejercicio4
    informacionPersonal(nombre,edad,"Granada")

    //Ejercicio5
    println(conversionFahrenheit(27))
    println(conversionCelsius(370))
}
//Ejercicio3
fun saludar(nombre:String,edad:Int){
    println("Hola "+nombre+" de "+edad+" años")
}

//Ejercicio4
fun informacionPersonal(nombre:String,edad:Int,ciudad:String){
    println("nombre: "+nombre+ " edad: "+edad+" ciudad: "+ciudad)
}
//Ejercicio5
fun conversionFahrenheit(grados:Int): Int {
    var res=0
    res=grados*(9/5)+32
    return res
}
fun conversionCelsius(grados:Int): Int {
    var res=0
    res=(grados -32)*5/9
    return res
}