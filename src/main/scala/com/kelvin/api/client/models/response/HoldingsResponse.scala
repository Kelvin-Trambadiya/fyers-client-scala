package com.kelvin.api.client.models.response

/**
  * Request Attributes - For each holding
  *
  * @param symbol Eg: NSE:RCOM-EQ
  * @param holdingType Identify the type of holding
  *     - T1 : The shares are purchased but not yet delivered to the demat account
  *     - HLD: The shares are purchased and are available in the demat account.
  * @param quantity The quantity of the symbol which the user has at the beginning of the day
  * @param remainingQuantity This reflects the quantity - the quantity sold during the day
  * @param pl Profit and loss made
  * @param costPrice The original buy price of the holding
  * @param marketVal The Market value of the current holding
  * @param ltp LTP is the price from which the next sale of the stocks happens
  * @param id The unique value for each holding
  * @param fyToken Fytoken is a unique identifier for every symbol.
  * @param exchange The exchange in which order is placed.
  *     - 10: NSE (National Stock Exchange)
  *     - 11: MCX (Multi Commodity Exchange)
  *     - 12: BSE (Bombay Stock Exchange)
  * @param segment The segment in which the holding is taken.
  *     - 10: Capital Market
  *     - 11: Equity Derivatives
  *     - 12: Currency Derivatives
  *     - 20: Commodity Derivatives
  * @param isin Unique ISIN provided by exchange for each symbol
  * @param qty_t1 Quantity t+1 day
  * @param remainingPledgeQuantity Remaining Pledged quantity
  * @param collateralQuantity Pledged quantity
  */
final case class Holding(
    symbol: String,
    holdingType: String,
    quantity: Int,
    remainingQuantity: Int,
    pl: Float,
    costPrice: Float,
    marketVal: Float,
    ltp: Float,
    id: Int,
    fyToken: Long,
    exchange: Int,
    segment: Int,
    isin: String,
    qty_t1: Int,
    remainingPledgeQuantity: Int,
    collateralQuantity: Int
)

/**
  * Response Attributes - Overall holdings
  *
  * @param count_total Total number of holdings present
  * @param total_investment Invested amount for the current holdings
  * @param total_current_value The present value of the holdings
  * @param total_pl Total profit and loss made
  * @param pnl_perc Percentage value of the total pnl
  */
final case class OverallHolding(
    count_total: Int,
    total_investment: Float,
    total_current_value: Float,
    total_pl: Float,
    pnl_perc: Float
)

/**
  * Fetches the equity and mutual fund holdings which the user has in this demat account. This will include T1 and demat holdings.
  *
  * @param s
  * @param code
  * @param message
  */
final case class HoldingsResponse(
    s: String,
    code: Int,
    message: String,
    holdings: List[Holding],
    overall: OverallHolding
) extends BaseResponse
