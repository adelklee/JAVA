class CurrencyConverter {
	private static double rate;
	private static double won;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
	public static void setWon(double w) {
		won = w;
	}
}
