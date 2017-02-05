package io.scalajs.npm.moment

import org.scalatest.FunSpec

/**
  * Moment Tests
  * @author lawrence.daniels@gmail.com
  */
class MomentTest extends FunSpec {

  describe("Moment") {

    it("should convert date formatted strings to date objects") {
      val dateString = "9/01/2016 6:17a"
      val dateObject = Moment(dateString, "M/DD/YYYY h:mma")
      info(s"dateObject => $dateObject")
    }

    it("should convert a date formatted string an ISO date with a user-defined timezone") {
      MomentTimezone
      val dateString = "9/01/2016 6:17a"
      val dateObject = Moment(dateString, "M/DD/YYYY h:mma").tz("America/New_York").toISOString()
      info(s"dateObject => $dateObject")
    }

  }

}
