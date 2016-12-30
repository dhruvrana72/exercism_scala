class DNA(strand: String) {
  def count(nucleotide: Char): Either[String, Int] =
    nucleotideCounts.right.flatMap { counts =>
      counts.get(nucleotide).map(Right(_)).getOrElse(Left(s"invalid nucleotide '$nucleotide'"))
    }

  def nucleotideCounts: Either[String, Map[Char, Int]] =
    strand.find(!"ATCG".contains(_)).map(n => Left(s"invalid nucleotide '$n'")).getOrElse {
      Right("ATCG".map(n => (n, strand.count(_ == n))).toMap)
    }
}

"CCCCC".map(n => (n, n))
new DNA("CCCCC").nucleotideCounts



  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

  // a few different ways to use Either, Left, and Right
  println(divideXByY(1, 0))
  println(divideXByY(1, 1))
  divideXByY(1, 0) match {
    case Left(s) => println("Answer: " + s)
    case Right(i) => println("Answer: " + i)
  }
