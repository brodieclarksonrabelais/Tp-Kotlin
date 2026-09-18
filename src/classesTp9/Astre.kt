package classesTp9

sealed class Astre(val nom: String, val type: String) {
    class Etoile(val couleur: String, val temperatureKelvin: Int){}

    class Planete(val diametreKm : Double, val nombreSatellites : Int){}

    class Comete(val periodeAnnees : Double){}

    class SatelliteNaturel(val planeteHote: String){}
}