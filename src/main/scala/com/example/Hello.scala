package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val instance = MyClass("foo", 1) // this class comes from the project i'm depending on
  }
}
