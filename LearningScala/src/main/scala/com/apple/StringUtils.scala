package com.apple

class StringUtils {
  
  private[this] var x:String ="Helloworld";
  def tokens(input:String, seperator:String):Array[String] = {
    input.split(seperator);
  }
  
  private[apple]  def isEmpty(input:String):Boolean = {
    input.isEmpty();
  }
  
  def compare(s:StringUtils):Unit = {
//    s.x=this.x;
  }
  {
    
  }
}