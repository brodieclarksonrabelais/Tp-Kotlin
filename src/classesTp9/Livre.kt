package classesTp9

data class Livre(
    override val titre: String,
    override val auteur: String,
    override val editeur: String,
    override val dateParution: String,
    val nombrePages: Int
): IDocument {
    override fun afficherDetails(): String = "titre: $titre, auteur: $auteur, editeur: $editeur, " +
            "dateParution: $,nombre de pages: $nombrePages"
}