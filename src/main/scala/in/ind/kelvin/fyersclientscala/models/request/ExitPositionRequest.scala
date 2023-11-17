package in.ind.kelvin.fyersclientscala.models.request

/**
  * Exit Position: This allows the user to either exit all open positions or any specific open position.
  *
  * @param id In case id is not passed, then all the open positions will be closed
  */
final case class ExitPositionRequest(id: String)
