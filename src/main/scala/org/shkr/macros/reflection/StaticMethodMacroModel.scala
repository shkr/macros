package org.shkr.macros.reflection

object StaticMethodMacroModel {

  /** An Actor Object that is configured by its Agent*/
  case class Actor(name: String)

  /** Studio contains name of an ActorAgent*/
  trait Studio {

    /** className of an ActorAgent */
    val actorAgent: String
  }

  /** An ActorAgent is the only object which has a static method to get an Actor */
  trait ActorAgent {

    def props(config: Studio): Actor
  }

  object DramaActorAgent extends ActorAgent {

    def props(config: Studio): Actor = Actor("Dilip Kumar")
  }

  class RKStudios(actorAgentRef: String) extends Studio {

    val actorAgent: String = actorAgentRef
  }
}
