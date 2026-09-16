import utils.ObjetsMessier

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val andromede = ObjetsMessier (31, "Andromède", "galaxie")
    andromede.magnitudeApparente = 3.4
    println("M${andromede.numero} (Galaxie ${andromede.nom} - Type : ${andromede.type}) " +
            "Magnitude : ${andromede.magnitudeApparente} -> Visible à l'oeil nu ? ${andromede.estVisibleAOeilNu}")
}