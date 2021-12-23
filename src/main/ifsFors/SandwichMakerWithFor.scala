package ifsFors.scala_awesome_kata

import scala.concurrent.{ExecutionContext, Future}

final class SandwichMakerWithFor(private val fridge: Fridge, private val fryer: Fryer)(implicit ec: ExecutionContext) {
  def make(): Future[Sandwich] =
    for {
      breadOption  <- fridge.takeBread()
      cheeseOption <- fridge.takeCheese()
      hamOption    <- fridge.takeHam()
      eggOption    <- fridge.takeEgg()
      baconOption  <- fridge.takeBacon()
    } yield Sandwich(Seq(breadOption, cheeseOption, hamOption, eggOption, baconOption))
}
