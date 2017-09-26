package com.apple.functions

object TestFunction {
  
  def main(args: Array[String]): Unit = {
    var sum  = add(10,20);
    println(sum);
  }
  
  def add(x:Int, y:Int):Int = {
    var sum =0;
    sum = x+y;
    return sum;
  }
  
}