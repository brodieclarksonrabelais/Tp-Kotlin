package classesTp9

interface IDocument {
    val titre: String
    val auteur: String
    val editeur: String
    val dateParution: String

    fun afficherDetails() = "titre: $titre, auteur: $auteur, editeur: $editeur, dateParution: $dateParution"
}

fun main(){
    val fondation = Livre("Fondation", "Isaac Asimov", "Opta", "1957", 255)
    fondation.afficherDetails()
    val coucherSoleil = Photo("Coucher de soleil","Robert Doisneau", "rien", "2022", 1920, 1080, true)
    coucherSoleil.afficherDetails()

    val unCatalogue = Bibliotheque()
    unCatalogue.ajouterDocument(coucherSoleil)
    unCatalogue.ajouterDocument(fondation)
    unCatalogue.afficherTout()

}