case class Test(string: String, isEven: Boolean)

class SurpriseTest {

  //Method to find the even list from case class
  def findEven(list: List[Test]): List[Test] = {
    val evenList: List[Test] = list.filter(num => num.isEven == true)
    evenList
  }

  //Method to find the odd list from case Class
  def findOdd(list: List[Test]): List[Test] = {
    val oddList: List[Test] = list.filterNot(num => num.isEven == true)
    oddList
  }

  //Method to find the even and odd list by partition method
  def findEvenOddByPartition(list: List[Test]): (List[Test], List[Test]) = {
    val (evenListByPartition, oddListByPartition) = list.partition(num => (num.isEven == true))
    (evenListByPartition, oddListByPartition)
  }

  //method to find the first field of even list  in case class
  def findFirstFieldOfTestClass(list: List[Test]): List[String] = {
    val evenList: List[Test] = list.filter(num => num.isEven == true)
    val firstFieldList = evenList.map { num => num.string }
    firstFieldList
  }
}

object Main extends App {
  private val listOfCaseClass = List(Test("1", false), Test("2", true), Test("3", false), Test("4", true), Test("5", false))

  private val surpriseTestObj = new SurpriseTest

  private val evenListResult: List[Test] = surpriseTestObj.findEven(listOfCaseClass)
  println(evenListResult)

  private val oddListResult: List[Test] = surpriseTestObj.findOdd(listOfCaseClass)
  println(oddListResult)

  private val (evenListByPartition, oddListByPartition): (List[Test], List[Test]) = surpriseTestObj.findEvenOddByPartition(listOfCaseClass)
  println(evenListByPartition)
  println(oddListByPartition)

  private val firstFieldListResult: List[String] = surpriseTestObj.findFirstFieldOfTestClass(listOfCaseClass)
  println(firstFieldListResult)


}