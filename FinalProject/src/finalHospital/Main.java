package finalHospital;

import java.util.Scanner;

import finalHospital.Patiant;

public class Main {

	public static void main(String[] args) {
		
		Patiant patiant1 = new Patiant();
		reseption(patiant1);
		System.out.println(patiant1.getName());
		Patiant patiant2 = new Patiant();
		reseption(patiant2);
		System.out.println(patiant2.getName());
		
		
		
		
	}
		
		
		
	public static void reseption(Patiant patiant1) {	
		
	
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter patiant name : ");
		patiant1.setName(scan1.next());
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter patiant age : ");
		patiant1.setAge(scan2.nextInt());
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter patiant bloodtype : ");
		patiant1.setBloodType(scan3.next());
		
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Enter patiant wight : ");
		patiant1.setWight(scan4.nextInt());
		
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Enter patiant hight : ");
		patiant1.setHight(scan5.nextInt());
		
		Scanner scan6 = new Scanner(System.in);
		System.out.println("Enter patiant room number : ");
		patiant1.setRoomNum(scan6.nextInt());
		
		Scanner scan7 = new Scanner(System.in);
		System.out.println("Enter patiant room floor : ");
		patiant1.setRoomFloor(scan7.nextInt());
		
		Scanner scan8 = new Scanner(System.in);
		System.out.println("Enter patiant degree : ");
		patiant1.setDegree(scan8.next());
		
		
		Patiant.checkIn(patiant1.getName(), patiant1.getRoomNum());
		
		
	
	}

}
