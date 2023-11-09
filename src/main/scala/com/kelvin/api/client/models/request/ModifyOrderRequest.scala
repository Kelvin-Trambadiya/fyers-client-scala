package com.kelvin.api.client.models.request


/**
  * This allows the user to modify a pending order. User can provide parameters which needs to be modified. In case a particular parameter has not been provided, the original value will be considered.
  *
  * @param id Mandatory. Eg: 119031547242
  * @param type Mandatory. Incase you want to change the order type of the pending order
  * @param limitPrice Mandatory. Only incase of Limit/ Stoplimit orders
  * @param stopPrice Mandatory. Only incase of Stop/ Stoplimit orders
  * @param qty Mandatory. Incase you want to modify the quantity
  */
final case class ModifyOrderRequest(
    id: String,
    `type`: Int,
    limitPrice: Float,
    stopPrice: Float,
    qty: Int
)

