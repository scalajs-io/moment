package io.scalajs.npm

import io.scalajs.util.ScalaJsHelper._

/**
  * moment package object
  * @author lawrence.daniels@gmail.com
  */
package object moment {
  val SUNDAY = 0
  val MONDAY = 1
  val TUESDAY = 2
  val WEDNESDAY = 3
  val THURSDAY = 4
  val FRIDAY = 5
  val SATURDAY = 6

  // ensure the moment-timezone package is loaded
  MomentTimezone

  /**
    * Moment Extensions
    * @param moment the given [[Moment moment]] instance
    */
  implicit class MomentExtensions(val moment: Moment) extends AnyVal {

    @inline
    def tz(timeZone: String): Moment = moment.dynamic.tz(timeZone).asInstanceOf[Moment]

  }

}
