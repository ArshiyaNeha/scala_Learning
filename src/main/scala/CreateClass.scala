object CreateClass extends App
{
  /*
  //define a simple class
  class Smartphone
  {
    var number: Int = 16
    var nameofcompany: String = "Apple"

    // Class method
    def Display()
    {
      println("Name of the company : " + nameofcompany);
      println("Total number of Smartphone generation: " + number);
    }
  }
  // create instances/object of a class
      var obj = new Smartphone();
      obj.Display();
   */

  //define a simple class
  class Donut(name: String, productCode: Long) {

    println(s"Donut name = $name, productCode = $productCode")

    //create instances or object of Donut class
    val vaniladonut = new Donut("vanila",1009)
    println(vaniladonut)
  }
}
