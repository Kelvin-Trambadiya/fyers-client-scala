package com.kelvin.api.client.models.response

import org.scalatest.funsuite.AnyFunSuite
import com.kelvin.api.client.models.response.AuthTokenResponse
import play.api.libs.json.JsValue
import com.kelvin.api.client.utils.FyersLogger

class AuthTokenResponseFunSuite extends AnyFunSuite with FyersLogger {

  val authTokenResponse = AuthTokenResponse(
    s = "ok",
    code = 200,
    message = "",
    access_token = "eyJ0eXAiOi***.eyJpc3MiOiJh***.HrSubihiFKXOpUOj_7***",
    refresh_token = "eyJ0eXAiO***.eyJpc3MiOiJh***.67mXADDLrrleuEH_EE***"
  )

  val json =
    """{"s":"ok","access_token":"eyJ0eXAiOi***.eyJpc3MiOiJh***.HrSubihiFKXOpUOj_7***","refresh_token":"eyJ0eXAiO***.eyJpc3MiOiJh***.67mXADDLrrleuEH_EE***","code":200,"message":""}"""

  test("toJson method should convert AuthTokenResponse to json") {
    AuthTokenResponse.toJson(authTokenResponse) match 
      case _: JsValue => succeed
      case _ =>
        fail("Unexpected failure to serialize AuthTokenResponse to json")    
  }
}
