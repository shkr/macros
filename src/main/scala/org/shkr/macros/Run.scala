package org.shkr.macros

import org.shkr.macros.reflection.{StaticMethodInvocation, StaticMethodMacroModel}
import StaticMethodMacroModel.RKStudios

object Run extends App {

  /** HelloWorld Example */
  HelloWorld.hello()

  /** Greeting Example */
  Greeting.greeting("Namastey!")

  /**
    * Static Method Invocation
    * ```
    * Say you are in a situation where there are many types of Config (eq. Studio here) instances
    * Here we take example of the instance (aStudio: RKStudios)
    * A Studio provides you the name of a CompanionObject.
    * The CompanionObject contains an equivalent of an apply method (eq. props here)
    * You want to take any type of Studio, use the ActorAgent it refers then
    * retreive the Actor it creates.
    * This allows you to write the StaticMethodInvocation object compile it, which can be loaded
    * by any User project.
    * They can define their own Studio, own ActorAgent and own Actor.
    * However of they pass their an instance of their `Studio` your code
    * can create as many instances of the Actor from the ActorAgent referred by their Studio
    * ```
    * */
  val aStudio: RKStudios = new RKStudios("org.shkr.macros.StaticMethodMacroModel.DramaActorAgent")
  println(s"Introducing : ${StaticMethodInvocation.launch(aStudio)}")
}
