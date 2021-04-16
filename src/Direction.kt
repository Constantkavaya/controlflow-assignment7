fun main(){
    numbers()
   println(name("Constance","Achol","Andisi","Aluel","Akal"))
robot(6)
    robot(15)
    robot(20)
    answers()
}



fun numbers(){
    for (numodd in 1..100){
        if (numodd%2 !=0) {
            println(numodd)
        }
    }

    }
fun name(names1:String,names2:String,names3:String,names4:String,names5:String) :Int{

    var names = arrayOf(names1, names2, names3, names4, names5)
    var basket=0;
    for (name in names) {
if(name.length>=5)
    basket++
    }
    return basket
}
fun robot(age:Int) {
    if (age<= 6) {
        println("serve milk")
    }
    else if (age<=15 && age>6){
        println("serve a bottle of fanta orange")
    }
    else {
      println("serve cocacola")
    }
}

fun answers(){
   for (numbers in 1..100) {
       if(numbers%3==0&&numbers%5==0){
           println("FizzBuzz")
       }
       else if (numbers % 3 == 0) {
           println("fizz")
       }
       else if(numbers%5==0){
           println("Buzz")
       }
       else{
           println(numbers)
       }
   }
   }