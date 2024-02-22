package abstractdemo;

public class CameraPhoto extends Camera {

	@Override
	public void shutter() {
System.out.println("Shutter:- Shutter time is measured in fractions of second.");
		
	}

	@Override
	public void autofocus() {
System.out.println("Autofocus:- Adjust its focusing elements to give a sharp image.");		
	}

	@Override
	public void aperture() {
System.out.println("Aperture:- Opening in lenes from where light passes through.");		
	}

	@Override
	public void sensor() {
System.out.println("Sensor:- Solid state device that captures light and converts into digital image.");
	}

}
