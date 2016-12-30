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
val robot = new Robot
val name = robot.name
robot.name