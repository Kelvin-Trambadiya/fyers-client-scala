package com.kelvin.api.client.utils

import org.apache.logging.log4j.LogManager

trait FyersLogger {
  val logger = LogManager.getLogger(getClass.getName())
}
