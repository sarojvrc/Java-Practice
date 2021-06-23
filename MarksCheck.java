package practice;

public class MarksCheck {
	public static void main(String args[]) {
		int math = 84;
		int mil = 59;
		int chem = 84;
		int phy = 49;
		
		int total = math + mil + chem + phy;
		float avg = total/4;
		
		if(avg >= 60) {
			System.out.println("Your avg is "+ avg + " You have got First Class! Cheers!!");
		}else if(avg >= 45 && avg < 60) {
			System.out.println("Your avg is "+ avg + " You have got Second Class");
		} else if(avg >= 30 && avg < 45) {
			System.out.println("Your avg is "+ avg + " You have got Third Class");
		} else {
			System.out.println("Your avg is "+ avg + " Sorry, you are Fail. Work hard and study");
		}
	}
}
