def compute(a: String, b: String) = {
  if (a.length == b.length)
    Some(a.zip(b).count { pair => pair._1 != pair._2 })
  else
    None

}

compute("GGACTGA", "GGACTGA")
compute("", "")
compute("ACCAGGG", "ACTATGG")
compute("AC", "ACTATGG")

val b = "AC".zip("GGA").count {pair => pair._1 != pair._2}