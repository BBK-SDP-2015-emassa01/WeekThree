package caseclasses


//CASEEEEEEEEE czech it! It will print a sensible result, not the memory location.

case class Person (val firstName:String, val lastName:String) {
  def name = firstName  + "" + lastName //this is a function, just want a method so that you can
  //can add stuff to a case class...its a function not a field.
}

object Test {
  def main(args:Array[String]) = {
    val p = new Person("Philip", "Schofield")
    val p1 = new Person("Philip", "Schofield")
    val p2 = p1.copy() //get it for free if it's a case class, otherwise have to implement it.
    println(p)
    println(p1)
    
    println(p.equals(p1)) //equivalent to ==
    println(p==p1) //equivalent to .equals.
    println(p eq p1) //this compares the memory locations in scala...even with a case class
    println (p1 == p2) //copys are true.
  }
}

//you can overridde all methods in scala, even the eq

