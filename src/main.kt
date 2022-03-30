fun main(){

    var Toyota = Car("Toyota","cruisher","red",4)
    Toyota .carry(7)
    Toyota .idenntity()
    Toyota .calculateParkingFees(4)
    var new = Bus("Mini","suburban","white",4)
    new.maxTripFare(100.0)
    new.calculateParkingFees(10)



}

open class Car (var make:String, var model:String , var colour:String , var capacity:Int) {

    fun carry (people:Int) {

        var x = people - capacity

        if (x>=5 )
            println("Carrying $people passengers.")
        else {
            println("Over capacity by $x people.")
        }

    }

    fun idenntity(){
        println("I am a $colour $make $model.")
    }

    open fun calculateParkingFees (hours:Int):Int {
        var park = hours*20
        println("The parking fees is $park")
        return park

    }


}

class Bus(var make:String, var model:String , var colour:String , var capacity:Int) {
    fun maxTripFare(fare: Double): Double {
        var x = capacity * fare
        println("The maximum amount of  trip  fare is $x USD.")
        return x

    }

    fun calculateParkingFees(hours: Int): Int {
        var w = capacity * hours
        println(w)
        return w

    }
}



























