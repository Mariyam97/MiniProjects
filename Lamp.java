package Day3;

public class Lamp {
//stores the value for light
//true if light is on
//true if light is off
	
	boolean isOn;
	
	
	//method to turn on the light
	public void turnOn() {
		isOn = true;
		System.out.println("Light on? " + isOn);
	}
	
	//method to turn off the light
		public void turnOff() {
			isOn = false;
			System.out.println("Light off? " + isOn);
		}
	
		
			public static void main(String[] args) {
				//create objects led and halogen
				
				Lamp led = new Lamp();
				Lamp halogen = new Lamp();
				
				
				//turn on the light by calling method turnon()
				
				led.turnOn();
				led.turnOff();
				//led.turnOn();
				//led.turnOff();
				
				//halogen.turnOn();
				//halogen.turnOff();
				halogen.turnOn();
				halogen.turnOff();
				
			}
		}

