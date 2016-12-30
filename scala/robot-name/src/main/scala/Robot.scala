/**
  * Created by sodel on 30/12/16.
  */

import scala.util.Random

class Robot{
  private val a = 'A' to 'Z'
  private val num = 0 to 9
  def newRandomName: String = {
    Random.shuffle(a.toList).take(2).mkString("")+Random.shuffle(num.toList).take(3).mkString("")
  }
  private var internalName: String = newRandomName
  def name: String = internalName
  def reset(): Unit = internalName = newRandomName

}