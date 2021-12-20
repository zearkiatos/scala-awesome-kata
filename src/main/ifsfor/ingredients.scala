package pedrocapriles.scala_awesome_kata

abstract class Ingredient()

object Ingredients {
  final case class Bread() extends Ingredient
  final case class Cheese() extends Ingredient
  final case class Ham() extends Ingredient
  final case class Egg() extends Ingredient
  final case class Bacon() extends Ingredient
  final case class FriedBacon(bacon: Bacon) extends Ingredient
}
