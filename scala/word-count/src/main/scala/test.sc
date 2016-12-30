def countWords(text: String) = {
  text.split("\\W+").map(_.toLowerCase).groupBy(identity).mapValues(_.length)
}

countWords("car : carpet as java : javascript!!&@$%^&")

("car : carpet as java : javascript!!&@$%^&").split("\\W+").map(_.toLowerCase).groupBy(identity).mapValues(_.length)

class Phrase (sentence: String){
  def wordCount (): Map[String, Int] = {
    val a = sentence.split("[^\\w']+").map(_.toLowerCase).groupBy(identity).mapValues(_.length)
    a
  }
  //val wordCount: Map[String, Int] = countWords(sentence)
}

val phrase = new Phrase("one,two,three")
phrase.wordCount