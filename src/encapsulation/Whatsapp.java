package encapsulation;

public class Whatsapp {

	private long mobileno;
	private String pwd;
	
	Whatsapp()
	{
		
	}

	
	public long getMobileno()
	{
		return mobileno;
	}
	
	public void setMobileno(long mobileno)
	{
		this.mobileno = mobileno;
	}
	
	public  String getPwd()
	{
		return pwd;
	}
	
	public  void setPwd(String pwd)
	{
		this.pwd = pwd;
	}
	
	public void whaappDetails()
	{
		
		System.out.println(mobileno);
		System.out.println(pwd);
	}
	
	
	
}
