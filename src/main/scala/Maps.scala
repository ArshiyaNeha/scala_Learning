object Maps extends App
{
  //initialize a Map
  val createmap  = Map((1,"chocolate"),(2,"Biscuit"))
  println(createmap)

  //initialize Map using key -> value
  val mapp = Map(3 -> "Arshiya", 4 -> "Meer")
  println(mapp)
  println(mapp.values)
  println(mapp.keys)

  val mapped = Map(5 -> "choco")
  val twomaps = mapp ++ mapped
  println(twomaps)


  val map3: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map1 = $map3")

  //adding element using +
  val addmap = map3 + ("KD" ->"chocolate donut")
  println(addmap)

  //add two Maps together using ++
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  val map2: Map[String, String] = Map("VD"-> "Vanilla Donut", "GD" -> "Glazed Donut")
  val map4: Map[String, String] = map1 ++ map2
  println(s"Elements in map4 = $map4")

  //remove key and its value from map using -
  val map5: Map[String, String] = map4 - ("CD")
  println(s"Map without the key CD and its value = $map5")

  //initialize an empty Map
  val emptyMap: Map[String,String] = Map.empty[String,String]
  println(s"Empty Map = $emptyMap")




}
