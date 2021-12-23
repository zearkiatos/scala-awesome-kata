package ifsFors.scala_awesome_kata

import scala.reflect.ClassTag

object Sandwich {
  def apply[T: ClassTag](allIngredients: Seq[Option[Ingredient]]): Sandwich = {
    val availableIngredients = allIngredients.flatten

    Sandwich(availableIngredients)
  }
}

final case class Sandwich(ingredients: Seq[Ingredient])
