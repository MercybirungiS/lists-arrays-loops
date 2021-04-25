import java.lang.reflect.Array
import java.util.*

fun main() {
    val numbers = listOf<Int>(8,2,23,4,12)
    for (number in numbers){
        println(number)
    }
    for (index in numbers.indices) {
        println("At position $index is ${numbers[index] }")
    }

when {
    6 in numbers->println("Six is in the list")
    6 !in numbers-> println("Six is not in the list")
}
    val flowers = listOf<String>("Roses","Mallow","Hydrangeas","Daisies","Marigold")
    flowers
        .filter { it.startsWith("M") }
        .sortedBy { it }
        .map{it.toLowerCase()}
        .forEach{println("$it")}

    var numOfFish = 78
    when (numOfFish) {
        0  -> println("Empty tank")
        in 50..70 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    //var books: Int = null
    //returns  error: null can not be a value of a non-null type Int
 val countries = listOf<String>("Uganda","Kenya","Tanzania")
    println(countries) // can not be changed
    val myList= mutableListOf<String>("dog","cat","elephant")// can be changed
    myList.remove("dog")
    println(myList)
    val numbers4 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers4
    println(Arrays.toString(foo2))
    println(foo2[5])
    val a = listOf<Char>('A','B','C','D')
    println("Size of the list is: " + a.size)
    println("Total elements in the list by count is ="+a.count() )
    println(a.indexOf('C'))
    println(a[3])
    println("The element at  index 3 is : " +a .get(3))
    println("The element at index 0 is :" + a[0])
    val list_nums= listOf<Int>(100,200,300,400)
    println("The minmum value int of the list is :" +list_nums.min())
    println("The maxmum value int of the list is :" +list_nums.max())
    println("Average is :"+list_nums.average())
    val b = listOf(100,200,500,100,300,200,600,900,600)
    println("The unique elements in the list are :"+b.distinct())
    val list_num = listOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    println("List after dropping first three elements: " +list_num.drop(3))
    println("List after dropping last four elements: " +list_num.dropLast(4))
    val list_names = listOf<String>("Mercy", "Yvonne", "Wato", "Edna", "Geraldine")
    println("First elements in the list: " +list_names.first())
    println("Last element: " +list_names.last())
    val progLangs= mutableListOf("Kotlin", "JavaScript", "Python", "Swift")
    println("List Before Clear")
    for (i in progLangs) {
        println(i)
    }
    progLangs.clear()
    println("List After Clear")
    for (i in progLangs) {
        println(i)

    }
    var progLang= mutableListOf<String>("Python","Swift","JavaScript","Kotlin")
    progLang.remove("Swift")
    for(i in progLang){
        println(i)
    }
    //print(progLang.removeAt(0))
   // progLang.add(2,"C++")
    //for (i in 2 until  progLang.size){
       // println(i)

    }





