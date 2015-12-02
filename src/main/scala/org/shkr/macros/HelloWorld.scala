package org.shkr.macros

import scala.language.experimental.macros
import scala.reflect.macros.Context

object HelloWorld {

  def hello(): Unit = macro helloImpl

  def helloImpl(c: Context)(): c.Expr[Unit] = {
    import c.universe._
    reify { println("Hello World!") }
  }
}
