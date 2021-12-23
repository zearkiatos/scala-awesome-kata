package ifsFors.scala_awesome_kata

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration._

import ifsFors.scala_awesome_kata.Ingredients.{Bacon, FriedBacon}

final class Fryer(implicit ec: ExecutionContext) {
  private val minFryTime = 1.second

  def fry(bacon: Bacon): Future[FriedBacon] = Future {
    Thread.sleep(minFryTime.toMillis)

    FriedBacon(bacon)
  }
}
