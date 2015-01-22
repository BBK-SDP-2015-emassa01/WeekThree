package caseclasses

object Stormtrooper {

  def inspect(person:Person):String = 
  //3 ??? is useful because you can set up/compile the signatures. V useful.
  //Lets try and compare if the Person is Luke Skywalker, or someone else and 
  //return an appropriate String.
    
    person match{
    case Person ( "Luke", "Skywalker") =>"Stop, rebel, scum!"
      case Person ( "Dave", "Grohl") =>"Good Guy!"
        case Person ( first, name) =>
          s"Move alng $first" //default!
  }

    
    
    //   if (person.firstName == new Person( "Luke", "Skywalker"))
    //     //do something
    //   else 
    //     //do something else
    //BUT LETS NOT DO THIS...
}
    object Testie {
      def main(args:Array[String]):Unit = {
        println(Stormtrooper.inspect(Person("Dave", "Grohl")))
        println(Stormtrooper.inspect(Person("James", "Wilding")))
      }
    }
    
  
