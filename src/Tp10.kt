import classesTp10.Conteneur
import classesTp10.Planete
import java.time.LocalDateTime

/////////////////Interfaces/////////////////////////////////////////////////////////////////////////////////////////////////

interface ICorpsCeleste {
    val nom: String
    val magnitude: Double
}

//////////////////Fonctions d'extensions//////////////////////////////////////////////////////////////////////////////////////

fun String?.formaterImmatriculation() = if (this.isNullOrBlank()) "INCONNU" else this.trim().uppercase()
// même chose que this?.trim()?.uppercase() ?: "INCONNU"

fun ICorpsCeleste.estBrillant() = if (this.magnitude < 1.5) true else false

fun Planete.toPlaneteJson() = "{'nom' : '${this.nom}', " +
        "'magnitude' : '${this.magnitude}', " +
        "'distance' : '${this.distanceSoleil}', " +
        "'date' : '${this.dateDecouverte}'}"

///////////////////Propriété d'extensions///////////////////////////////////////////////////////////////////////////////////////

val Conteneur.volume: Double
    get() = this.longueurMetres * this.largeurMetres * this.hauteurMetres
// le this peut ête implicite

val Planete.estProche: Boolean
    get() = if (this.distanceSoleil < 150.0) true else false

////////////////////Main//////////////////////////////////////////////////////////////////////////////////////

fun main(){
//    val immatriculation : String = ""
//    println(immatriculation.formaterImmatriculation())
//    val unConteneur = Conteneur(10.0, 2.0, 2.0)
//    println(unConteneur.volume)
    val terre = Planete(
        "Terre",
        -3.99,
        149.6,
        LocalDateTime.parse("2024-10-20T14:30:00")
    )
    println(terre.toPlaneteJson())
    println("Brillant ? ${terre.estBrillant()}")
    println("Proche du Soleil ? ${terre.estProche}")
}