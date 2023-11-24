import java.util.Scanner;
public class Vehiclerentalsystem {
	 static Scanner sc=new Scanner(System.in);
	 static int choice;
     public  static int maxuser=100;
     public static String[] useremail=new String[maxuser];
     public static String[] userpassword=new String[maxuser];
     public static String[] userrole=new String[maxuser];
     static User user=new User();
     static int usercount=0;
     static Adminmenu admin=new Adminmenu();
     static Borrower borrower=new Borrower();
	 Catalogue vehicleCatalogue = new Catalogue();
	   public static void signup()
	     {
	    	 System.out.println("ENTER YOUR EMAIL:");
	    	  user.email=sc.next();
	    	 System.out.println("ENTER YOUR PASSWORD");
	    	 user.password=sc.next();
	    	 useremail[usercount]=user.email;
	    	 userpassword[usercount]=user.password;
	    	 System.out.println("ARE YOU AN ADMIN OR A BORROWER? (A/B):");
	    	 user.role=sc.next();
	    	 if(user.role.equalsIgnoreCase("A"))
	    	 {
	    		 userrole[usercount]="ADMIN";
	    	 }
	    	 else if(user.role.equalsIgnoreCase("B"))
	    	 {
	    		 userrole[usercount]="BORROWER";
	    	 }
	    	 else
	    	 {
	    		 System.out.println("INVALID ROLE");
	    		 return;
	    	 }
	    	 usercount++;
	    	 System.out.println("COMPLETE");
	     }
	     public static void login()
	     {
	    	 System.out.println("ENTER YOUR EMAIL:");
	    	 user.email=sc.next();
	    	 System.out.println("ENTER YOUR PASSWORD");
	       	 user.password=sc.next();
	    	 System.out.println("ARE YOU AN ADMIN OR A BORROWER? (A/B):");
	    	 int userindex=findUser(user.email,user.password);
	    	 if(userindex!=-1)
	    	 {
	    		 user.role =userrole[userindex];
	    		 if(user.role.equals("ADMIN"))
	    		 {
	    			 admin.admindetail();
	    		 }
	    		 else if(user.role.equals("BORROWER"))
	    		 {
	    			 borrower.borrowerdetail();
	    		 }
	    		 else
	    		 {
	    			 System.out.println("INVALID ROLE");
	    		 }
	    	 }
	    	
	     }
	     private static int findUser(String email,String password)
	     {
	    	 for(int i=0;i<usercount;i++)
	    	 {
	    		 if(useremail[i]!=null && userpassword[i]!=null && useremail[i].equals(email) && userpassword[i].equals(password)) {
	    			 return i;
	    		 }
	    	 }
	    	 return -1;
	     }
	     public static void displaydetails()
	     {
	    	 System.out.println("DETAILS OF VEHICLE");
	    	 for(int i=0;i<Adminmenu.vehiclecount;i++)
	    	 {
	    		System.out.println("VEHICLE NAME:    "+Adminmenu.vehiclename[i]);
	    		System.out.println("VEHICLE PLATE:   "+Adminmenu.vehicleplate[i]);
	    		System.out.println("VEHICLE TYPE:    "+Adminmenu.vehicletype[i]);
	    		System.out.println("AVAILABLECOUNTS: "+Catalogue.availablecounts[i]);
	    	 }
	     }

	     public static void usermenu()
	     {
	    	 while(true)
	         {
	        	 System.out.println("Vehicle Rental System");
	        	 System.out.println("1: Sign Up");
	        	 System.out.println("2: Login");
	        	 System.out.println("3: display details");
	        	 System.out.println("Enter a Choice");
	        	 choice=sc.nextInt();
	        	 if(choice==1)
	        	 {
	        		signup();
	        	 }
	        	 else if(choice==2)
	        	 {
	        		login();
	        	 }
	        	 else if(choice==3)
	        	 {
	        	    displaydetails();
	        	    System.exit(0);
	        	 }
	        	 else {
	        	 System.out.println("INVALID CHOICE ENTERED");
	        	 }
	         }
	     }
	  }
