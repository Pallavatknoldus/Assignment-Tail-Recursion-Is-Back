package com.knoldus

import scala.annotation.tailrec

class LengthCalculator {

  def lengthCalculator[A](iterable: Iterable[A]): Int = {
    @tailrec
    def lengthFinder(iterable: Iterable[A], accumulator: Int = 0): Int =
      if (iterable.isEmpty) accumulator
      else lengthFinder(iterable.tail, accumulator + 1)

    lengthFinder(iterable)
  }
}