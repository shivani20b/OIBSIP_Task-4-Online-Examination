import java.util.*;
public class Quiz {

Scanner sc = new Scanner(System.in);
HashMap<String,Integer> data = new HashMap<String,Integer>();

	public void login() {
		data.put("SHIVANI",1101);
		data.put("SHIVANi",1011);
		System.out.println("\n\n**********WELCOME TO ONLINE EXAM SYSTEM*****************");
		String UserId;
		int password;
		System.out.println("CONTINUE TO LOGIN");
		System.out.print("Enter UserId : ");
		UserId = sc.next();
		System.out.print("Enter password : ");
		password = sc.nextInt();
		if(data.containsKey(UserId) && data.get(UserId)==password) {
			System.out.println("\nSUCCESSFULLY LOGIN");
				option_menu();
		}
		else {
			System.out.println(" OOPS INVALID LOGIN ");
			System.out.println("Try Again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("\nEnter the Option you want to Perform Operation");
		System.out.println("1.Update Profile and Password");
		System.out.println("2.Start  Exam");
		System.out.println("3.Logout");
		select = sc.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam_que();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Entry");
		}
	}
	public HashMap<String,Integer> update(){
		String uUser;
		int upassword;
		System.out.println("Welcome to Update Profile");
		System.out.println("Enter Username");
		uUser = sc.next();
		if(data.containsKey(uUser)) {
		System.out.println("Enter new Password you to want to Update to your Profile");
		upassword = sc.nextInt();
		data.replace(uUser, upassword);
		}
		else {
			System.out.println("User Doesn't Exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int ans_count=0;
	int ans,score;
	System.out.println("Start Your Exam");

	
//Question starts
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each Question carries 10 marks"+" "+"-2 for wrong answer");
		System.out.println("\n\nQ.1) Java Source Code is compiled into ______________.?");
		System.out.println("\n(1) .Obj"+"\t"+"(2) Source Code"+"\t"+"(3) Bytecode"+"\t"+"(4) .Exe");
		System.out.println("Enter Correct Option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==3) {
			ans_count++;
		}
		System.out.println("\n\nQ.2)What allows the programmer to destroy an object x?");
		System.out.println("1)x.finalize()"+"\t"+"2) x.delete()"+"\t"+"3) Runtime.getRuntime().gc()"+"\t"+"4)Only the garbage collection system can destroy an object.");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==4) {
			ans_count++;
		}
		System.out.println("\n\nQ.3)An applet is a Java class that extends the?");
		System.out.println("1) java.applet.Applet class"+"\t"+"(2) java class"+"\t"+"3)Applet class"+"\t"+"4)java.Applet class");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		System.out.println("\n\nQ.4)Equal amounts of each Rs. 43,892 is lend to two persons for 3 years."+"\n"+" One at the rate of 30% S.I. and second at the rate of 30% C.I. annually. "+"\n"+"By how much percent the C.I. is greater than the simple interest received in this 3 years duration?");
		System.out.println("1) 0.31"+"\t"+"2) 0.32"+"\t"+"3) 0.33"+"\t"+"4)0.34");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==3) {
			ans_count++;
		}
		System.out.println("\n\nQ.5)A boat takes 27 hrs to travel a distance upstream and takes 9hrs to travel the same distance downstream."+"\n"+" If the speed of the boat in still water is 12km/hr, then what is the velocity of the stream?");
		System.out.println("1)  4km/hr"+"\t"+"2) 6km/hr"+"\t"+"3) 8km/hr"+"\t"+"4) 10km/hr");
		System.out.println("Enter correct option");
		ans=sc.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=ans_count*10-((5-ans_count)*5); 
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Quiz log =new Quiz();
		log.login(); 
}
} 