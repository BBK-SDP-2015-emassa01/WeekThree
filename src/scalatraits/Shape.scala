package scalatraits

trait Shape {
  //three abstract methods:
  //sides -->number of sides
  //perimeter
  //area
  
  def sides:Int
  def perimeter:Double
  def area:Double //no diff between methods and fields!!! Dont care!
}

//three case classes implement Shape --> circle, Rectangle, Square
//math.pi

case class Circle (radius:Double) extends Shape {
  val sides = 1
  val perimeter = 2*math.Pi *radius
  val area = math.Pi * radius * radius
}


//case class Rectangle(length:Double, height:Double) extends Shape {
//  val sides = 2
//  val perimeter = 2*(height + length)
//  val area = height * length
//}
//case class Square(size:Double) extends Shape {
//  val sides = 2
//  val perimeter = sides * size
//  val area = size * size
//}

//BUT WE CAN NOW ABSTRACT OVER THE UNDERLYING CLASSES WITH ANOTHER TRAIT.

trait Rectangular extends Shape {
  // traits reinforces the concept that it's a blank item, could have called it abstract classes.
  def width :Double
  def height:Double
  val sides = 4
  val perimeter = (2 * width) + (2 *height)
  val area = width * height
}

case class Square (size:Double) extends Rectangular {
  val width = size
  val height = size
}

case class Rectangle (width:Double, height:Double) extends Rectangular







