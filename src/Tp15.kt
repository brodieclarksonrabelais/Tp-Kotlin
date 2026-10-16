fun main() {
//    val carreSeq = sequence {
//        var a = 1
//        yield(1)
//        while (true) {
//            a *= 2
//            yield(a)
//        }
//    }
//    val suiteCarre = carreSeq.take(10)
//        .joinToString(
//            separator = ", ",
//            prefix = "Les 10 premières puissances de 2 : ",
//            postfix = ".",
//        )
//    println(suiteCarre)
//
//        val syracuse = sequence {
//        var a = 103
//        yield(a)
//        while (true) {
//            if(a != 1) {
//                if (a % 2 == 0) a /= 2 else a = 3 * a + 1
//            } else break
//            yield(a)
//        }
//    }
//    val suiteCarre = syracuse
//        .joinToString(
//            separator = ", ",
//            prefix = "Calcul de la suite de Syracuse pour u0 = ${syracuse.first()} \n",
//            postfix = ".",
//        )
//    println(suiteCarre)

}

