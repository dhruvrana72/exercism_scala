/**
  * Created by sodel on 15/12/16.
  */
object Pangrams {
   def isPangram (text : String) = {
     ('a' to 'z').forall(text.toLowerCase.contains(_))
  }

}
