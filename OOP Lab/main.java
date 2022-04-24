package practise1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.studentId = 21110025;
		student1.studentMajor = "Cyber Security";
		student1.studentName = "Moustafa Hamdan";
		
		car dreamCar = new car();
		dreamCar.type = "sport car";
		dreamCar.model = "BMW M8";
		dreamCar.color = "matte black";
		
		Mobile myMobile = new Mobile();
		myMobile.brand = "Samsung";
		myMobile.camera = "12 Mega Pixel";
		myMobile.color = "lailac";
		myMobile.yearOfProduction = 2016;
		
		Room F1 = new Room();
		F1.roomBuilding = "main building";
		F1.roomNo = 8;
		F1.roomType = "lab";
		
		Room L7 = new Room();
		L7.roomBuilding = "IMAN";
		L7.roomNo = 7;
		L7.roomType = "Lab";
		
		System.out.println("student name : " + student1.studentName);
		System.out.println("student major : " + student1.studentMajor);
		System.out.println("student Id : " + student1.studentId);
		System.out.println("-----------------------------------");
		
		System.out.println("my dream car type is : " + dreamCar.type);
		System.out.println("my dream car model is :" + dreamCar.model);
		System.out.println("my dream car color is : " + dreamCar.color);
		System.out.println("------------------------------------");

		
		System.out.println("my phone brand is : " + myMobile.brand);
		System.out.println("my mobile camera is : " + myMobile.camera);
		System.out.println("my mobile color is : " + myMobile.color);
		System.out.println("my mobile year of production is : " + myMobile.yearOfProduction);
		System.out.println("------------------------------------");
		
		System.out.println("room building : " + F1.roomBuilding);
		System.out.println("room type : " + F1.roomType);
		System.out.println("room number : " + F1.roomNo);
		System.out.println("------------------------------------");
		
		System.out.println("room building : " + L7.roomBuilding);
		System.out.println("room type : " + L7.roomType);
		System.out.println("room number : " + L7.roomNo);
		

	}

}
