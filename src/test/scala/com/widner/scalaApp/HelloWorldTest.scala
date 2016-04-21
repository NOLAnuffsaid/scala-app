package com.widner.scalaApp

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class HelloWorldTest extends FunSuite with BeforeAndAfter {

  def addThese(a: Int, b: Int): Int = a + b

  test( "2 + 2 hasnt changed" ) {
    assert(addThese(2,2).equals {
      4
    })
  }

}
