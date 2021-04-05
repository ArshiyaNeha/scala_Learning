object VariablesAndTypes extends App
{
  //Immutable Variables:Reassignment to a Variable is prohibited when using "Val".
  val age: Int = 5
  //age=10  ---> it will give the error.


  //Mutable Variables:Reassignment to a variable is possible using "Var".
  var favoriteDonut : String = "Chocolate Donut"
  //Reassigning favoriteDonut Value.
  favoriteDonut = "Vanila Donut"

  //Lazy initialization:delay the initialization of some variable until at the point where it is consumed by your application
  lazy val donutShop = "A new Donut shop is opened"

  //Declare a variable with no initialization
  var leastFavoriteDonut: String = _
  leastFavoriteDonut = "Plain Donut"

  //Data Types in scala
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "Collections of Donuts"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()
}
