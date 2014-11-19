
public class Pravougli {
	public static void main(String[] args) {
		int a,b,c;
		a= TextIO.getInt();
		b=TextIO.getInt();
		c=TextIO.getInt();
		int test=a*a+b*b;
		if( test==c*c)
			System.out.println("To moze biti pravougli trougao!");
		else
			System.out.println("To NE moze biti pravougli trougao!");
	}

}
