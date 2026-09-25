package classesTp10

import ICorpsCeleste
import estBrillant
import estProche
import java.time.LocalDateTime

class Planete(
    override val nom :String,
    override val magnitude: Double,
    val distanceSoleil : Double,
    val dateDecouverte : LocalDateTime
) : ICorpsCeleste {

}