package pedrocapriles.scala_awesome_kata

final class MethodScala {
  val delay:String = {
      Thread.sleep(5000)
      val message = "Hi!"
      message
  }

  def greeting(name:String):String = {
      Thread.sleep(5000)
      val message = "Hi "+ name
      message
  }
}
