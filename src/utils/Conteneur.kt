package utils

class Conteneur<T>(val contenu: T, val poidsInitial : Double) {
    init {
        require(poidsInitial >= 0){"Le poids doit être plus grand que 0"}
    }
    var poids: Double = poidsInitial
        private set(value) {
            field = if(value < 0.0) 0.0 else value
        }
    fun ajouterPoids(poidsAjoute: Double){
        require(poidsAjoute >= 0){"Le poids à ajouté doit être superieur ou égal à 0"}
        poids += poidsAjoute
    }
    override fun toString(): String = " ${if (poidsInitial == poids) "Etat initial" 
    else "Après + ${poids - poidsInitial}t"} : Conteneur -> Contenu : $contenu | Poids total : $poids tonnes"
}