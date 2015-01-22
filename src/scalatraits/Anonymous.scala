package scalatraits
//DONT HAVE INTERFACES IN SCALA, WE HAVE TRAITS.

import java.util.Date

case class Anonymous(id:String, createdAt:Date = new Date())
  //visitors to a website



case class User(id:String, email:String, createdAt:Date = new Date())