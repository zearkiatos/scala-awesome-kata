if ("Codely".isInstanceOf[String])
    println("Codely is the best")
else
    println("Codely")

val result = if ("Codely".isInstanceOf[String]) {
    println("Codely is the best")
    3
}
else {
    7
}

// If ternario

val result2 = if ("Codely".isInstanceOf[String]) 3 else 7

// for
var total = 0
for (value <- 1 to 10) {
    total = total + value
    println(value)
}

// foreach

(1 to 10).foreach(value => {
    println(value)
})

(1 to 10).foreach(println(_))

(10 to 20).foreach(println)

(30 to 40) foreach println

(1 to 10).sum

