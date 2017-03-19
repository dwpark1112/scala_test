import java.util.{Date, Locale}
import java.text.DateFormat._

object HelloWorld {
  def main(args: Array[String]){
    println("Hello world!")

    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)

    println(df format now)
  }
}
