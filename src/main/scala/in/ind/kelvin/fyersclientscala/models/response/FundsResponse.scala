package in.ind.kelvin.fyersclientscala.models.response

/**
  * Model for User Fund
  *
  * @param id Unique identity for particular fund
  * @param title Each title represents a heading of the ledger
  * @param equityAmount The amount in the capital ledger for the above-mentioned title
  * @param commodityAmount The amount in the commodity ledger for the above-mentioned title
  */
final case class FundLimit(
    id: Int,
    title: String,
    equityAmount: Float,
    commodityAmount: Float
)


final case class FundsResponse(
    s: String,
    code: Int,
    message: String,
    fund_limit: List[FundLimit]
) extends BaseResponse
