package com.kelvin.api.client.models.response


/**
  * Response attributes - For each position
  *
  * @param symbol Eg: NSE:SBIN-EQ
  * @param id The unique value for each position
  * @param buyAvg Average buy price
  * @param buyQty Total buy qty
  * @param sellAvg Average sell price
  * @param sellQty Total sell qty
  * @param netAvg netAvg
  * @param netQty Net qty
  * @param side The side shows whether the position is long / short
  * @param qty Absolute value of net qty
  * @param productType The product type of the position
  *     CNC	        => For equity only
  *     INTRADAY	=> Applicable for all segments
  *     MARGIN	    => Applicable only for derivatives
  *     CO	        => Cover Order
  *     BO	        => Bracket Order
  * @param realized_profit The realized p&l of the position
  * @param pl The total p&l of the position
  * @param crossCurrency
  *     Y => It is cross currency position
  *     N => It is not a cross currency position
  * @param rbiRefRate Incase of cross currency position, the rbi reference rate will be required to calculate the p&l
  * @param qtyMulti_com Incase of commodity positions, this multiplier is required for p&l calculation
  * @param segment The segment in which the position is taken.
  * @param exchange The exchange in which the position is taken.
  * @param slNo This is used for sorting of positions
  * @param ltp LTP is the price from which the next sale of the stocks happens
  * @param fyToken Fytoken is a unique identifier for every symbol.
  * @param cfBuyQty Carry forward buy quantity
  * @param cfSellQty Carry forward sell quantity
  * @param dayBuyQty Day forward buy quantity
  * @param daySellQty Day forward sell quantity
  */
final case class Position(
    symbol: String,
    id: String,
    buyAvg: Float,
    buyQty: Int,
    sellAvg: Float,
    sellQty: Int,
    netAvg: Float,
    netQty: Int,
    side: Int,
    qty: Int,
    productType: String,
    realized_profit: Float,
    pl: Float,
    crossCurrency: String,    
    rbiRefRate: Float,
    qtyMulti_com: Float,
    segment: Int,
    exchange: Int,
    slNo: Int,
    ltp: Float,
    fyToken: String,
    cfBuyQty: Int,
    cfSellQty:  Int,
    dayBuyQty:  Int,
    daySellQty:  Int,    
)

/**
  * Response attributes - Overall Positions
  *
  * @param count_total Total number of positions present
  * @param count_open Total number of positions opened
  * @param pl_total Total profit and losses
  * @param pl_realized Profit and losses when the owned product is sold
  * @param pl_unrealized Profit and loses when the product is owned , but is not sold
  */
final case class OverallPosition(
    count_total: Int,
    count_open: Int,
    pl_total: Float,
    pl_realized: Float,
    pl_unrealized: Float
)

/**
  * Fetches the current open and closed positions for the current trading day. Note that previous trading day’s closed positions will not be shown here.
  *
  * @param s
  * @param code
  * @param message
  * @param netPositions
  * @param overall
  */
final case class PositionsResponse(
    s: String,
    code: Int,
    message: String,
    netPositions: List[Position],
    overall: OverallPosition
) extends BaseResponse
