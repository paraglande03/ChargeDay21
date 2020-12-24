public class Charge
	{
		private final double x,y,z;
		private  Charge(double c1,double c2,double c3)
			{
				x=c1;
				y=c2;
				z=c3;
			}
			public double potential(double rx,double ry)
			{
				double kx=1.23;
				double x1=rx-x;
				double x2=ry-y;
				return kx*x1*x2;
			}


		public static void main(String[] args)
			{

			double x=Double.parseDouble(args[0]);
			double y=Double.parseDouble(args[1]);

			Charge charge1=new Charge(1.2,2.3,4.5);
			double result=charge1.potential(x,y);

			System.out.println("Result is:"+result);

			}

	}

