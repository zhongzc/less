/*
 * Copyright (c) 2019, Gaufoo. All rights reserved.
 */

package com.gaufoo.server

import com.gaufoo.JettyServer
import org.scalatest.{FlatSpec, Matchers}

class ServerSpec extends FlatSpec with Matchers {
  "Server" should "be started successfully" in {
    val server = JettyServer()
    try {
      server.start()
      Thread.sleep(200)
      server.stop()
    } catch {
      case e: Throwable => fail(e.getMessage)
    }
    succeed
  }
}
