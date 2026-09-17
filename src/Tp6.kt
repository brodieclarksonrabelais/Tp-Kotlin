//import Electricite.*
//
//fun main() {
//    println("Valeur de la résistance (en Ohm) (>=0) ?")
//    val resistance = readlnOrNull()?.toDoubleOrNull()
//    println("Valeur de l'intensité (en Ampère) (>=0) ?")
//    val intensite = readlnOrNull()?.toDoubleOrNull()
//    if (intensite != null && resistance != null && intensite > 0 && resistance > 0) {
//        val tension = calculerTension(resistance, intensite)
//        println("Tension du Circuit (U) : $tension Volt")
//        println("Puissance (P) : ${calculerPuissance(tension, intensite)} Watt")
//    }
//    else println("Erreur(s) de saisie : résistance ou intensité < 0.")
//}