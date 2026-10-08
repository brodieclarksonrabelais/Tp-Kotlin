import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.sin
import kotlin.math.PI
import kotlin.math.pow


fun calculer(x: Double, f: (Double) -> Double): Double {
    return f(x)
}

fun repeter(fois: Int, action: (Int) -> Unit) {
    for (i in 1..fois) {
        action(i)
    }
}

fun integrer(a: Double, b: Double, n: Int, f: (Double) -> Double): Double {
    var x: Double = 0.0
    var somme: Double = 0.0
    for (i in 1..n) {
        x = a + (i - 0.5) * (b - a) / n
        somme += f(x)
    }
    return (b - a) / n * somme
}

fun calculerVAN(fluxFutur: Double, taux: Double, annees: Double, calcul: (Double) -> Double): Double {
    return calcul((fluxFutur) / (1 + taux).pow(annees))
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

//    println(integrer(0.0, 1.0, 1000) { it })
//    println(integrer(0.0, 1.0, 1000) { it * it })
//    println(integrer(0.0, Math.PI, 1000) { sin(it) })

    println()

}
