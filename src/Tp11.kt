import classesTp11.SondeSpatiale
import classesTp11.TypeEtoile

object CentreControleMaritime{
    var nbAlertes = 0
    fun  emettreAlerte(message: String){
        nbAlertes++
        println("[ALERTE N°${nbAlertes}] ${message.uppercase()}")
    }
    fun afficherBilan() = println("Bilan : Le centre a diffusé un total de $nbAlertes alerte(s)")
}

fun main(){
//    CentreControleMaritime.emettreAlerte("tempête DE FORCE 9 SUR LA ZONE IROISE")
//    CentreControleMaritime.emettreAlerte("brouillard DENSE DANS L'ESTUAIRE")
//    CentreControleMaritime.afficherBilan()

//    val maSonde = SondeSpatiale.depuisChaine("Voyager 1:Héliocentrique:600")
//    println("Sonde créée : $maSonde")

    val etoileObservee : TypeEtoile = TypeEtoile.G
    println("Classification : ${etoileObservee.nom}")
    println("Couleur dominante : ${etoileObservee.couleur}")
    print("Caractéristique thermique : ")
    // Grâce au mot-clé "sealed", le "when" est exhaustif et n'a pas besoin de "else"
    when (etoileObservee) {
        is TypeEtoile.O -> etoileObservee.decrireTemperature()
        is TypeEtoile.G -> etoileObservee.decrireTemperature()
        is TypeEtoile.M -> etoileObservee.decrireTemperature()
    }
}