package com.kelvin.api.client.models.request


/**
  * This allows the user to place an order to any exchange via Fyers
  *
  * @param symbol Eg: NSE:SBIN-EQ
  * @param qty The quantity should be in multiples of lot size for derivatives.
  * @param type order type
  *     1	Limit order
  *     2	Market order
  *     3	Stop order (SL-M)
  *     4	Stoplimit order (SL-L)
  * @param side order sides
  *     1	Buy
  *     -1	Sell
  * @param productType
  *     CNC	        => For equity only
  *     INTRADAY	=> Applicable for all segments
  *     MARGIN	    => Applicable only for derivatives
  *     CO	        => Cover Order
  *     BO	        => Bracket Order
  * @param limitPrice Default => 0 | Provide valid price for Limit and Stoplimit orders
  * @param stopPrice Default => 0 | Provide valid price for Stop and Stoplimit orders
  * @param disclosedQty Default => 0 | Allowed only for Equity
  * @param validity IOC => Immediate or Cancel | DAY => Valid till the end of the day
  * @param offlineOrder False => When market is open | True => When placing AMO order
  * @param stopLoss Default => 0 | Provide valid price for CO and BO orders
  * @param takeProfit Default => 0 | Provide valid price for BO orders
  */
final case class SingleOrderRequest(
    symbol: String,
    qty: Int,
    `type`: Int,
    side: Int,
    productType: String,
    limitPrice: Float,
    stopPrice: Float,
    disclosedQty: Int,
    validity: String,
    offlineOrder: String,
    stopLoss: Float,
    takeProfit: Float
)