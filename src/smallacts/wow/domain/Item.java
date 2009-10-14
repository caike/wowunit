package smallacts.wow.domain;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	public static List<String> weaponList = new ArrayList<String>();
	
	static {
		weaponList.add("sword");
		weaponList.add("dagger");
		weaponList.add("black magic");
	}


}
