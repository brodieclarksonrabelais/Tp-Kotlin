package utils

class Compositeur(val nom: String, val anneeNaissance: Int) {
    var anneeDeces: Int = anneeNaissance
        set(value) {
            if (value >= anneeNaissance) field = value else field = anneeNaissance
        }
    val ageAuDeces: Int
        get() = anneeDeces - anneeNaissance
}