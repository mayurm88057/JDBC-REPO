package demo.pojo;

public class Student {
	int rollNO;
	String name;
	String address;
	float age;
	double percentage;
	
	public Student() {
		super();
	}

	public Student(int rollNO, String name, String address, float age, double percentage) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.address = address;
		this.age = age;
		this.percentage = percentage;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	

}
