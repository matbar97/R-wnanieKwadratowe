
public class RównanieKwadratowe 
{
	private double a,b,c;
	
	public RównanieKwadratowe()
	{
		this(1.0,1.0,1.0);
	}
	
	public RównanieKwadratowe(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String rozwiąż()
	{
		String rozwiązanie = "";
		double delta;
		delta = b*b-4*a*c;
		if(delta > 0)
		{
			double x1 = (-b - Math.sqrt(delta))/2*a;
			double x2 = (-b + Math.sqrt(delta))/2*a;
			rozwiązanie = "Równanie posiada dwa pierwiastki: x1 = " + x1 + " x2 = " + x2;
		}
		else if (delta == 0)
		{
			double x0 = (-b/2*a);
			rozwiązanie = "Równanie posiada jeden pierwiastek: x0 = " + x0;
		}
		else
		{
			rozwiązanie = "Brak pierwiastków rzeczywistych";
		}
		return rozwiązanie;
	}

	@Override
	public String toString() {
		return "RównanieKwadratowe [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) 
	{
		RównanieKwadratowe równanie = new RównanieKwadratowe(1,3,2);
		System.out.println(równanie.toString());
		System.out.println(równanie.rozwiąż());
	}

}
