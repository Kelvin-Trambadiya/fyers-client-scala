package in.ind.kelvin.fyersclientscala.models.request

import play.api.libs.functional.syntax._
import play.api.libs.json._

/** Model for Refresh Token request.
  * 
  * @param grant_type The grant_type parameter must be set to “refresh_token”.
  * @param appIdHash SHA-256 of api_id + app_secret. Eg: SHA-256 of app_id:app_secret is
  * @param refresh_token The refresh token previously issued to the client from the validate auth code API
  * @param pin The user's pin
  */
final case class RefreshTokenRequest(
    grant_type: String,
    appIdHash: String,
    refresh_token: String,
    pin: String
)

object RefreshTokenRequest {
  implicit val refreshTokenRequestReads: Reads[RefreshTokenRequest] =
    Json.reads[RefreshTokenRequest]

  implicit val refreshTokenRequestWrites: OWrites[RefreshTokenRequest] =
    Json.writes[RefreshTokenRequest]

  def fromJson(jsValue: JsValue): Option[RefreshTokenRequest] = {
    Json.fromJson[RefreshTokenRequest](jsValue).asOpt
  }

  def fromJson(json: String): Option[RefreshTokenRequest] = {
    fromJson(Json.parse(json))
  }

  def toJson(refreshTokenRequest: RefreshTokenRequest): JsValue = {
    Json.toJson(refreshTokenRequest)
  }
}