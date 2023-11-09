package com.kelvin.api.client.models.request

/**
  * Cancel pending orders
  *
  * @param id Mandatory. Eg: 119031547242
  */
final case class CancelOrderRequest(id: String)
