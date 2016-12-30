/**
  * Created by sodel on 15/12/16.
  */
object Hamming {
  def compute(a: String, b: String) = {
    if (a.length == b.length)
      Some(a.zip(b).count { pair => pair._1 != pair._2 })
    else
      None

  }
}
