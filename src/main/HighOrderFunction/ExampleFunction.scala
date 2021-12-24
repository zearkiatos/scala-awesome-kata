package main.HighOrderFunction
def print(
  value: String,
  printer: String => Unit
) : Unit = printer(value)

def printlnPrinter(value:String): Unit = println(value)

val printlnPrinterVal = (value: String) => println(value)



print("Hello world!", printlnPrinter)

print("Hello world!", printlnPrinterVal)

print("Hello world!", (value: String) => println(value))

def sum(a: Int)(b: Int): Int = a + b

def addOne(b: Int) = sum(1)(b)

def addTwo(b: Int) = sum(2)(b)

def addThree(b: Int) = sum(3)(b)

val addFour = sum(4)(_)

println(addTwo(5))
println(addFour(6))

def printCurry(printer: String => Unit)(value: String): Unit = printer(value)

def printStd(value: String): Unit = printCurry(printlnPrinter)(value)

printStd("You're welcome")
