package testscala

import org.scalatest._
import org.scalatest.Matchers._

final class ScalaTest extends WordSpec with GivenWhenThen {
  "Scala Test" should {
    "save" in {
      Given("a value")

      val myValue = 0

      val expectedValue = 0

      When("try to declarate with another value")

      myValue shouldBe expectedValue
    }
  }
}