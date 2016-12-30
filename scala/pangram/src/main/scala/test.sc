def isPangram (text : String) = {
  ('a' to 'z').forall(text.toLowerCase.contains(_))
}

val b = isPangram("the quic brown fox jumps over the lazy dog")
