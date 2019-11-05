/*
 * Copyright (c) 2019, Gaufoo. All rights reserved.
 */

package com.gaufoo

trait Server {
  def start(): Unit
  def join(): Unit
  def stop(): Unit
}
