package StrategyV1;

public class GoogleMaps {
	//Here SRP is resolved but still OCP is violated- so create a factory class
	public void findPathByMode(TravelMode travelMode) {
		PathCalcStrategy p= PathCalcStrategyFactory.findPathCalcStrategyByMode(travelMode);
		p.findPath();
	}

}
