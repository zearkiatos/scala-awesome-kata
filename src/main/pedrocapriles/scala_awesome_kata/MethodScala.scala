package pedrocapriles.scala_awesome_kata

final class MethodScala {
  lazy val delay = () => {
      Thread.sleep(5000)
      val message = "Hi!"
  }
}