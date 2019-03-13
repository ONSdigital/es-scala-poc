package algorithmia.ascalaalgorithm

import org.scalatest._

class ascalaalgorithmSpec extends FlatSpec with Matchers {
  "Initial ascalaalgorithm algorithm" should "return Hello plus input" in {
    val algorithm = new ascalaalgorithm()
    "Hello Bob" shouldEqual algorithm.apply("Bob")
  }
}
