package compthursday


//standard companion object syntax
//replacement of the static method in java.
class Timestamp (val seconds:Long)  //constructor defined on line

  //can use the 'this' keyword to create other constructors
  
  //objects are things you have one of, you do not create an instance of it.
  //There are 2 separate name spaces in scala, one for Class (reference type) and 
  // one for companion Objects.
  
  object Timestamp {
    def apply(hours:Int, minutes: Int, seconds: Int) =
  new Timestamp(hours*60*60+minutes*60+seconds)
  }
  
  //companion objects have to be together (in the same file) so if you paste this 
  //into the interpreter you'll havet o paste the class line as well.
