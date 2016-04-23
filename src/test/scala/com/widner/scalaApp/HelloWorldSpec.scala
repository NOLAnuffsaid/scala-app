package com.widner.scalaApp

import org.specs2._

class HelloWorldSpec extends Specification { def is = s2"""

  This is a specification to check the 'Hello World' string

  The 'Hello World' string should
    start with 'Hello'                   $e1
    end with 'World!'                    $e2
    contain 13 characters                $e3
    contain ',' character                $e4
                                         """

  def e1 = HelloWorld.speakToTheWorld must startWith("Hello")
  def e2 = HelloWorld.speakToTheWorld must endWith("World!")
  def e3 = HelloWorld.speakToTheWorld must have size 13
  def e4 = HelloWorld.speakToTheWorld must contain(',')
}