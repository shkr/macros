package org.shkr.macros

import scala.language.experimental.macros
import scala.reflect.macros.Context

object Greeting {

  def greeting(param: Any): Unit = macro greetingImpl

  def greetingImpl(c: Context)(param: c.Expr[Any]): c.Expr[Unit] = {
    import c.universe._
    reify { println(param.splice) }
  }
}
