package money;

public class Account {
	String account_holder_name,account_phone_number,pin;
	int balance=5000;
	Account(String name,String phone,String pin)
	{
		this.account_holder_name=name;
		this.account_phone_number=phone;
		this.pin=pin;
	}
	Account(String name,String phone)
	{
		this.account_holder_name=name;
		this.account_phone_number=phone;
		this.pin="\0";
	}
	public boolean pin_update(String old_pin,String new_pin)
	{
		if(this.pin=="\0")
		{
			this.pin=new_pin;
			System.out.println("Here is new pin:"+pin_print());
			return true;
		}
		else if(old_pin==this.pin)
		{
			this.pin=new_pin;
			System.out.println("Pin is updated"+pin_print());
			return true;
		}
		else
		{
			System.out.println("Old pin does not match"+pin_print());
			return false;
		}
	}
	String pin_print()
	{
		String new_pin_info=getAccount_holder_name()+": "+"Pin: "+this.pin;
		return new_pin_info;
	}
	void add_money(int amount)
	{
		this.balance+=amount;
		System.out.println("Add money: "+amount+" "+account_holder_name);
	}
	void cash_out(int amount,String pin)
	{
		if(pin!=this.pin)
		{
			System.out.println("Pin does not match");
		}
		else if(pin==this.pin&& pin=="\0")
		{
			System.out.println("Pin is not initialized");
		}
		else
		{
			if(balance>=amount)
			{
				balance-=amount;
				System.out.println("Cash out: "+amount+" "+account_holder_name);
			}
			else
			{
				System.out.println("You do not have enough balance");
			}
		}
	}
	public String toString()
	{
		return "Account:{" + "Account holder name: "+account_holder_name+"Account phone number: "+account_phone_number+"Balance: "+balance+"}";
	}
	public String getAccount_holder_name()
	{
		return this.account_holder_name;
	}
	public String getAccount_phone_number()
	{
		return this.account_phone_number;
	}
	public int getbalance()
	{
		return this.balance;
	}
	

}
