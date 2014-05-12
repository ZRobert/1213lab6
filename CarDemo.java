//Robert Payne
//L02
//6/5/2012

public class CarDemo{

	public static void main(String[] args){
	
		//objects
		Car carOne = new Car("Honda", 1997);
		Car carTwo = new Car("Ford", 2009);
	
		//increase carOne speed by 27
		for(int i = 0; i < 9; i++)
			carOne.accelerate();
	
		//increase carTwo speed by 99
		for(int i = 0; i < 33; i++)
			carTwo.accelerate();
	
		//output data for car one		
		System.out.println("Car one Make :\t" + carOne.getMAKE());
		System.out.println("Car one Year :\t" + carOne.getYEAR());
		System.out.println("Car one Speed :\t" + carOne.getSpeed());
		System.out.println();
		//output data for car two
		System.out.println("Car two Make :\t" + carTwo.getMAKE());
		System.out.println("Car two Year :\t" + carTwo.getYEAR());
		System.out.println("Car two Speed :\t" + carTwo.getSpeed());
		System.out.println();
		//reduce car one speed to 0 and car two speed to 60
		while(carOne.getSpeed() > 0 || carTwo.getSpeed() > 60)
		{
			if(carOne.getSpeed() > 0)
				carOne.brake();
			if(carTwo.getSpeed() > 60)
				carTwo.brake();
		}
		
		//output data for car one		
		System.out.println("Car one Make :\t" + carOne.getMAKE());
		System.out.println("Car one Year :\t" + carOne.getYEAR());
		System.out.println("Car one Speed :\t" + carOne.getSpeed());
		System.out.println();
		//output data for car two
		System.out.println("Car two Make :\t" + carTwo.getMAKE());
		System.out.println("Car two Year :\t" + carTwo.getYEAR());
		System.out.println("Car two Speed :\t" + carTwo.getSpeed());
		System.out.println();
	
	}	
}//end of CarDemo.java
	