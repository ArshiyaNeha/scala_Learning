object Implicit extends App
{
/*
Implicit classes make it possible to add new methods to previously defined classes.
The implicit class has a single constructor parameter (str) with the type that you would like to extend (String) and contains the method you would like to "add" to the type (withoutVowels).
 */
object StringUtil {
  implicit class StringEnhancer(str: String) {
    def withoutVowels: String = str.replaceAll("[aeiou]", "")
  }
}

  //Implicit parameters can be useful if a parameter of a type should be defined once in the scope and then applied to all functions that use a value of that type.
  //if once we call the implicit parameter then no need to call its function again.just writing the method it takes the impilict function.
  val value = 10
  implicit val multiplier = 3
  def multiply(implicit by: Int) = value * by

  // Implicit parameter will be passed here
  val result = multiply

  // It will print 30 as a result
  println(result)


}