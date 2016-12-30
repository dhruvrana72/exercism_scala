import scala.collection.immutable.SortedMap

class School {
  var db = Map[Int, Seq[String]]().withDefaultValue(Nil)

  def add(name: String, grade: Int) = db = db + (grade -> (db(grade) :+ name))

  def sorted: Map[Int, Seq[String]] = SortedMap(db.toSeq:_*).mapValues(_.sorted)

  def grade(grade: Int): Seq[String] = db(grade)
}

val school = new School
school.db
school.add("Aimee", 2)
school.add("Abnimee", 3)
school.add("Aibbmee", 4)
school.add("Aimebne", 5)

SortedMap(school.db.toSeq:_*).mapValues(_.sorted)