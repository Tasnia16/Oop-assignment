package money;

public class Bank {
	public void start_banking()
	{
		String Rashed_pin="\0";
		String Esha_pin="1234";
		Account Rashed=new Account("Rashed Islam","01973742634");
		Account Esha=new Account("Tasnia Esha","01937471298",Esha_pin);
		System.out.println("Information and initial balance:"+Rashed);
		System.out.println("Information and initial balance:"+Esha);
		Rashed.add_money(2000);
		Esha.add_money(1000);
		Rashed.cash_out(300,Rashed_pin);
		Esha.cash_out(500,Esha_pin);
		Rashed_pin=Rashed.pin_update(Rashed_pin,"5678")?"5678":Rashed_pin;
		Rashed.cash_out(500,Rashed_pin);
		Esha.cash_out(1000,Esha_pin);
		Rashed.cash_out(400,Esha_pin);
		
		
		System.out.println("Name: "+Rashed.getAccount_holder_name()+";"+"Phone: "+Rashed.getAccount_phone_number()+";"+"Balance: "+Rashed.getbalance());
		System.out.println("Name: "+Esha.getAccount_holder_name()+";"+"Phone: "+Esha.getAccount_phone_number()+";"+"Balance: "+Esha.getbalance());
		
	}

}
