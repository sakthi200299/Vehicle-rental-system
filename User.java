public class User {
	 static String email;
     static String password;
     static String role;
     public User(String email,String password,String role)
     {
    	 this.email=email;
    	 this.password=password;
    	 this.role=role;
     }
     public User() {}
     public String getemail()
     {
    	 return email; 
     }
     public void setemail(String email)
     {
    	 this.email=email;
     }
     private String getpassword()
     {
    	 return password; 
     }
     private void setpassword(String password)
     {
    	 this.password=password;
     }
     public String getrole()
     {
    	 return role; 
     }
     public void setrole(String role)
     {
    	 this.role=role;
     }
    
}
