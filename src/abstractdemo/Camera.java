package abstractdemo;

public abstract class Camera {

	public void lens() {
		System.out.println("Lens:- The lens of the camera is optical.");
		
	}
	
	public void modedial() {
		System.out.println("Modedial:- The Modedial of camera help to swtich mode.");
	}
	
	public abstract void shutter();
	public abstract void autofocus();
	public abstract void aperture();
	public abstract void sensor();
	
}
