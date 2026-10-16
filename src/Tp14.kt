import classesTp14.Candidat
import sun.security.jca.ProviderList.newList
import classesTp14.Observation
import classesTp14.Livre
import classesTp14.Exoplanete
import classesTp14.CorpsCeleste
import jdk.internal.org.jline.reader.Candidate
import java.lang.Math.pow
import kotlin.math.pow

fun transformer(liste: List<Int>, operation: (Int) -> Int): MutableList<Int> {
    val newListe = mutableListOf<Int>()
    for (element in liste){
        newListe.add(operation(element))
    }
    return newListe
}

fun List<Int>.transformer2(operation: (Int) -> Int) = this.map {operation(it)}

fun List<Candidat>.getListCandidatsRepeches() = this
    .filter { it.noteGenerale in 8.0..10.0 && it.notePro > 10.0 }
    .joinToString("\n") { "${it.nom + it.prenom}, ${it.noteGenerale} - ${it.notePro}" }

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
//    val bibliotheque = listOf(
//        Livre("Le Petit Prince", true),
//        Livre("1984", false),
//        Livre("La guerre des mouches", true),
//        Livre("Fondation", false)
//    )
//
//    bibliotheque.sortedBy { it.titre }.filter { it.estEmprunte }.forEach {
//        println("Le livre '${it.titre}' est emprunté.")
//    }
//
//    val indices = (0..4)
//    indices
//        .map { 1.0 / 2.0.pow(it.toDouble()) }
//        .forEach{ println(it) }
//
//
//    val catalogue = listOf(
//        Exoplanete("Proxima Centauri b", 4, true),
//        Exoplanete("Kepler-452b", 1400, true),
//        Exoplanete("WASP-17b", 1300, false),
//        Exoplanete("TRAPPIST-1e", 39, true),
//        Exoplanete("HD 189733b", 64, false)
//    )
//
////option 1
//    val listeExoplanete = catalogue
//        .filter { it.estHabitable }
//        .sortedBy { it.distanceAl }
//        .map { it.nom + "(${it.distanceAl} AL)" }
//        .joinToString (
//            separator = "/",
//            prefix = "Catalogue des mondes habitables : ",
//            postfix = ".",
//        )
//
////option 2
//    val listeExoplanete = catalogue
//        .filter { it.estHabitable }
//        .sortedBy { it.distanceAl }.joinToString(
//            separator = "/",
//            prefix = "Catalogue des mondes habitables : ",
//            postfix = ".",
//        ) { it.nom + "(${it.distanceAl} AL)" }
//
//    println(listeExoplanete)
//
//
//    val catalogueSpatial = listOf(
//        CorpsCeleste("Mercure", 0.39),
//        CorpsCeleste("Venus", 0.72),
//        CorpsCeleste("Terre", 1.0),
//        CorpsCeleste("Mars", 1.52),
//        CorpsCeleste("Jupiter", 5.2),
//        CorpsCeleste("Saturne", 9.5),
//        CorpsCeleste("Uranus", 19.2),
//        CorpsCeleste("Neptune", 30.1),
//        CorpsCeleste("Pluton", 39.5),
//        CorpsCeleste("Eris", 67.7),
//        CorpsCeleste("Sedna", 480.0)
//    )
//
//    val UA_EN_MILLIONS_KM = 149.6
//
//    catalogueSpatial
//        .filter { it.distanceUA > 30 }
//        .map { "Objet lointain : ${it.nom} à ${(it.distanceUA * UA_EN_MILLIONS_KM).toInt()} millions de km." }
//        .forEach { println(it) }

    val lesCandidats = listOf(
        Candidat("Dupont", "Pierre", 11.0, 12.0), // OK, moyenne générale : 11, pro : 12
        Candidat("Durant", "Jean", 8.5, 11.0), // rattrapage OK
        Candidat("Jaouen", "Yann", 7.0, 8.0), // recalé
        Candidat("Le Flem", "Paul", 7.5, 15.0), // recalé
        Candidat("Ropartz", "Guy", 15.0, 17.0), // OK
        Candidat("Cras", "Jean", 9.0, 14.0), // rattrapage OK
        Candidat("Ravel", "Marcel", 9.5, 10.0), // recalé, moyenne<10
    )

    println("Liste des candidats repéchés :\n${lesCandidats.getListCandidatsRepeches()}")
}