def sumOfMultiples(factors: Set[Int], limit: Int) = {
  val a = (for (s <- factors ) yield (1 until limit).filter(n => n % s == 0).toSet).flatten.sum
  a
}

sumOfMultiples(Set(7, 13, 17), 20)