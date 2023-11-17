package in.ind.kelvin.fyersclientscala.models.response


/**
  * Response attributes - For each trade
  *
  * @param symbol Eg: NSE:SBIN-EQ
  * @param row The unique value to sort the trades
  * @param orderDateTime The time when the trade occured in “DD-MM-YYYY hh:mm:ss” format in IST
  * @param orderNumber The order id for which the trade occurred
  * @param tradeNumber The trade number generated by the exchange
  * @param tradePrice The traded price
  * @param tradeValue The total traded value
  * @param tradedQty The total traded qty
  * @param side 1 Buy AND -1 Sell
  * @param productType The product in which the order was placed
  * @param exchangeOrderNo The order number provided by the exchange
  * @param segment The segment in which order is placed
  * @param exchange The exchange in which order is placed
  * @param fyToken Fytoken is a unique identifier for every symbol.
  */
final case class Trade(
    symbol: String,
    row: Int,
    orderDateTime: String,
    orderNumber: String,
    tradeNumber: String,
    tradePrice: Float,
    tradeValue: Float,
    tradedQty: Int,
    side: Int,
    productType: String,
    exchangeOrderNo: String,
    segment: Int,    
    exchange: Int,
    fyToken: String
)

/**
  * Fetches all the trades for the current day across all platforms and exchanges in the current trading day.
  *
  * @param s
  * @param code
  * @param message
  */
final case class TradesResponse(
    s: String,
    code: Int,
    message: String,
    tradeBook: List[Trade]
) extends BaseResponse