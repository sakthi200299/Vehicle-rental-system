
public class VehicleRentalDriver {
	

	public static void main(String[] args) {
		Vehiclerentalsystem Rentalsystem=new Vehiclerentalsystem();
		Rentalsystem.usermenu();
		Adminmenu Adminrental=new Adminmenu();
		Adminrental.admindetail();
		Borrower borrower=new Borrower();
		borrower.borrowerdetail();
		Rentalsystem.displaydetails();
	}
}
