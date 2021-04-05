object String_and_basic_text extends App
{
 //Create a Scala program to reverse, and then format to upper case, the given String: "http://allaboutscala.com/scala-exercises
val checking = "/http://allaboutscala.com/scala-exercises"
 //println(checking.reverse.toUpperCase)

// Create a Scala program to output the following basic JSON notation.
 /*
 {
"donut_name":"Vanilla Donut",
"quantity_purchased":"10",
"price":2.5
}
  */


 /*
  Create a Scala program to prompt customers for their name and age.
  The format for the name and age labels should be in bold.
  And, the name literal should be underlined.
  */

 /*
 Create a Scala program to prompt customers for their name and age.
 The format for the name and age labels should be in bold. And, the name literal should be underlined.
Output:
Name: Nadim Bahadoor
Age: 38
  */

 val name = "Nadeem"
 val age = 22
 println("Name of the customer :"+ name)
 println("Age of the customer :"+ age)
 println(Console.BOLD)
 println("Name of the customer in BOLD:"+ name)
 println("Age of the customer in BOLD:"+ age)
 println(Console.UNDERLINED)
 println("Name is Underlined:"+ name)
 println("Age is Underlined:"+ age)

 /*
 Create a Scala program to find the 8th character in the String: "http://allaboutscala".
Output:
The 8th character literal in http://allaboutscala.com
  */
 println(Console.RESET)
 val finding = "http://allaboutscala"
 println( finding(7))

 val str = "http://allaboutscala"
 val checkword = str.charAt(7)
 println(checkword)

 val codes = Seq("A", "BB", "CCC", "DDDD", "EEEEE")
 val codesWithLength = codes.map { code =>
  s"$code - ${code.length}"
 }

 codesWithLength.foreach(println(_))


 val dict = Map(1 -> "Arsh",2 -> "Sam", 3 -> "Mazzu" )
 println(dict.mkString)

}
