package classesTp9

open class Bibliotheque {
    private val catalogue = ArrayList<IDocument>()

    fun ajouterDocument(doc: IDocument) {
        catalogue.add(doc)
    }

    fun afficherTout(){
        for (i in catalogue){
            println(i)
        }
    }
}