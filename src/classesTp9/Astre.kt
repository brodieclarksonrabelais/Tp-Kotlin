package classesTp9

sealed class Astre(val nom: String, val type: String) {
    class Etoile(
        nom : String,
        val couleur: String,
        val temperatureKelvin: Int
    ) : Astre(nom, "Etoile")

    class Planete(
        nom : String,
        val diametreKm : Double,
        val nombreSatellites : Int
    ) : Astre(nom, "Planète")

    class Comete(
        nom : String,
        val periodeAnnees : Double
    ) : Astre(nom, "Comète")

    class SatelliteNaturel(
        nom : String,
        val planeteHote: String
    ) : Astre(nom, "Satellite")

}

fun decrir(astre :Astre){
    println(when(astre){
        is Astre.Etoile -> "${astre.nom} -> Type : ${astre.type}, Couleur : ${astre.couleur}, Température : ${astre.temperatureKelvin} K"
        is Astre.Planete -> "${astre.nom} -> Type : ${astre.type}, Diamètre : ${astre.diametreKm} km, Satellites : ${astre.nombreSatellites}"
        is Astre.Comete -> "${astre.nom} -> Type : ${astre.type},  Période orbitale : ${astre.periodeAnnees} ans"
        is Astre.SatelliteNaturel -> "${astre.nom} -> Type : ${astre.type},  Orbite autour de : ${astre.planeteHote}"
    })
}