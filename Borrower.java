public class Borrower {
	
	   public static void borrowerdetail()
		{
			while(true)
	        {
	       	 System.out.println("BORROWER MENU");
	       	 System.out.println("1: RENT TO VEHICLE");
	       	 System.out.println("2: RETURN TO VEHICLE");
	       	 System.out.println("3: RETURN TO MAIN MENU");
	       	 System.out.println("ENTER A CHOICE FOR VEHICLE");
	       	 int choice2=Vehiclerentalsystem.sc.nextInt();
	       	 if(choice2==1)
	       	 {
	       		 rentvehicle();
	       	 }
	       	 else if(choice2==2)
	       	 {
	       		returnvehicle(); 
	       	 }
	       	 else if(choice2==3)
	       	 {
	       		return;
	       	 }
	       	 else
	       	 {
	       	 System.out.println("INVALID CHOICE ENTERED");
	       	 }
	        }
		}
	   public static void rentvehicle() 
	   {
		   System.out.println("RENT VEHICLE");
		   System.out.println("ENTER THE NAME OF THE VEHICLE TO RENT");
		   String nametorent=Vehiclerentalsystem.sc.next();
		   int indextorent=findvehiclerent(nametorent);
		   if(indextorent!=1)
		   {
			   if(Catalogue.availablecounts[indextorent]>0)
			   {
				   Catalogue.availablecounts[indextorent]--;
				   System.out.println("VEHICLE RENTED COMPLETE");
			   }
			   else
			   {
				   System.out.println("VEHICLE IS NOT AVAILABLE FOR RENT");
			   }
		   }
		   else
		   {
			   System.out.println("VEHICLE NOT FOUND");
		   }
		   
	   }
	   private static int findvehiclerent(String nametorent)
	   {
		   for(int i=0;i<Adminmenu.vehiclecount;i++)
		   {
			   if(Adminmenu.vehiclename[i]!=null && Adminmenu.vehiclename[i].equals(nametorent))
			   {
				 return i;   
			   }
		   }
		   return -1;
	   }
	   public static void returnvehicle()
	   {
		   System.out.println("RETURN VEHICLE");
		   System.out.println("ENTER THE NAME OF THE VEHICLE TO RETURN");
		   String nametoreturn=Vehiclerentalsystem.sc.next();
		   int indextoreturn=findvehiclerent(nametoreturn);
		   if(indextoreturn!=1)
		   {
			   if(Catalogue.availablecounts[indextoreturn]>0)
			   {
				   Catalogue.availablecounts[indextoreturn]++;
				   System.out.println("VEHICLE RETURN COMPLETE");
			   }
			   else
			   {
				   System.out.println("VEHICLE IS NOT AVAILABLE FOR RETURN");
			   }
		   }
		   else
		   {
			   System.out.println("VEHICLE NOT FOUND");
		   }
		   
	   }
	   private static int findvehiclereturn(String nametoreturn)
	   {
		   for(int i=0;i<Adminmenu.vehiclecount;i++)
		   {
			   if(Adminmenu.vehiclename[i]!=null && Adminmenu.vehiclename[i].equals(nametoreturn))
			   {
				 return i;   
			   }
		   }
		   return -1;
	   }   
	   

}
