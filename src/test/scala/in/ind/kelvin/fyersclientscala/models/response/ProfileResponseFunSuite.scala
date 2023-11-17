package in.ind.kelvin.fyersclientscala.models.response

import org.scalatest.funsuite.AnyFunSuite
import in.ind.kelvin.fyersclientscala.models.response.{ProfileResponse, ProfileData}
import play.api.libs.json.JsValue
import in.ind.kelvin.fyersclientscala.utils.FyersLogger

class ProfileResponseFunSuite extends AnyFunSuite with FyersLogger {
  val json = """
    {
        "s":"ok",
        "code":200,
        "message":"",
        "data": {
            "name":"XASHXX G H",
            "image":"https://fyers-user-details.s3.amazonaws.com/image/FK6107548224?X-Amz-Algorithm=AWS4-HMAC",
            "display_name":"Y2K",
            "email_id":"xashxx.ghang@gmail.com",
            "PAN":"EXXXXXXXXE",
            "fy_id":"FX0011",
            "pin_change_date":"19-08-2020 14:58:41",
            "mobile_number":"xxxxxxxxxx",
            "totp":true,
            "pwd_change_date":"19-08-2020 14:58:41",
            "pwd_to_expire":42
        }
    }
    """

  test("fromJson method should convert valid json to ProfileResponse") {
    assert(ProfileResponse.fromJson(json).isDefined)
  }
}
