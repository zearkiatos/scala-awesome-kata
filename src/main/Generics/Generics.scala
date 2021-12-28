val initSquence = Seq(1, 2, 3)

val stringSequence = Seq("uno", "dos", "tres")

case class UserId(value: String)

case class User(id: UserId)

//Interface
trait Repository[AgregateIdType, AggregateType] {
  def save(aggregate: AggregateType) : Unit

  def Search(id: AggregateIdType): AggregateType
}

class FakeUserRepository extends Repository[UserId, User] {
  def save(aggregate: User): Unit = ()

  def search(id: UserId): User = User(id)
}
