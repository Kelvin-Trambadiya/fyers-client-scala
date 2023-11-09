package com.kelvin.api.client.models.response

import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
  * Model for Auth Token response
  *
  * @param s ok / error  
  * @param code This is the code to identify specific responses
  * @param message This is the message to identify the specific error responses
  * @param access_token This value will be used for all the subsequent requests.
  * @param refresh_token
  */
final case class AuthTokenResponse(
    s: String,
    code: Int,
    message: String,    
    access_token: String,
    refresh_token: String
) extends BaseResponse

object AuthTokenResponse {
  implicit val authTokenResponseReads: Reads[AuthTokenResponse] =
    Json.reads[AuthTokenResponse]

  implicit val authTokenResponseWrites: OWrites[AuthTokenResponse] =
    Json.writes[AuthTokenResponse]

  def fromJson(jsValue: JsValue): Option[AuthTokenResponse] = {
    Json.fromJson[AuthTokenResponse](jsValue).asOpt
  }

  def fromJson(json: String): Option[AuthTokenResponse] = {
    fromJson(Json.parse(json))
  }

  def toJson(authTokenResponse: AuthTokenResponse): JsValue = {
    Json.toJson(authTokenResponse)
  }
}
