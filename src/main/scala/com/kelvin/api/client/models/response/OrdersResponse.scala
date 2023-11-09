package com.kelvin.api.client.models.response

/**
  * Response attributes - For each order
  *
  * @param id The unique order id assigned for each order
  * @param exchOrdId The order id provided by the exchange
  * @param symbol The symbol for which order is placed
  * @param qty 	The original order qty
  * @param remainingQuantity The remaining qty
  * @param filledQty The filled qty after partial trades
  * @param status Order Status
  *     - 1:	Cancelled
  *     - 2:	Traded / Filled
  *     - 3:	For future use
  *     - 4:	Transit
  *     - 5:	Rejected
  *     - 6:	Pending
  * @param slNo This is used to sort the orders based on the time
  * @param message The error messages are shown here
  * @param segment
  *     10 => E (Equity)
  *     11 => D (F&O)
  *     12 => C (Currency)
  *     20 => M (Commodity)
  * @param limitPrice The limit price for the order
  * @param stopPrice The limit price for the order
  * @param productType The product type
  * @param type
  *     1 => Limit Order
  *     2 => Market Order
  *     3 => Stop Order (SL-M)
  *     4 => Stoplimit Order (SL-L)
  * @param side Position Sides
  *     1  =>	Long
  *     -1 =>	Short
  *     0  =>	Closed position
  * @param disclosedQty Disclosed quantity
  * @param orderValidity DAY / IOC
  * @param orderDateTime The order time as per DD-MMM-YYYY hh:mm:ss in IST
  * @param parentId The parent order id will be provided only for applicable orders..
  *     Eg: BO Leg 2 & 3 and CO Leg 2
  * @param tradedPrice The average traded price for the order
  * @param source Source from where the order was placed.
  *     M	Mobile
  *     W	Web
  *     R	Fyers One
  *     A	Admin
  *     ITS	API
  * @param fyToken Fytoken is a unique identifier for every symbol.
  * @param offlineOrder
  *     False => When market is open
  *     True => When placing AMO order
  * @param pan PAN of the client
  * @param clientId The client id of the fyers user
  * @param exchange The exchange in which order is placed
  * @param instrument Exchange instrument type
  * @param discloseQty Disclosed quantity
  */
final case class Order(
    id: String,
    exchOrdId: String,
    symbol: String,
    qty: Int,
    remainingQuantity: Int,
    filledQty: Int,
    status: Int,
    slNo: Int,
    message: String,
    segment: Int,
    limitPrice: Float,
    stopPrice: Float,
    productType: String,
    `type`: Int,
    side: Int,
    disclosedQty: Int,
    orderValidity: String,
    orderDateTime: String,
    parentId: String,
    tradedPrice: Float,
    source: String,
    fyToken: String,
    offlineOrder: Boolean,
    pan: String,
    clientId: String,
    exchange: Int,
    instrument: Int,
    discloseQty: Int
)

/**
  * Fetches all the orders placed by the user across all platforms and exchanges in the current trading day.
  *
  * @param s
  * @param code
  * @param message
  * @param orderBook
  */
final case class OrdersResponse(
    s: String,
    code: Int,
    message: String,
    orderBook: List[Order]
) extends BaseResponse
