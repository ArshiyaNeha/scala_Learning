import scala.collection.immutable.ListSet

object lists extends App
{
//initialize an immutable List
  val lst = List("Arsh","Nam","Sam")
  println(s"list of elements =$lst")

  //access elements of immutable List at specific index
  println(lst(0))
  println(s"element of 1st index = ${lst(1)}")

  val list3 = List(1,2,3,4)
  val list4 = List(8,9)
  val adding = List.concat(list3,list4)
  println(adding)
  println(s"prepending element =${0 +: list3}")
  println(s"prepending element =${list3 :+ 0}")
  val a = 7
  val b = 3
  //val l = (List(2,3,4):: 0)(error)
  //left side shld always have sigle element.(0 :: List(4,6))
  println(s"adding elemnts = ${a + b}")
  val res= list3 ++ List(8,10)
  val res1= list3.head +: list3.tail //:



  //append elements at the end of immutable List use ++
  val lst2 = lst ++ List("Ruby","ansari")
  println(lst2)
  println(s"append = $lst2")

  //prepending elemets
  val lst3 = lst ++ List("Tabu","Ashu")
  println(lst3)

  //add two immutable lists together using ::
  val addinglist = lst :: lst2
  println(s"new list = $addinglist")

  //empty list
  val lst4 = List.empty[String]
  println(lst4)

  //  LIST SET
  // initialize an immutable ListSet
  val listSet1 = ListSet("Plain Donut","Strawberry Donut","Chocolate Donut")
  println(s"Elements of listSet1 = $listSet1")

  // check elements of immutable ListSet
  println(s"Element Plain Donut = ${listSet1("Plain Donut")}")
  println(s"Element Strawberry Donut = ${listSet1("Strawberry Donut")}")

  //add elements of immutable ListSet using +
  val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
  println(s"Adding element Vanilla to ListSet using + = $listSet2")

  val set = Set(1,"a",1)
  //add two ListSet together using ++
  val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
  println(s"Add two lists together using ++ = $listSet3")

  // remove element from the ListSet using -
  val listSet4: ListSet[String] = listSet1 - ("Plain Donut")
  println(s"ListSet without the element Plain Donut = $listSet4")

  //concatenate two list
  val list1 = List(1,2,3,4)
  val list2 = List(8,9,10,11)
  val conct = List.concat(list1,list2)
  println(s"concatenating two list = $conct")

}
