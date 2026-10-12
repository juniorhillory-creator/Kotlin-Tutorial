private fun printGreeting()=println("Hello Kotlin")
fun main(){
    fun getGreeting(thingToGreet:String)="Hello $thingToGreet"
    println(getGreeting(thingToGreet:"Kotlin"))
}