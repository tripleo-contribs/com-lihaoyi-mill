import mill._

object foo extends Cross[Foo](
      (Seq("a", "b"), Seq("c")),
      (Seq("a"), Seq("b", "c"))
    )
trait Foo extends Cross.Module2[Seq[String], Seq[String]]
