package lib;

import akka.actor.ActorSystem;
import akka.remote.AddressUidExtension;

public class Lib {
	public Long main(ActorSystem system) {
		AddressUidExtension e = AddressUidExtension.get(system);
		return 42L;
	}
}
