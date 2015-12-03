package org.shkr.macros.reflection

object StaticMethodInvocation {

  val ru = scala.reflect.runtime.universe

  val m = ru.runtimeMirror(getClass.getClassLoader)

  def launch(param: Studio): Actor = {

    m.reflectModule(m.staticModule(param.actorAgent)).instance.asInstanceOf[ActorAgent].props(param)
  }
}
