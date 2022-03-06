fun main(){
    collection()
    Home()
    colour()
    majina("Mercedes,","Rolls royce,","Truck")
}


fun collection(){
    var ulbum = arrayOf("Homecoming","Lemonade","Recovery","Unapologetic")
    println(ulbum.contentToString())
}
fun Home (){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.sortedArray().forEach { town ->
        println(town.capitalize())
    }
}
fun colour (){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var numbers1 = numbers[1]+numbers[4]
    println(numbers1)
    var index = numbers.indexOf(158)
    println(index)
    println(numbers.sortedArray().contentToString())
}
fun majina (a: String,B: String,C: String): String{
    var myN = "$a$B$C"
    println(myN)
    return myN
}
