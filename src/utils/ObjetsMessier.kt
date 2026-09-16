package utils

class ObjetsMessier(val numero: Int, val nom: String, typeInitial: String) {
    init {
        require(numero in 1..110) { "Le solde initial doit être entre 1 et 110 !" }
    }

    var type: String = typeInitial
        get() = field.uppercase()

    var magnitudeApparente: Double = 0.0
        set(value) {
            field = if (value <= 30.0) value else 30.0
        }

    val estVisibleAOeilNu: Boolean
        get() = if(magnitudeApparente < 6.0) true else false
}