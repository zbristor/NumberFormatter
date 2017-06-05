import java.text.NumberFormat;
public class NumberFormatter {
public NumberFormatter()
{
	
}
public static String CurrencyFormat(double price)
{
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String priceString = currency.format(price); //returns $11.58
	return priceString;
}
public static String PercentFormat(double majority)
{
	NumberFormat percent = NumberFormat.getPercentInstance();
	String majorityString = percent.format(majority); //returns 50%
	return majorityString;
}
public static String DecimalFormat(double miles)
{
	NumberFormat number = NumberFormat.getNumberInstance();
	number.setMaximumFractionDigits(2);
	String milesString = number.format(miles);
	return milesString;
}
public static double randomGen(double max, double min)
{
	double rand = Math.random() * (max-min)+min;
	return rand;
}
public static double max(double x, double y)
{
	double z = Math.max(x,y);
	return z;
}
public static double min(double x, double y)
{
	double z = Math.min(x, y);
	return z;
}
}
