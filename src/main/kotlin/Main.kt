fun main() {
    var myself=Human("Mercy",22,67)
    myself.eat(4)
    myself.weight
    myself.speak("I am a kenyan from karin")
    myself.birthday()
    var data =User("Orishaba","Mercy","orishabamercybanga.gmail.com","+256787930683","hopper")
    data.email
    println(data.email)
    data.firstname
    println(data.firstname)
    data.phoneNumber
    println(data.phoneNumber)






}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
// eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
 //speak(speech: String) :Prints the string passed to it (2
//points)
 //birthday( ) :Increments the human’s age by 1 (2
//points)
//Create an instance of this human class and invoke all its functions
class Human(var name: String,var age: Int,var weight: Int) {

    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
        println(weight)

    }




//speak(speech: String) :Prints the string passed to it (2
//points)

    fun speak(speech: String) {
        println(speech)

    }
    //birthday( ) :Increments the human’s age by 1 (2
//points)
    fun birthday(){
        age += 1
        println(age)

    }




    }
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes.
class User (var firstname: String,var lastName: String,var email:String,var phoneNumber:String,var passward:String)

