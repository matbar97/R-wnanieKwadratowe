
public class R�wnanieKwadratowe 
{
	private double a,b,c;
	
	public R�wnanieKwadratowe()
	{
		this(1.0,1.0,1.0);
	}
	
	public R�wnanieKwadratowe(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String rozwi��()
	{
		String rozwi�zanie = "";
		double delta;
		delta = b*b-4*a*c;
		if(delta > 0)
		{
			double x1 = (-b - Math.sqrt(delta))/2*a;
			double x2 = (-b + Math.sqrt(delta))/2*a;
			rozwi�zanie = "R�wnanie posiada dwa pierwiastki: x1 = " + x1 + " x2 = " + x2;
		}
		else if (delta == 0)
		{
			double x0 = (-b/2*a);
			rozwi�zanie = "R�wnanie posiada jeden pierwiastek: x0 = " + x0;
		}
		else
		{
			rozwi�zanie = "Brak pierwiastk�w rzeczywistych";
		}
		return rozwi�zanie;
	}

	@Override
	public String toString() {
		return "R�wnanieKwadratowe [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) 
	{
		R�wnanieKwadratowe r�wnanie = new R�wnanieKwadratowe(1,3,2);
		System.out.println(r�wnanie.toString());
		System.out.println(r�wnanie.rozwi��());
	}

}
