public class Adminmenu {
	 public static int maxvehicle=100;
     public static String[] vehiclename=new String[maxvehicle];
     public static String[] vehicleplate=new String[maxvehicle];
     public static String[] vehicletype=new String[maxvehicle];
     static int vehiclecount=0;
     static Vehicle vehicle=new Vehicle();
    public static void admindetail()
	{
		while(true)
        {
       	 System.out.println("ADMIN MENU");
       	 System.out.println("1: ADD VEHICLE");
       	 System.out.println("2: MODIFY VEHICLE");
       	 System.out.println("3: DELETE VEHICLE");
       	 System.out.println("4: RETURN TO MAIN MENU");
       	 System.out.println("ENTER A CHOICE FOR VEHICLE");
       	 int choice1=Vehiclerentalsystem.sc.nextInt();
       	 if(choice1==1)
       	 {
       		 addvehicle();
       	 }
       	 else if(choice1==2)
       	 {
       		modifyvehicle(); 
       	 }
       	 else if(choice1==3)
       	 {
       		deletevehicle();
       	 }
    	 else if(choice1==4)
       	 {
       		return;
       	 }
       	 else 
       	 {
       	 System.out.println("INVALID CHOICE ENTERED");
       	 }
        }
	}	
	public static void addvehicle()
	{
		System.out.println("ADD VEHICLE");
		System.out.println("ENTER VEHICLE NAME");
		 vehicle.vehiclenames=Vehiclerentalsystem.sc.next();
		System.out.println("ENTER VEHICLE NUMBER PLATE");
	     vehicle.numberplate=Vehiclerentalsystem.sc.next();
	     System.out.println("ENTER VEHICLE TYPE");
	     vehicle.vehicletypes=Vehiclerentalsystem.sc.next();
	     System.out.println("ENTER A AVAILABLECOUNT FOR VEHICLE");
	     int availablecount=Vehiclerentalsystem.sc.nextInt();
		vehiclename[vehiclecount]=vehicle.vehiclenames;
		vehicleplate[vehiclecount]=vehicle.numberplate;
		vehicletype[vehiclecount]=vehicle.vehicletypes;
		Catalogue.availablecounts[vehiclecount]=availablecount;
		vehiclecount++;
		System.out.println("VEHICLE ADDED COMPLETE");
	}
	public static void modifyvehicle()
	{
		System.out.println("MODITFY VEHICLE");
		System.out.println("ENTER A VEHICLE PLATE TO MODITFY");
		String platetoModity=Vehiclerentalsystem.sc.next();
		int indextomodify=findtomodifyvehicle(platetoModity);
		if(indextomodify!=-1)
		{
			System.out.println("CURRENT VEHICLE DETAIL:");
			System.out.println("VEHICLE NAME "+vehiclename[indextomodify]);
			System.out.println("VEHICLE PLATE "+vehicleplate[indextomodify]);
			System.out.println("VEHICLE TYPE "+vehicletype[indextomodify]);
			System.out.println("ENTER A NEW DETAIL:");
			System.out.println("ENTER A NEW VEHICLENAME");
			String newvehiclename=Vehiclerentalsystem.sc.next();
			System.out.println("ENTER A NEW VEHICLE NUMBER PLATE");
			String newvehicleplate=Vehiclerentalsystem.sc.next();
			System.out.println("ENTER A NEW VEHICLE NUMBER TYPE");
			String newvehicletypes=Vehiclerentalsystem.sc.next();
			System.out.println("ENTER A AVAILABLECOUNT FOR VEHICLE");
		    int newavailablecount=Vehiclerentalsystem.sc.nextInt();
			vehiclename[indextomodify]=newvehiclename;
			vehicleplate[indextomodify]=newvehicleplate;
			vehicletype[indextomodify]=newvehicletypes;
			Catalogue.availablecounts[indextomodify]=newavailablecount;
			System.out.println("VEHICLE MODIFY COMPLETE");
		}
		else
		{
			System.out.print("VEHICLE NOT FOUND");
		}
	}
	private static int findtomodifyvehicle(String platetoModity)
	{
		for(int i=0;i<vehiclecount;i++)
		{
			if(vehicleplate[i]!=null && vehicleplate[i].equals(platetoModity))
			{
				return i;
			}
		}
		return -1;
	}
	public static void deletevehicle()
	{
		System.out.println("DELETE VEHICLE");
		System.out.println("ENTER VEHICLE PLATE TO DELETE");
		String platetodelete=Vehiclerentalsystem.sc.next();
		int indextodelete=findtodeletevehicle(platetodelete);
		if(indextodelete!=-1)
		{
	       for(int i=indextodelete;i<vehiclecount-1;i++)
	       {
			vehiclename[i]=vehiclename[i+1];
			vehicleplate[i]=vehicleplate[i+1];
			vehicletype[i]=vehicletype[i+1];
			Catalogue.availablecounts[i]=Catalogue.availablecounts[i+1];
	       }
	       vehiclename[vehiclecount-1]=null;
	       vehicleplate[vehiclecount-1]=null;
	       vehicletype[vehiclecount-1]=null;
	   	   Catalogue.availablecounts[vehiclecount-1]=0;
	       vehiclecount--;
			System.out.println("VEHICLE DELETE COMPLETE");
		}
		else
		{
			System.out.print("VEHICLE NOT FOUND");
		}
	}
	private static int findtodeletevehicle(String platetodelete)
	{
		for(int i=0;i<vehiclecount;i++)
		{
			if(vehicleplate[i]!=null && vehicleplate[i].equals(platetodelete))
			{
				return i;
			}
		}
		return -1;
	}
}