object ForLoop extends App
{
  //A simple for loop using "to":to includes the last
  for(numberOfDonuts <- 1 to 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  //A simple for loop using "until":until makes it clear that your for loop will NOT include the last iteration.
  for(numberOfDonuts <- 1 until 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  // Filter values using if conditions in for loop
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  for(ingredient <- donutIngredients if ingredient == "sugar"){
    println(s"Found sweetening ingredient = $ingredient")
  }

  //Filter values using if conditions in for loop and return the result back using the yield keyword
  val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
  } yield ingredient
  println(s"Sweetening ingredients = $sweeteningIngredients")

  //Using for comprehension to loop through 2-Dimensional array
  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) = "flour"
  twoDimensionalArray(0)(1) = "sugar"
  twoDimensionalArray(1)(0) = "egg"
  twoDimensionalArray(1)(1) = "syrup"

  for { x <- 0 until 2
        y <- 0 until 2
        } println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

}
