
public class Boat {

	public static void main(String[] args) {
		double dist,time,v;
		int speed;
		speed= TextIO.getInt();
		time=TextIO.getDouble();
		v=speed*1.609;
		dist=v*time;
		System.out.println(dist);		
	}

}