package pedrocapriles.scala_awesome_kata

import org.scalatest._
import org.scalatest.Matchers._

final class ScalaAwesomeKataTest extends WordSpec with GivenWhenThen {
  "ScalaAwesomeKata" should {
    "greet" in {
      Given("a ScalaAwesomeKata")

      val scalaAwesomeKata = new ScalaAwesomeKata

      When("we ask him to greet someone")

      val nameToGreet = "CodelyTV"
      val greeting = scalaAwesomeKata.greet(nameToGreet)

      Then("it should say hello to someone")

      greeting shouldBe "Hello " + nameToGreet
    }
  }
}
