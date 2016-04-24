package com.widner.scalaApp

import scala.collection.mutable.ArrayBuffer

/**
  * Created by wjmil_000 on 4/22/2016.
  */
object HelloWorld {

  val speakToTheWorld: String = "Hello, World!"

  val vowels: Array[Char] = Array('a', 'e', 'i', 'o', 'u')

  def collectVowels(sentence: String, v: Array[Char]): Int = {
    var count = 0

    for( letter <- sentence) {
      if (v contains letter ) {
        count += 1
      }
    }

    count
  }

  def main(args: Array[String]) {
    println(speakToTheWorld)

    printf("%s has %d vowels in it.", speakToTheWorld, collectVowels(speakToTheWorld, vowels))
  }

}
