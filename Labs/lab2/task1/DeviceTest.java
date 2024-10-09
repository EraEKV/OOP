package task1;

import java.util.HashSet;

public class DeviceTest {

	public static void main(String[] args) {
		HashSet <Device> devices = new HashSet<>();
		
		Desktop comp = new Desktop("PC", 2023, 650); //650W
		Desktop comp1 = new Desktop("PC", 2023, 650); //650W
		Mobile nout = new Mobile("Acer Aspire 3", 2017, 4000); // 4000mAh
		Mobile smartphone = new Mobile("Samsung Galaxy", 2017, 4000); // 4000mAh
		
		devices.add(smartphone);
		devices.add(nout);
		devices.add(comp);
		devices.add(comp1);
		
		System.out.println(devices);
	}
}
