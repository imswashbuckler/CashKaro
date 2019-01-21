package AProgramsPorblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeFailFast {

	public void FailSafe() {

		ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.remove("Apple");
		}

		Iterator iterator1 = premiumPhone.keySet().iterator();
	
		while (iterator1.hasNext()) {
			System.out.println(premiumPhone.get(iterator1.next()));
				}

	}

	public void FailFast() {
		Map<String, String> premiumPhone = new HashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}

	}

	public static void main(String[] args) {

		FailSafeFailFast obj = new FailSafeFailFast();
		obj.FailSafe();
		//obj.FailFast();
	}

}
