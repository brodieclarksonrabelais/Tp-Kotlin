package classesTp14

data class Observation(
    val objet: String,
    val temperatureK: Int,
    val typeSpectral: String,
    val estValide: Boolean
){
    override fun toString(): String {
        return "$objet ($typeSpectral)"
    }
}