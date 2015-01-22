package compthursday

class Person (val firstName:String, val lastName:String) //synthesised constructor.
//getters and setters are for free (similar to Lombok
//fields and methods are indistinguishable. You can use a field and it may be a method...

//add a companion object for Person that takes a single String and splits it into 
//the separate firstName and lastName components.

object Person {
  //def apply(name:String) = ??? this line forces it to compile.
  
  def apply(name:String) = {
    val parts = (name.split(""))
    new Person(parts(0), parts(1))
  }
}
//you cannot force a member field through anything other than a constructor.