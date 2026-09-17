package utils

data class CaisseBoisson(val appellation : String, val volumeLitres: Double) {
    override fun toString(): String = "apellation=$appellation volumeLitres=$volumeLitres"
}