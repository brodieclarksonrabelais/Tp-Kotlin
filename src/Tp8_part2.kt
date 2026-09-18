import utils.CaisseBoisson
import utils.Conteneur
import utils.MaterielInformatique

fun main() {
    val server = MaterielInformatique(designation = "Rack Serveur Blade", assembleur = "SRV-2026-X")
    val caissePepsi = CaisseBoisson("Pepsi", 45.0)
    val unConteneur = Conteneur<MaterielInformatique>(server, 15.0)
    val unConteneur2 = Conteneur<CaisseBoisson>(caissePepsi, 9.0)

    unConteneur.ajouterPoids(6.8)
    unConteneur2.ajouterPoids(3.4)

    println(unConteneur)
    println(unConteneur2)
}