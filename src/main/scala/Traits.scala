object Traits extends App
{
  /* Traits
 Traits can have methods(both abstract and non-abstract), and fields as its members.
 Traits does not contain constructor parameters.
 Traits support multiple inheritance
 */

  //creating a Trait
  trait donutshopping{
    def add(donutname :String): Long
    def delete(donutname:String): Boolean
  }

  // Create a DonutShoppingCart class which extends the trait  and implements its methods
  class donutshop extends donutshopping{
    override def add(donutName: String): Long = {
      println(s"DonutShoppingCart-> add method -> donutName: $donutName")
      1
    }

    override def delete(donutname: String): Boolean = {
      println(s"DonutShoppingCart-> delete method -> donutName: $donutname")
      true
    }
  }

  //Create an instance of donutshop and call the add, delete methods
  val donutshop1 : donutshop= new donutshop
  donutshop1.add("chocolate donut")
  donutshop1.delete("bluberry donut")

}
