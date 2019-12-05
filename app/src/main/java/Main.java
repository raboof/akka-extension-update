package app;

import akka.remote.AddressUidExtension;
import akka.actor.ActorSystem;
import lib.Lib;

class Main {
	public static void main(String[] argv) {
		ActorSystem system = ActorSystem.create();
		//Long uid = new Lib().main(system);
		AddressUidExtension e = AddressUidExtension.get(system);
		//Long uid = e.uniqueAddress();
		//System.out.println(uid.toString());
	}
}
