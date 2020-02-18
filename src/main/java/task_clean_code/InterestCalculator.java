package task_clean_code;

public final class InterestCalculator {
	
	public static double calculateSimpleInterest(double principalAmount, double timeInYears, double annualRate) throws Exception {
		if(principalAmount < 0 || timeInYears < 0 || annualRate < 0)
			throw new Exception("Any of the principalAmount, timeInYears, annualRate values can't be negative");
		return (principalAmount*timeInYears*annualRate)/100;
	}
	
	public static double calculateCompoundInterest(double principalAmount, double timeInYears, double annualRate) throws Exception {
		if(principalAmount < 0 || timeInYears < 0 || annualRate < 0)
			throw new Exception("Any of the principalAmount, timeInYears, annualRate values can't be negative");
		double result = Math.floor(principalAmount*Math.pow(1+(annualRate/100.00), timeInYears));
		result -= principalAmount;
		return result;
	}
}
