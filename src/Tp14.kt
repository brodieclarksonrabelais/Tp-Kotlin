import sun.security.jca.ProviderList.newList
import classesTp14.Observation
import classesTp14.Livre
import java.lang.Math.pow
import kotlin.math.pow

fun transformer(liste: List<Int>, operation: (Int) -> Int):List<Int> {
    val newListe = mutableListOf<Int>()
    for (element in liste){
        newListe.add(operation(element))
    }
    return newListe
}

fun List<Int>.transformer2(operation: (Int) -> Int) = this.map {operation(it)}

fun main(){
//    val list = listOf(1,2,3,4)
//    println(list.transformer2{it * 2})
//
//    val fluxDonnees = listOf(
//        Observation("Etoile-A", 5500, "G", true),
//        Observation("Etoile-B", 3000, "M", false), // Donnée invalide
//        Observation("Etoile-C", 12000, "B", true),
//        Observation("Etoile-D", 4500, "K", true),
//        Observation("Etoile-E", 25000, "O", true)
//    )
//
//    println(fluxDonnees.filter { it.temperatureK > 5000 && it.estValide })
//
    val bibliotheque = listOf(
        Livre("Le Petit Prince", true),
        Livre("1984", false),
        Livre("La guerre des mouches", true),
        Livre("Fondation", false)
    )

    bibliotheque.sortedBy { it.titre }.filter { it.estEmprunte }.forEach {
        println("Le livre '${it.titre}' est emprunté.")
    }

    val indices = (0..4)
    val diviseParDeux = indices.map { x -> 1 / 2.0.pow(x.toDouble()) }
    println(diviseParDeux)
}