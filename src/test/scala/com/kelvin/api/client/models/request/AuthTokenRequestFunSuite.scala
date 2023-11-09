package com.kelvin.api.client.models.request

import org.scalatest.funsuite.AnyFunSuite
import play.api.libs.json.JsValue
import com.fasterxml.jackson.core.JsonParseException

class AuthTokenRequestFunSuite extends AnyFunSuite {

  val authTokenRequest = AuthTokenRequest(
    grant_type = "grant_type",
    appIdHash = "appIdHash",
    code = "code"
  )

  val json =
    """{"grant_type":"grant_type","appIdHash":"appIdHash","code":"code"}"""

  test("toJson method should convert AuthTokenRequest to json") {
    AuthTokenRequest.toJson(authTokenRequest) match
      case x: JsValue => succeed
      case _ => fail("Unexpected failure to serialize AuthTokenRequest to json")
  }

  test("fromJson method should convert valid json to AuthTokenRequest") {
    assert(AuthTokenRequest.fromJson(json).isDefined)
  }

  test("fromJson method should return None in case of json does not mapped to AuthTokenRequest") {
    assert(AuthTokenRequest.fromJson("""{"key1":"value1","key2":"value2"}""").isEmpty)
  }

  test("fromJson method should throw JsonParseException exception in case of incorrect json") {
    assertThrows[JsonParseException](AuthTokenRequest.fromJson("<xml>I am not json, I will be catched soon!</xml>"))
  }

}
