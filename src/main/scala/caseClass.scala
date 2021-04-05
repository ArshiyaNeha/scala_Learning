object caseClass extends App
{
//case class creates an companion object.It will automatically create apply(),toString().

  //defining a case class donut.
  case class donut(name : String,productCode: Int)

  // create instances or objects for the Donut case class
  val vaniladonut : donut = donut("vanila",12)
  val glazedonut : donut = donut("glaze",50)

  println(s"vaniladonut = $vaniladonut")
  println(s"glazedonut = $glazedonut")

  //access fields of the Donut object
  println(s"vanila donut name = ${vaniladonut.name}")
  println(s"vanila donut name = ${vaniladonut.productCode}")

  // create a new object of Donut by using the copy() method of the case class
  val choclatedonut : donut = vaniladonut.copy("chocolate donut",35)
  println(s"chocolatedonut = $choclatedonut")

  /*
  A case class is similar to any other classes except that it also creates the Companion Object.
  case class will automatically create the apply(),  toString(), hashCode and equals() methods for you.
  You did not have to use the new keyword when creating instances of the Donut case class.
  fields defined on case class are immutable by default and as such you cannot modify them.
   */

}
