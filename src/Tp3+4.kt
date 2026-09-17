////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//}
//
//fun main() {
//val texte: String? = null
//println(texte?.length)
//}
//
//fun main() {
//val pseudo: String? = null
//val affichage = pseudo ?: "Utilisateur Anonyme"
//}
//
//
//fun main() {
//    val entier : String?
//    print("Âge ? ")
//    entier = readlnOrNull()
//    if (entier !=null)
//        println("Âge retenu : $entier")
//    else
//        println("Âge retenu : 18")
//}

//fun main(){
//    print("Nombre ?")
//    val nombre = readlnOrNull()?.toIntOrNull()
//    when {
//        nombre == null ->println("Ce n'est pas un nombre valide.")
//        nombre < 0 -> println(nombre * -1)
//        else -> println(nombre)
//    }
//}
//
//fun main(){
//    println("Veuillez saisir votre âge : ")
//    val age = readlnOrNull()?.toIntOrNull()
//    when {
//        age == null ->println("Erreur : vous n'avez pas saisi un nombre valide.")
//        age < 0 -> println("L'âge ne peut pas être négatif")
//        age in 0..12 -> println("Vous êtes un Enfant")
//        age in 13..17 -> println("Vous êtes un Adolescent")
//        age in 18..64 -> println("Vous êtes un adulte")
//        else -> println("Senior")
//   }
//}
//
//fun main() {
//    println("Montant avant remise ?")
//    val montant = readlnOrNull()?.toFloatOrNull()
//    if (montant != null) {
//        val remise: Int = when {
//            montant < 2000 -> 0
//            montant <= 5000 -> 1
//            else -> 2
//        }
//        println("La remise est de $remise%")
//        val montantNet = montant - (montant * (remise / 100.0))
//        println("Montant net après remise  = $montantNet")
//    }
//    else
//        println("Erreur motant invalide")
//}
//
//fun main(){
//    var somme: Int = 0
//    var compteur: Int = 0
//    do {
//        println("Note ?")
//        val note = readlnOrNull()?.toIntOrNull()
//        if (note != null && note == -1){
//            compteur ++
//            somme += note
//        }
//    }while (note != -1)
//    val moyenne = somme / compteur
//    println("Compteur: $compteur ; Somme : $somme ; Moyenne: $moyenne")
//}
//
//fun main(){
//    println("Mot à répéter ?")
//    val mot = readlnOrNull()
//    println("Combien de répétitions ?")
//    val n = readlnOrNull()?.toIntOrNull()
//    if (n != null){
//        repeat(n){
//            println(mot)
//        }
//    }
//    else(println(mot))
//}
