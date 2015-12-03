package org.shkr.macros.reflection

import org.shkr.macros.reflection.StaticMethodMacroModel.{ActorAgent, Studio, Actor}

object StaticMethodInvocation {

  val ru = scala.reflect.runtime.universe

  val m = ru.runtimeMirror(getClass.getClassLoader)

  def launch(param: Studio): Actor = {

    m.reflectModule(m.staticModule(param.actorAgent)).instance.asInstanceOf[ActorAgent].props(param)
  }
}
