package in.ind.kelvin.fyersclientscala.models.response

/**
  * ModifyOrderResponse attribute
  *
  * @param s
  * @param code
  * @param message
  * @param id
  */
final case class ModifyOrderResponse(
    s: String,
    code: Int,
    message: String,
    id : String
) extends BaseResponse