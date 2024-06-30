package StrategyV1;

public class PathCalcStrategyFactory {
	static PathCalcStrategy findPathCalcStrategyByMode(TravelMode travelMode) {
		PathCalcStrategy p=null;
		if(travelMode.equals(TravelMode.BIKE)) {
			p=new BikePathCalcStrategy();
			
		} else if(travelMode.equals(TravelMode.CAR)) {
			p=new CarPathCalcStrategy();
			
		}else if(travelMode.equals(TravelMode.WALK)) {
			p=new WalkPathCalcStrategy();
			
		}
		return p;
		}
	

}
