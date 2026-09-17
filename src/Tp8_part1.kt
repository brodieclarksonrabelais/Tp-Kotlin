import utils.Fraction

fun main(){
//    val terre: Planete = Planete("La Terre", 1.0, 6371.0, 1.0)
//    val mars: Planete = Planete("Mars", 0.11, 3389.5, 1.52)
//    val jupiter: Planete = Planete("Jupiter", 317.8, 69911.0, 5.2)
//
//    println("${terre.nom} -> Masse : ${terre.masse} M terrestre(s), Rayon : ${terre.rayon} km, Distance : ${terre.distancesSoleil} UA")
//    println("${mars.nom} -> Masse : ${mars.masse} M terrestre(s), Rayon : ${mars.rayon} km, Distance : ${mars.distancesSoleil} UA")
//    println("${jupiter.nom} -> Masse : ${jupiter.masse} M terrestre(s), Rayon : ${jupiter.rayon} km, Distance : ${jupiter.distancesSoleil} UA")
//
//     try {
//         val negative: Planete = Planete( "Negative", -1.0, -0.2, -0.3)
//         println("${negative.nom} -> Masse : ${negative.masse} M terrestre(s), Rayon : ${negative.rayon} km, Distance : ${negative.distancesSoleil} UA")
//     }catch (e: IllegalArgumentException){
//         println("Erreur interceptée : ${e.message}")
//     }
//
//    val mozart: Compositeur = Compositeur("Mozart ", 1756)
//    mozart.anneeDeces = 1791
//    println(mozart.anneeDeces)
//    println("${mozart.nom}est décédé à l'âge de ${mozart.ageAuDeces} ans")
//    val andromede = ObjetsMessier (31, "Andromède", "galaxie")
//    andromede.magnitudeApparente = 3.4
//    println("M${andromede.numero} (Galaxie ${andromede.nom} - Type : ${andromede.type}) " +
//            "Magnitude : ${andromede.magnitudeApparente} -> Visible à l'oeil nu ? ${andromede.estVisibleAOeilNu}")

    val a = Fraction(1, 2) // dénomitateur à 1 par défaut
    val b = Fraction(1,3)
    println("Addition : ${a+b}")
    println("Soustraction : ${a-b}")
    println("Multiplication : ${a*b}")
    println("Inversion de signe : ${-a}")
}


