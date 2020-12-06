package sample;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=70;
char grade='F';

switch(marks){
	case 80: {
	grade='B';
	}
	break;
	
	case 70:
	{
		grade='C';
		
	}
	default:
		System.out.println("invalid");
}
System.out.println(grade);

	}

}
