package calculatortype;

class Calculator {
	public int PowerInt(int base, int exponent) {
		int intresult =(int)( Math.pow(base, exponent));
		return intresult;
		
	}
	public int PowerDouble(double base, int exponent) {
		int doubleresult = (int)Math.pow(base, exponent);
		return doubleresult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int intresult = calc.PowerInt(10, 5);	
		int doubleresult =calc.PowerDouble(10.5, 2);
		System.out.println("Power of int:" + intresult);
		System.out.println("Power of double:" + doubleresult);

	}

}


