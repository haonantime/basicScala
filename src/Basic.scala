/**
  * Created by haonantime on 2016/10/17.
  */
class Basic {
}

object Basic{
  def hello(name : String):String = {
    "hello"  + name
  }

  def helloScala(){
    "hello ....."
  }

def main(args:Array[String]){
  println(hello("scala"))
  helloScala()
  }
}
