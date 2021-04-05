object Abstract extends App
{
  /*
  Abstract class
  Abstraction is the process to hide the internal details and showing only the functionality.
  contains parameters.
  The method which does not contain body is known as an abstract method or it does not contain any implementation
   */

  //define an abstract class
  abstract class Donut(name: String) {

    def printName: Unit

  }

  //extend abstract class and define a case class
  case class VanillaDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //extend abstract class and define another case class
  case class GlazedDonut(name: String) extends Donut(name) {

    override def printName: Unit = println(name)

  }

  //instantiate objects
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  //
}
