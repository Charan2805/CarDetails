import Honda.*;
import Hyundai.*;
import Tata.*;
import Maruti.*;
import Maruti.Customer_Details;

public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda.Car_Details hc = new Honda.Car_Details();
Honda.Customer_Details hcu= new Honda.Customer_Details();
Hyundai.Car_Details hyc= new Hyundai.Car_Details();
Hyundai.Customer_Details hycu=new Hyundai.Customer_Details();
Tata.Car_Details tc = new Tata.Car_Details();
Tata.Customer_details tcu= new Tata.Customer_details();
Maruti.Car_Details mc=new Maruti.Car_Details();
Maruti.Customer_Details mcu=new Maruti.Customer_Details();

// setters for car details
hc.setCar_colour("black");
hc.setCar_name("Honda-City");
hc.setChassis_num("10000001");
hc.setCustomer_id("1001");
hc.setDate_of_mfg("march-2023");

hyc.setCar_colour("white");
hyc.setCar_name("Santro");
hyc.setChassis_num("10000002");
hyc.setCustomer_id("1002");
hyc.setDate_of_mfg("march-2023");

tc.setCar_colour("metallic grey");
tc.setCar_name("Safari");
tc.setChassis_num("10000003");
tc.setCustomer_id("1003");
tc.setDate_of_mfg("march-2023");

mc.setCar_colour("Ocean Blue");
mc.setCar_name("Brezza");
mc.setChassis_num("10000004");
mc.setCustomer_id("1004");
mc.setDate_of_mfg("march-2023");
	
// setters for customer details

hcu.setCust_address("karimnagar");
hcu.setCust_id(1001);
hcu.setCust_mobile_num(9900887766l);
hcu.setCust_name("Sravan");
hcu.setRemarks("Delivered");


hycu.setCust_address("Rompikunta");
hycu.setCust_id(1002);
hycu.setCust_mobile_num(9911223344l);
hycu.setCust_name("Sai Charan");
hycu.setRemarks("Delivered");

tcu.setCust_address("Peddapalli");
tcu.setCust_id(1003);
tcu.setCust_mobile_num(9922334455l);
tcu.setCust_name("Sriraj");
tcu.setRemarks("Pending");

mcu.setCust_address("Pusala");
mcu.setCust_id(1004);
mcu.setCust_mobile_num(9900887766l);
mcu.setCust_name("Tharun");
mcu.setRemarks("Not-Delivered");
// getters
System.out.println("Honda details are ");
System.out.println("*******************");
System.out.println("Customer Name : "+hcu.getCust_name());
System.out.println("ustomer id : "+hcu.getCust_id());
System.out.println("Car name : "+hc.getCar_name());
System.out.println("Car Colour : "+hc.getCar_colour());
System.out.println("Chassis Number : "+hc.getChassis_num());
System.out.println("Manufactured Date : "+hc.getDate_of_mfg());
System.out.println("Customer Adress : "+hcu.getCust_address());
System.out.println("Mobile Number : "+hcu.getCust_mobile_num());
System.out.println("Status : "+hcu.getRemarks());
System.out.println(" ");

System.out.println("maruti details are ");
System.out.println("*******************");
System.out.println("Customer Name : "+mcu.getCust_name());
System.out.println("ustomer id : "+mcu.getCust_id());
System.out.println("Car name : "+mc.getCar_name());
System.out.println("Car Colour : "+mc.getCar_colour());
System.out.println("Chassis Number : "+mc.getChassis_num());
System.out.println("Manufactured Date : "+mc.getDate_of_mfg());
System.out.println("Customer Adress : "+mcu.getCust_address());
System.out.println("Mobile Number : "+hcu.getCust_mobile_num());
System.out.println("Status : "+hcu.getRemarks());
System.out.println(" ");

System.out.println("Hyundai details are ");
System.out.println("*******************");
System.out.println("Customer Name : "+hycu.getCust_name());
System.out.println("ustomer id : "+hycu.getCust_id());
System.out.println("Car name : "+hyc.getCar_name());
System.out.println("Car Colour : "+hyc.getCar_colour());
System.out.println("Chassis Number : "+hyc.getChassis_num());
System.out.println("Manufactured Date : "+hyc.getDate_of_mfg());
System.out.println("Customer Adress : "+hycu.getCust_address());
System.out.println("Mobile Number : "+hycu.getCust_mobile_num());
System.out.println("Status : "+hycu.getRemarks());
System.out.println(" ");

System.out.println("Tata details are ");
System.out.println("*******************");
System.out.println("Customer Name : "+tcu.getCust_name());
System.out.println("ustomer id : "+tcu.getCust_id());
System.out.println("Car name : "+tc.getCar_name());
System.out.println("Car Colour : "+tc.getCar_colour());
System.out.println("Chassis Number : "+tc.getChassis_num());
System.out.println("Manufactured Date : "+tc.getDate_of_mfg());
System.out.println("Customer Adress : "+tcu.getCust_address());
System.out.println("Mobile Number : "+tcu.getCust_mobile_num());
System.out.println("Status : "+tcu.getRemarks());
System.out.println(" ");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
