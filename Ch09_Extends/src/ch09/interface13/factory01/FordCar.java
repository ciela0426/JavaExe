package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("SamsungTablet - The engine starts well~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("SamsungTablet - The start-off works well~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("SamsungTablet - The accelator accelated well~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("SamsungTablet - have a good brake stop~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

}
