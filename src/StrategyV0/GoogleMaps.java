package StrategyV0;

public class GoogleMaps {
	public void findPathByMode(TravelMode travelMode) {
		if(travelMode.equals(TravelMode.BIKE)) {
			System.out.println("Finding the path for Bike");
		} else if(travelMode.equals(TravelMode.CAR)) {
			System.out.println("Finding the path for Car");
		}else if(travelMode.equals(TravelMode.WALK)) {
			System.out.println("Finding the path for Walk");
		}
	}

}
