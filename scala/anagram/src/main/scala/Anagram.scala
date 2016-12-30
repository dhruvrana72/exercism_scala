/**
  * Created by sodel on 19/12/16.
  */
class Anagram(word: String) {
  private val sorted_word = word.toLowerCase.sorted
  private val origin_word = word.toLowerCase

  def matches(words: Seq[String]) = {
    words.filter(w => w.toLowerCase.sorted == sorted_word && w.toLowerCase != origin_word)
  }

}
