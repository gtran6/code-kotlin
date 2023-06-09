package Collections

// Map is a set of key-value pairs, designed to make it easy to look up a value given a particular key.
// Keys are unique, and each key maps to exactly one value, but the values can have duplicates.
// Values in a map can be strings, numbers, or objects—even another collection like a list or a set.
// A map is useful when you have pairs of data, and you can identify each pair based on its key. The key "maps to" the corresponding value.
//fun main() {
//    val peopleAges = mutableMapOf<String, Int>("Fred" to 30, "Ann" to 23)
//    peopleAges.put("Barbara", 42)
//    peopleAges["Joe"] = 51
//    peopleAges["Joe"] = 54
//    //println(peopleAges)
//
//    // "forEach" is similar to the for loop, but a little more compact.
//    // Instead of you specifying a variable for the current item, the forEach uses the special identifier it.
//    peopleAges.forEach {
//        //println(it.key + " is " + it.value)
//        println("${it.key} is ${it.value}")
//    }
//
//    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))
// }
/* Overview:
 Write a program, in Kotlin, that will display an ASCII chart given the following data
 data = {(1,2), (2, 3), (3, 1), (4, 6), (5, 8)}.
 You should be able to print the surrounding components of the chart and then place an * where
 each data point is specified in the data set. You do not need to print the X and Y legends
 but that would be helpful. You are given the max x and max y but if you can calculate that
 it would be helpful.

  Online auction graph display
  x axis is time
  y axis is price
  Title item

  Given a two-dimension array graph the price over time

     +-----+-----+-----+-----+-----+-----+
     +-----------------------------*-----+
     +-----------------------------------+
     +-----------------------*-----------+
     +-----------------------------------+
     +-----------------------------------+
     +-----------*-----------------------+
     +-----*-----------------------------+
     +-----------------*-----------------+
     +-----+-----+-----+-----+-----+-----+


   max x = 5
   max y = 8
   data = {(1,2), (2, 3), (3, 1), (4, 6), (5, 8)}
 To execute Kotlin code, please define a top level function named main*/
fun main(){
    val data = arrayOf(
        Pair(1,2),
        Pair(2,3),
        Pair(3,1),
        Pair(4,6),
        Pair(5,8)
    )
    val maxX = 5
    val maxY = 8
    println("+-----+-----+-----+-----+-----+-----+")
    for (x in 1..maxX) {
        for (y in maxY downTo 1) {
            if (data.contains(Pair(x,y)))
                println("*")
            else
                println("-")
        }
    }
}