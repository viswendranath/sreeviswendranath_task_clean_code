package task_clean_code;

public class ConstructionCostCalculator {
	public static double calculateConstructionCost(String standard, double area, boolean automatedHouse) {
		standard = standard.toLowerCase();
		if(standard.equals("standard")) {
			return area*1200;
		}else if(standard.equals("above standard")) {
			return area*1500;
		}else if(standard.equals("high standard") && !automatedHouse) {
			return area*1800;
		}else if(standard.equals("high standard") && automatedHouse) {
			return area*2500;
		}
		return 0;
	}
}
