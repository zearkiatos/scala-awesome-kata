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
      val greeting = methodScala.delay
      Then("It should return a greeting")

      greeting shouldBe expectedValue
    }
  }

    "MethodScalaTest" should {
    "return a greeting with some name" in {
      Given("a MethodScalaTest")

      val methodScala = new MethodScala

      When("Return a greeting with a name")

      val expectedValue = "Hi Pedro"
      val greeting = methodScala.greeting("Pedro")
      Then("It should return a greeting with name Pedro")

      greeting shouldBe expectedValue
    }
  }
}