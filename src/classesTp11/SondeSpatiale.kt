package classesTp11

data class SondeSpatiale(val nom : String, val orbite : String, val autonomieMois :Int){
    companion object Companion{
        fun depuisChaine(chaine: String): SondeSpatiale {
            val parties = chaine.split(":")
            return SondeSpatiale(parties[0], parties[1], parties[2].toInt())
        }
    }
}