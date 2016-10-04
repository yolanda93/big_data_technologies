/**
  * Created by Yolanda on 26/09/2016.
  */
class student (name: String, var age: Double){

  var listGrades = List[Float]()
  def increaseAge : Unit = { age = age + 1 }
  def printStudent : String = {"Name: " + name }

  def addGrade (grade:Float) : Unit = listGrades = grade :: listGrades
  def meanGrade():Float =  listGrades.sum/listGrades.size


}
