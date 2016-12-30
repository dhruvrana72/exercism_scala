/**
  * Created by sodel on 7/12/16.
  */
class Bob{
  def hey(statement: String) = answerStatement(statement.trim)

   def answerStatement(statement:String) = {
    if (isSilence(statement)) "Fine. Be that way!"
    else if(isShouting(statement)) "Whoa, chill out!"
    else if(isQuestion(statement)) "Sure."
    else "Whatever."
  }

  def isSilence(statement:String):Boolean={
    statement.isEmpty
  }
  def isShouting(statement:String):Boolean = {
    statement.exists(_.isLetter) && statement.toUpperCase == statement
  }
  def isQuestion(statement:String):Boolean = {
    statement.endsWith("?")
  }
}
