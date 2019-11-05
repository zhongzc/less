/*
 * Copyright (c) 2019, Gaufoo. All rights reserved.
 */

package com.gaufoo

import org.eclipse.jetty.server

class JettyServer(sv: server.Server) extends Server {
  override def start(): Unit = sv.start()
  override def join(): Unit  = sv.join()
  override def stop(): Unit  = sv.stop()
}

object JettyServer {
  def apply(port: Int = 7777): Server = {
    val sv = new server.Server(port)
    new JettyServer(sv)
  }
}
