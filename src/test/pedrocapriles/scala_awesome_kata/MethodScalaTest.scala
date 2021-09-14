package pedrocapriles.scala_awesome_kata

import org.scalatest._
import org.scalatest.Matchers._

final class MethodScalaTest extends WordSpec with GivenWhenThen {
  "MethodScalaTest" should {
    "return a greet" in {
      Given("a MethodScalaTest")

      val methodScala = new MethodScala

      When("Return a greeting with a delay")

      val expectedValue = "Hi!"
      lazy val greeting = methodScala.delay()
      println(expectedValue)
      Then("It should return a greeting")

      greeting shouldBe expectedValue
    }
  }
}