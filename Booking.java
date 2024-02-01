package busbooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passenger;
	int busno;
	Date date;
	Booking(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the passenger: ");
		String passenger=sc.next();
		System.out.println("Enter bus no: ");
		int busno=sc.nextInt();
		System.out.println("Enter the date dd-mm-yyyy");
		String dateinp=sc.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateinp);//string to date format
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isavailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getbusno()== busno) {
				capacity=bus.getcapacity();
			}
			int booked=0;
			for(Booking b:bookings) {
				if(b.busno==busno && b.date.equals(date)) {
					booked++;
					return booked<capacity?true:false;
				
				}
			}
			
		}
		return true;
		
	}

}
