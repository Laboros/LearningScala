package com.apple

class TestStringUtil extends StringUtils{
  def main(args: Array[String]): Unit = {
    var input:String = "Hello!world";
    var seperator:String ="!";
    
    var tokens1 = tokens(input, seperator);
    tokens1.foreach(println);
    
    var isEmpty1 = isEmpty(input);
    
    println(isEmpty1);
    
  }
}