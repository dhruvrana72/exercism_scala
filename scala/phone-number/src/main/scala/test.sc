class PhoneNumber2(string : String){
  val number = string.filter(_.isDigit) match {
    case b if b.length == 10 => Some(b)
    case b if b.length == 11 && b.head == '1' => Some(b.tail)
    case _ => None
  }
  val areaCode: Option[String] = number.map(_.take(3))

  val prettyPrint = number.map(s =>  s"(${s.take(3)}) ${s.drop(3).take(3)}-${s.takeRight(4)}")

}
val number = new PhoneNumber2("1234995678")
number.prettyPrint

Some("12345678").map(_.drop(2)).map(_.take(3))

//number.number
