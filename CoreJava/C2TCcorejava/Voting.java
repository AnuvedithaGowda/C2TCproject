package C2TCcorejava;

public class Voting {

	public static void main(String[] args) {
      int age=18;
      int minorAge=12;
      int majorAge=67;
      if(minorAge>age && majorAge>age)
      {
    	  System.out.println("Eligible");
      }
      else
      {
    	  System.out.println("Not Eligible");
      }
	}

}
