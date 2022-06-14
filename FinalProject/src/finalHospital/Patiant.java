package finalHospital;

import java.util.Scanner;

public class Patiant extends Human{
	
	Patiant()
	{
	
		
		
	}
	
	
	Patiant(String name, String bloodType, int age, int wight,
			int hight, int roomNum, int roomFloor, String degree)
	{
		
	}
	
	

	private int roomNum;
	private int roomFloor;
	private String degree;
	
	
	

	public int getRoomNum() {
		return roomNum;
	}


	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}


	public int getRoomFloor() {
		return roomFloor;
	}


	public void setRoomFloor(int roomFloor) {
		this.roomFloor = roomFloor;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}

	static void checkIn(String _patiant, int _room) {
		System.out.println("Patiant " + _patiant + " checked in room " + _room);
	}
	
	static void checkOut(String _patiant, int _room) {
		System.out.println("Patiant " + _patiant + " checked out from room " + _room);
	}

	
	
	
	
	
	
	
	
	
	
}
