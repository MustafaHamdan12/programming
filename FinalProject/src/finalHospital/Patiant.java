package finalHospital;

import java.util.Scanner;

public class Patiant {
	
	Patiant()
	{
	
		
		
	}
	
	
	Patiant(String name, String bloodType, int age, int wight,
			int hight, int roomNum, int roomFloor, String degree)
	{
		
	}
	
	
	private String name;
	private String bloodType;
	private int age;
	private int wight;
	private int hight;
	private int roomNum;
	private int roomFloor;
	private String degree;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBloodType() {
		return bloodType;
	}


	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWight() {
		return wight;
	}


	public void setWight(int wight) {
		this.wight = wight;
	}


	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}


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
