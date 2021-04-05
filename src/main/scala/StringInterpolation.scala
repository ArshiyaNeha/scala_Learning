object StringInterpolation extends App
{

  /*
   Using String interpolation to print a variable.
   We've prefixed the s at the beginning of our println statement.
   We also used the dollar sign $ to refer to our variable.
   */
  val favoriteDonut: String = "Chocolate Donut"
  println(s"My favorite donut = $favoriteDonut")

  //Using String interpolation on object properties:we have to wrap our expression inside curly braces
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  //Using String interpolation to evaluate expressions
  val CountOfDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${CountOfDonutsToBuy == 10}")


  //Using String interpolation for formatting text
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Yummy"
  println(f"$donutName%20s $donutTasteLevel")

  // Using f interpolation to format numbers
  val donutPrice: Double = 2.50
  println(s"Donut price = $donutPrice")
  println(f"Formatted donut price = $donutPrice%.2f")

  // Using Raw interpolation
  println(raw"Favorite donut\t$donutName")
}
