class Anagram(word: String) {
  private val sorted_word = word.toLowerCase.sorted
  private val origin_word = word.toLowerCase

   def matches(words: Seq[String]) = {
    words.map(w => w.toLowerCase)
      .filter(w => w.sorted == sorted_word && w != origin_word)
  }

}

val detector = new Anagram("master")
val word_seq = Seq("stream", "pigeon", "maters")
val anagrams = detector.matches(word_seq)
detector.sorted_word

println(word_seq.map(w => w.toLowerCase).filter(w => w.sorted == detector.sorted_word)