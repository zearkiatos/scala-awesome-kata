package pedrocapriles.scala_awesome_kata

import scala.concurrent.Future


import pedrocapriles.scala_awesome_kata.Ingredients.scala_awesome_kata.Ingredients._

final class Fridge {
  def takeBread(): Future[Option[Bread]] = Future.successful(Option(Bread()))

  def takeCheese(): Future[Option[Cheese]] = Future.successful(Option(Cheese()))

  def takeHam(): Future[Option[Ham]] = Future.successful(Option(Ham()))

  def takeEgg(): Future[Option[Egg]] = Future.successful(Option(Egg()))

  def takeBacon(): Future[Option[Bacon]] = Future.successful(Option(Bacon()))
}
