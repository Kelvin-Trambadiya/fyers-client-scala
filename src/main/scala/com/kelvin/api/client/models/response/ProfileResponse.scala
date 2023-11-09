package com.kelvin.api.client.models.response

import play.api.libs.json._
import play.api.libs.functional.syntax._

/** Model for User Profile Data
  *
  * @param name
  *   Name of the client
  * @param display_name
  *   Display name, if any, provided by the client
  * @param fy_id
  *   The client id of the fyers user
  * @param image
  *   URL link to the user’s profile picture, if any.
  * @param email_id
  *   Email address of the client
  * @param pan
  *   PAN of the client
  * @param pin_change_date
  *   Date when last PIN was updated
  * @param pwd_change_date
  *   Date when last password was updated
  * @param mobile_number
  *   Registered mobile number
  * @param totp
  *   Status of TOTP
  * @param pwd_to_expire
  *   Number of days until the current password expires
  */
final case class ProfileData(
    name: String,
    display_name: String,
    fy_id: String,
    image: String,
    email_id: String,
    PAN: String,
    pin_change_date: String,
    pwd_change_date: String,
    mobile_number: String,
    totp: Boolean,
    pwd_to_expire: Int
)

object ProfileData {
  implicit val profileDataReads: Reads[ProfileData] =
    Json.reads[ProfileData]

  implicit val profileDataWrites: OWrites[ProfileData] =
    Json.writes[ProfileData]

  def fromJson(jsValue: JsValue): Option[ProfileData] = {
    Json.fromJson[ProfileData](jsValue).asOpt
  }

  def fromJson(json: String): Option[ProfileData] = {
    fromJson(Json.parse(json))
  }

  def toJson(profileData: ProfileData): JsValue = {
    Json.toJson(profileData)
  }
}

final case class ProfileResponse(
    s: String,
    code: Int,
    message: String,
    data: ProfileData
) extends BaseResponse

object ProfileResponse {

  import ProfileData._

  implicit val profileResponseReads: Reads[ProfileResponse] =
    Json.reads[ProfileResponse]

  implicit val profileResponseWrites: OWrites[ProfileResponse] =
    Json.writes[ProfileResponse]

  def fromJson(jsValue: JsValue): Option[ProfileResponse] = {    
    Json.fromJson[ProfileResponse](jsValue).asOpt
  }

  def fromJson(json: String): Option[ProfileResponse] = {
    fromJson(Json.parse(json))
  }

  def toJson(profileResponse: ProfileResponse): JsValue = {
    Json.toJson(profileResponse)
  }
}
