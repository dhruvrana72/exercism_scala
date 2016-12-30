/**
  * Created by sodel on 21/12/16.
  */

class PhoneNumber(string : String){
  val number = string.filter(_.isDigit) match {
    case b if b.length == 10 => Some(b)
    case b if b.length == 11 && b.head == '1' => Some(b.tail)
    case _ => None
  }
  val areaCode: Option[String] = number.map(_.take(3))

  val prettyPrint = number.map(s =>  s"(${s.take(3)}) ${s.drop(3).take(3)}-${s.takeRight(4)}")

}