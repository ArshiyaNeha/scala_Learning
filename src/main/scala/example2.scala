import scala.io.StdIn._

object example2 extends App {
  /*
  Create a Scala program to calculate the total cost for a customer who is buying 10 Glazed donuts.
  You can assume that the price of each Glazed donut item is at $2.50. Notice the format of the $25.00 total cost literal,
   which is essentially at 2 decimal places.
Output:
Total cost of 10 Glazed Donuts = $25.00
   */

  val glazed_donut = "Glazed Donut"
  val numberofdonut = 10
  val priceofdonut = 2.5
  val totalCost = numberofdonut * priceofdonut

  println(f"""Total cost of $numberofdonut $glazed_donut${if (numberofdonut > 1) "s" else ""} = $$$totalCost%1.2f""")

  /*
  Create a Scala program that will ask the following question to a customer: "What is your favorite movie of all times?"
   */
  val favoriteMovie = readLine("What is your favorite movie of all times?")
  println(s"$favoriteMovie is totally awesome!")

  val firstName = "Arshiya"
  val lastName = "Neha"
  val favoriteMovie1 = "Vivah"
  val output =
    s"""
       | First Name: $firstName
       | Last Name: $lastName
       | Favorite Movie: $favoriteMovie1
 """.stripMargin

  println(output)




}
