package in.ind.kelvin.fyersclientscala.models.response


/**
  * Exit Position Response attributes
  *
  * @param s ok / error
  * @param code This is the code to identify specific responses
  * @param message Message to clarify the request status. Eg:All positions are closed
  */
final case class ExitPositionResponse(
    s: String,
    code: Int,
    message: String
) extends BaseResponse
