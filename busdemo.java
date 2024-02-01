package busbooking;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {


	public static void main(String args[]) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2,"Ram","Trichy","Chennai","9249010101"));
		buses.add(new Bus(2,false,1,"Shiva","Bangalore","Bangalore","6793922905"));
		int opt=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses) {
			b.displaybuinfo();
		}
		while(opt==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		
		opt=sc.nextInt();
		if(opt==1) {
			Booking booking=new Booking();
			if(booking.isavailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your Booking successful");
				
			}
			else {
				System.out.println("Sorry Please select another date or bus!!!");
			}
		}
		
		}
		
		
	}
}
