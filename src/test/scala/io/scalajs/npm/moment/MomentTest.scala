package io.scalajs.npm.moment

import io.scalajs.nodejs.Assert
import org.scalatest.FunSpec

/**
  * Moment Tests
  * @author lawrence.daniels@gmail.com
  */
class MomentTest extends FunSpec {

  describe("Moment") {

    it("should convert date formatted strings to date objects") {
      val input = "9/01/2016 6:17a"
      info(s"input => $input")

      val output = Moment(input, "M/DD/YYYY h:mma").toString
      info(s"output => $output")

      Assert.equal(output, "Thu Sep 01 2016 06:17:00 GMT-0700")
    }
  }

  describe("MomentTimezone") {

    it("should convert a date formatted string an ISO date with a user-defined timezone") {
      val input = "9/01/2016 6:17a"
      info(s"input => $input")

      val output = Moment(input, "M/DD/YYYY h:mma").tz("America/New_York").toISOString()
      info(s"output => $output")

      Assert.equal(output, "2016-09-01T13:17:00.000Z")
    }

    it("should apply a timezone and custom formatting to a moment object") {
      val input = "2014-06-01T12:00:00Z"
      info(s"input => $input")

      val moment = Moment(input)
      val output = moment.tz("America/Los_Angeles").format("ha z")
      info(s"output => $output")

      Assert.equal(output, "5am PDT")
    }

  }

}
