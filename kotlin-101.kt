fun main() {
    
    //variable declaration
    val a: Int = 2
    var b = 3.2178789f
    val charA = 'A'
    val chara = 'a'
    val sentence = "Hello there!"
    val myArray = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    //Data types that exist in Kotlin
    //Number: Integer types(Byte, Short, Int, Long) and Floating types (Float, Double)
    //Booleans: true (1) or false (0)
    //Characters: [A-Za-z] 
    //Strings: "This a string!"
    //Arrays: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    
    println(myArray[7])
    
    println("This is the last element: ${myArray[0]}")
    
    if(b is Float) {
        println(true)
    } else {
        println(false)
    }
    
    println(a)
    println(b)
        
   
    println("Hello, GDSC!\nAnother line")
    println(sentence)
    
    //Operators
    //Addition, Subtraction, Multiplication, Division, Modulus operator
    
    val first = 20
    val second = 3
    
    println(first + second) // 22
    println(first - second) // 18
    println(first * second) // 40
    println(first / second) // 10
    println(first % second) // 0 20 / 3 = 6 rem 2
    
    //Logical operators
    //>, <, ==, <= , >=, !=, && (AND), || (OR)
    println(first > second) // true
    println(first < second) // false
    println(first == second) // false
    println(first >= second) // true
    println(first <= second) // false
    println(first != second) // true
    
    lateinit var name: String
    
    name = "Jane Doe"
    
    println("Hi, my name is $name!")
    
    sayHello("John Doe")
    
    val sum = add(first, second)
    println("The sum is: $sum")
    
    val one = 1
    
    val two = 2
    
    val modOne = one.toLong()
    
    //Null safety
    //Null Pointer Exception NPE
    
    var myAge: Int? = null
    
    
    if(myAge == null) {
        println("Age cannot be null!")
    }
    
    
    //Control Flow
    //if/else, for, when, while
    
    if(2 < 3 || 4 % 2 == 1) {
        println("It's false")
    } else {
        println("It is true")
    }
    
    for (i in myArray.indices) { // 0..9
        print(myArray[i])
        print(" ") //myArray[0] ... myArray[9]
    }
    
//     println()
    
//     myArray.forEachIndexed { index, i ->
//         print(i)
//         print(" Index: $index ")
//         print(" ")
//     }

// 	val number = 0
// 	when(number) {
//         1 -> println("The number is one!")
//         2 -> println("The number is two!")
//         else -> println("No idea!")
//     }
    
//     var five = 0
//     while (five > 0) {
//         println("Greater than zero")
        
//         five--
//     }
    
//     do {
//         println("Hi")
//     } while (five > 0) five --
//     
//     

	val jane = Person(id = 123456789, name = "Jane Doe") // named parameters
//     jane.name = "Jane Doe" //call set()

    println("The person is called: ${jane.name}") //call get
    
    val john = Person(name = "John Doe")
    println(john.name)
    
    val mary = Person()
}

fun add(a: Int, b: Int): Int {
    return a + b
}

// fun add(a: Any, b: Any) = a.toInt() + b.toInt()

fun sayHello(name: String) {
    println("Hello, $name!")
}

data class Person(
    val name: String = "",
    val id: Int = 0
)


