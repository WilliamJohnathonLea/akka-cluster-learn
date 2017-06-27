package org.will

import akka.actor.{ActorSystem, Props}

/**
  * Created by william on 23/06/17.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val system = ActorSystem("ClusterSystem")

    system.actorOf(Props[SimpleClusterListener])

  }

}
