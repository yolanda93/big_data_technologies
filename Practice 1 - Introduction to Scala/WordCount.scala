/**
  * Created by Yolanda on  26/09/2016.
  */
class wordCount {
    var word : String
    var counts : Map[String,Double]
    def countWords (phrase: String) : Unit = counts =  phrase.split(" ").groupBy(w => w).mapValues(_.size)

}
