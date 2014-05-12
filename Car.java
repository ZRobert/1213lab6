//Robert Payne
//L02
//6/5/2012

public class Car{

	//fields
	private final String MAKE;	//make of the car
	private final int YEAR;		//year of the car
	private int speed;			//speed of the car
	
	//constructor
	public Car(String make, int year){
		MAKE = make;		//sets the make to the incoming argument string
		YEAR = year;		//sets the year of the car
		speed = 0;			//initializes the speed of the car
	}
	
	//class methods
	//mutators
	public void accelerate(){
		speed += 3;
		
		if(speed > 100)
			speed = 100;
	}//increases speed by 3 but does not increase over 100	
		
	public void brake(){
		speed -= 3;
		if(speed < 0)
			speed = 0;
	}//decreases speed by 3 but does not decrease under 0
	//getters
	public String getMAKE(){
		return MAKE;
	}//returns the make of the car as a string
	
	public int getYEAR(){
		return YEAR;
	}//returns the year of the car as an int
	
	public int getSpeed(){
		return speed;
	}//returns the speed of the car as int
}//end of Car.java