package com.kelvin.api.client.models.request

import play.api.libs.functional.syntax._
import play.api.libs.json._

/** Model for Auth Token request.
  *
  * @param grant_type
  *   This value must always be “authorization_code"
  * @param appIdHash
  *   SHA-256 of api_id + app_secret
  * @param code
  *   This is the auth_code which is received from the first step (get auth_code
  *   request)
  */
final case class AuthTokenRequest(
    grant_type: String,
    appIdHash: String,
    code: String
)

object AuthTokenRequest {
  implicit val authTokenRequestReads: Reads[AuthTokenRequest] =
    Json.reads[AuthTokenRequest]

  implicit val authTokenRequestWrites: OWrites[AuthTokenRequest] =
    Json.writes[AuthTokenRequest]

  def fromJson(jsValue: JsValue): Option[AuthTokenRequest] = {
    Json.fromJson[AuthTokenRequest](jsValue).asOpt
  }

  def fromJson(json: String): Option[AuthTokenRequest] = {
    fromJson(Json.parse(json))
  }

  def toJson(authTokenRequest: AuthTokenRequest): JsValue = {
    Json.toJson(authTokenRequest)
  }
}
