package classesTp9

data class Photo(
    override val titre: String,
    override val auteur: String,
    override val editeur: String,
    override val dateParution: String,
    val resolutionHorizontale: Int,
    val resolutionVerticale: Int,
    val estCouleur: Boolean
): IDocument {
    override fun afficherDetails(): String = "titre: $titre, auteur: $auteur, editeur: $editeur, " +
            "dateParution: $, resolution horizontale: $resolutionHorizontale, " +
            "resolution verticale: $resolutionVerticale, couleur: $estCouleur"
}
