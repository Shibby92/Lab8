
public class Time {

	public static void main(String[] args) {
		int hr1,hr2,min1,min2,sec1,sec2,hr,min,sec;
		hr1= TextIO.getInt();
		min1= TextIO.getInt();
		sec1= TextIO.getInt();
		hr2= TextIO.getInt();
		min2= TextIO.getInt();
		sec2= TextIO.getInt();
		hr=hr1-hr2;
		min=min1-min2;
		sec=sec1-sec2;
		if(sec<0){
			if(min==0){
				hr-=1;
				min+=60;
				sec+=60;
				min-=1;
			}
			else{
			sec+=60;
			min-=1;
			}
	}
		if (min<0){
			hr-=1;
			min+=60;
		}
		
		System.out.printf("Razlika izmedju vremena je %d sati, %d minute, %d sekundi",hr,min,sec);
	}
}
