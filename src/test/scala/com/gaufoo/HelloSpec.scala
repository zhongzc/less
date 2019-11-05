/*
 * Copyright (c) 2019, Gaufoo. All rights reserved.
 */

package com.gaufoo

import org.scalatest.{FlatSpec, Matchers}

class HelloSpec extends FlatSpec with Matchers {
  "The Hello class" should "say hello" in {
    val hello = new Hello
    hello.greeting shouldEqual "hello"
    hello.sayHello shouldEqual "hello world!"
  }
}
