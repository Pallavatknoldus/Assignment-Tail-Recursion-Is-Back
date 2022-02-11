package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class LengthCalculatorTest extends AnyFlatSpec {

  val length = new LengthCalculator

  "A condition" should "be correct if it gives 0 for an empty List/Seq/Set of Integer" in {
    val listOfInt: List[Int] = List()
    val setOfInt: Set[Int] = Set()
    val seqOfInt: Seq[Int] = Seq()
    assert(0 == length.lengthCalculator(listOfInt))
    assert(0 == length.lengthCalculator(setOfInt))
    assert(0 == length.lengthCalculator(seqOfInt))
  }

  "A condition" should "give correct length for an non empty List/Seq/Set of Integer with 5 elements" in {
    val listOfInt: List[Int] = List(1, 2, 3, 4, 5)
    val setOfInt: Set[Int] = Set(1, 2, 3, 4, 5)
    val seqOfInt: Seq[Int] = Seq(1, 2, 3, 4, 5)
    assert(5 == length.lengthCalculator(listOfInt))
    assert(5 == length.lengthCalculator(setOfInt))
    assert(5 == length.lengthCalculator(seqOfInt))
  }

  "A condition" should "give correct length for an non empty List/Seq/Set of String with 3 elements" in {
    val listOfString: List[String] = List("Hello", "I am", "Good")
    val setOfString: Set[String] = Set("Hello", "I am", "Good")
    val seqOfString: Seq[String] = Seq("Hello", "I am", "Good")
    assert(3 == length.lengthCalculator(listOfString))
    assert(3 == length.lengthCalculator(setOfString))
    assert(3 == length.lengthCalculator(seqOfString))
  }

  "A condition" should "give correct length for a map with 2 key value pairs" in {
    val map: Map[Int, String] = Map(1 -> "First_Element", 2 -> "Second_Element")
    assert(2 == length.lengthCalculator(map))
  }
  
  "A condition" should "give correct length for a String" in {
    val aString = "Hello, Scala is amazing"
    assert(23 == length.lengthCalculator(aString))
  }
}