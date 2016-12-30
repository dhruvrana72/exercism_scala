/**
  * Created by sodel on 15/12/16.
  */
class Phrase (sentence: String){
  lazy val wordCount: Map[String, Int] = {
     sentence.split("[^\\w']+").map(_.toLowerCase).groupBy(identity).mapValues(_.length)
  }
}
