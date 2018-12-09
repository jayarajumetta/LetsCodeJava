package mj.javaProgrammes;

public class BicycleDemo {
	
	//State of a Bike
	int cadence=0;
	int gear=1;
	int speed=0;
	
	//Behavior of a bike
	
	 void changeCadence(int newCadenceValue){
		 cadence=newCadenceValue;
		
	};
	
	 void changeGear(int newGearValue ){
		 gear=newGearValue;
		
	};
	
	 void speedUp(int increment){
		 
		 speed=speed+increment;
		
	};
	void applyBreaks(int decrement)
	{
		speed=speed-decrement;
		
	};
	
	void printState(){
		
		System.out.println("Bicycle State"+"\n" +
		
" Cadence:" + cadence + "\n Gear:"+	gear + "\n Speed:" +	speed);
	};

}
