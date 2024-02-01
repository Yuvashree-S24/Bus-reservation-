package busbooking;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	private String name;
	private String from;
	private String to;
	private String phone;
	
	Bus(int no,boolean acc,int cap,String driver,String start, String end,String numb){
		this.busno=no;
		this.ac=acc;
		this.capacity=cap;
		this.name=driver;
		this.from=start;
		this.to=end;
		this.phone=numb;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String no) {
		phone=no;
	}
	public String getfrom() {
		return from;
	}
	public void setfrom(String f) {
		from=f;
	}
	public String getto() {
		return to;
	}
	public void setto(String t) {
		to=t;
	}
	
	public String getname() {//get is accessor
		return name;
	}
	public void  setname(String n) {//set is a mutator
		name=n;
	}

	public int getcapacity() {
		return capacity;
		
	}
	
	public void setcapacity(int cap) {
	 capacity=cap;
	}
	public int getbusno() {
		return busno;
	}
	public boolean isac() {
		return ac;
	}
	public boolean setac(boolean val) {
		return ac=val;
		
	}

	public void displaybuinfo(){
		System.out.println("Busno: " + busno+ "\nAc: " + ac + "\nTotal Capacity: "+capacity + "\nDriver name: "+name +"\nFrom: "+from +"\nTo: "+to + "\nDriver Number: "+phone);
		
	}
	
	
}
