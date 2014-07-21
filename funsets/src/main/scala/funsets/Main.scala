package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  def s1 = singletonSet(1)
  def s2 = singletonSet(2)
  def s3 = singletonSet(3)
  def s4 = singletonSet(4)
  def bigSet = union(union(union(s1, s2), s3), s4)
  printSet(bigSet)

  def fBig = filter(bigSet, x => x <5 )
  printSet(fBig)

}
