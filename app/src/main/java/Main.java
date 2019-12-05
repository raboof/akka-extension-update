package app;

import akka.actor.ActorSystem;
import lib.Lib;

class Main {
	public static void main(String[] argv) {
		ActorSystem system = ActorSystem.create();
		Long uid = new Lib().main(system);
		System.out.println(uid.toString());
	}
}
