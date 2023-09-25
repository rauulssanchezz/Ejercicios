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
fun conversionFahrenheit(grados:Int){

}
fun conversionCelsius(grados:Int){

}