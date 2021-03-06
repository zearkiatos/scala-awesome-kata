package ifsFors.scala_awesome_kata

import scala.concurrent.{ExecutionContext, Future}

final class SandwichMaker(private val fridge: Fridge, private val fryer: Fryer)(implicit ec: ExecutionContext) {
  def make(): Future[Sandwich] = {
    val breadOptionFuture = fridge.takeBread()
    val cheeseOptionFuture = fridge.takeCheese()
    val hamOptionFuture = fridge.takeHam()
    val eggOptionFuture = fridge.takeEgg()
    val baconOptionFuture = fridge.takeBacon()

    breadOptionFuture.flatMap { breadOption =>
      cheeseOptionFuture.flatMap { cheeseOption =>
        hamOptionFuture.flatMap { hamOption =>
          eggOptionFuture.flatMap { eggOption =>
            baconOptionFuture.map { baconOption =>
              Sandwich(Seq(breadOption, cheeseOption, hamOption, eggOption, baconOption))
            }
          }
        }
      }
    }
  }
}
