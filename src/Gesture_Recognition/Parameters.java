package Gesture_Recognition;

public class Parameters {
	private static Parameters singleton = new Parameters();
	private double scale = 0.1;
	private double tempScale = 0.1;
	private double scaleUnit = 0.1;
	private double counter = 0;

	private Parameters() {
	}

	public static Parameters getInstance() {
		return singleton;
	}

	public double getScale() {
		return scale;
	}
	
	public double getScaleUnit() {
		return scaleUnit;
	}
	
	public double getCounter() {
		return counter;
	}
	
	public void addCounter(int add) {
		counter = counter + add;
	}
	
	public void setCounterZero(){
		counter = 0;
	}
	
	public double getTempScale() {
		return tempScale;
	}
	
	
	public void setTempScale(double tempScale){
		this.tempScale = tempScale;
	}
	public void setScale(double scale) {
		this.scale = scale;
	}
	
	
}
