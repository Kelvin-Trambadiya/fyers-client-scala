package com.kelvin.api.client.models.response

/**
  * SingleOrderResponse attributes
  *
  * @param s ok / error
  * @param code This is the code to identify specific responses
  * @param message Message to clarify the request status.Eg: Successfully modified order
  * @param id The order number of the placed order.
  */
final case class SingleOrderResponse(
    s: String,
    code: Int,
    message: String,
    id : String
) extends BaseResponse
