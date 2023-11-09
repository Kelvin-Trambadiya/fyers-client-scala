package com.kelvin.api.client.models.response

/**
  * Cancel Order Response attributes
  *
  * @param s ok / error
  * @param code This is the code to identify specific responses
  * @param message Message to clarify the request status. Eg: Successfully canceled order
  * @param id The order number of the canceled order.Eg: 119031547242
  */
final case class CancelOrderResponse(
    s: String,
    code: Int,
    message: String,
    id : String
) extends BaseResponse
