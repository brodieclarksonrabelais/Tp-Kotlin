package utils

data class Fraction(val numerateur: Int, val denominateur: Int = 1) {

    init {
        require(denominateur != 0) { "Le dénominateur ne peut pas être nul." }
    }

    operator fun plus(autre: Fraction): Fraction { // surcharge de l’opérateur +
        return Fraction(numerateur * autre.denominateur + autre.numerateur * denominateur,
            denominateur * autre.denominateur)
    }
    override fun toString(): String = "$numerateur/$denominateur"
}