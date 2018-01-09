package org.will

import akka.actor.Actor

class HelloActor extends BaseClusterActor {
  override def userMessages: Actor.Receive = {
    case _ => sender() ! "Hello to you too!"
  }
}
