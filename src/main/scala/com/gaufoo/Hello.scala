/*
 * Copyright (c) 2019, Gaufoo. All rights reserved.
 */

package com.gaufoo

import com.typesafe.scalalogging.Logger

class Hello extends Greeting {
  val log = Logger(classOf[Hello])

  def sayHello: String = {
    log.info("invoking sayHello()")
    greeting + " world!"
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
