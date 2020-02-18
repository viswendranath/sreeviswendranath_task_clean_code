package task_clean_code;

import java.util.*;

public class ClientApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the area for construction");
		double area = sc.nextDouble();
				
		System.out.println("Enter material type you want to use\nstandard\nabove standard\nhigh standard");
		String material = sc.next()+sc.nextLine();
				
		boolean automated = false;
		if(material.toLowerCase().equals("high standard")) {
			System.out.println("Do you want home to be fully automated ? Yes / No");
			String yesOrNo = sc.nextLine();
			if(yesOrNo.toLowerCase().equals("yes"))
				automated = true;
		}
		
		System.out.println("Cost is " + ConstructionCostCalculator.calculateConstructionCost(material, area, automated));
	}
}
