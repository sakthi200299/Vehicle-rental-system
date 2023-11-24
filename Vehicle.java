public class Vehicle {
     static String vehiclenames;
     static String numberplate;
     static String vehicletypes;
     public Vehicle(String vehiclename1,String numberplate,String vehicletypes)
     {
    	this.vehiclenames=vehiclenames;
    	this.numberplate=numberplate;
    	this.vehicletypes=vehicletypes;
     }
     public Vehicle() {}
     public String getvehiclename()
     {
    	 return vehiclenames;
     }
     public void setvehiclename(String vehiclenames)
     {
    	 this.vehiclenames=vehiclenames;
     }
     public String getnumberplate()
     {
    	 return numberplate;
     }
     public void setnumberplate(String numberplate)
     {
    	 this.numberplate=numberplate;
     }
     public String getnumbertypes()
     {
    	 return vehicletypes;
     }
     public void setnumbertypes(String vehicletypes)
     {
    	 this.vehicletypes=vehicletypes;
     }
    
     
}
