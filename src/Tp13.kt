import kotlin.math.abs

fun calculer(x: Double, f: (Double) -> Double): Double {
    return f(x)
}

fun repeter(fois: Int, action: (Int) -> Unit) {
    for (i in 1..fois) {
        action(i)
    }
}

fun integrer(a: Double, b: Double, n: Int, f: (Double) -> Double) {
    var cumul: Double
    for (i in 1..n) {

    }
    //(b - a) / n × ()
    // x = a + (i - 0.5) × (b - a) / n
}

fun main(){
//    // 1. Une lambda qui prend un Int et retourne son double
//    val doubler: (Int) -> Int = { x -> x * 2 }
//    println(doubler(5))     // attendu : 10
//
//    // 2. Une lambda qui prend deux Int et retourne leur somme
//    val additionner: (x :Int, y :Int) { x :Int, y :Int -> Int x + y }
//    println(additionner(3, 4)) // attendu : 7
//
//    // 3. Une lambda sans paramètre qui retourne "Bonjour"
//    val saluer: () -> String = { "Bonjour!" }
//    println(saluer())      // attendu : Bonjour
//
//
//Première version
//    println(calculer(3.5){x : Double -> x * x})
//    println(calculer(2.0){x : Double -> x * x * x})
//    println(calculer(4.0){x : Double -> 1/x})
//    println(calculer(-7.2){x : Double -> -x})
//    println(calculer(-6.5){x : Double -> abs(x) })
//
//Version mieux optimisée
//    println(calculer(3.5){it * it})
//    println(calculer(2.0){it * it * it})
//    println(calculer(4.0){1/it})
//    println(calculer(-7.2){-it})
//    println(calculer(-6.5){ abs(it) })

//    repeter(3){println("Tour n°$it")}



}
