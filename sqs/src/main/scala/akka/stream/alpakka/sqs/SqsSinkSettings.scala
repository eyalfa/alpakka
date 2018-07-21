/*
 * Copyright (C) 2016-2018 Lightbend Inc. <http://www.lightbend.com>
 */

package akka.stream.alpakka.sqs

object SqsSinkSettings {
  val Defaults = SqsSinkSettings(maxInFlight = 10)
}

final case class SqsSinkSettings(maxInFlight: Int) {
  require(maxInFlight > 0)

  def withMaxInFlight(maxInFlight: Int): SqsSinkSettings = copy(maxInFlight = maxInFlight)
}
