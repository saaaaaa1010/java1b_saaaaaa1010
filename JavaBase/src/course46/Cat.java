package course46;

public class Cat implements Animal {
	private String name;
	private String shurui;
	private String size;

	public void eat(String food) {
		System.out.println(this.name + "は" + food + "を食べます。もぐもぐ。");
	}

	public void run() {
		System.out.println(this.name + "は走り去ります。");
	}

	//getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShurui() {
		return shurui;
	}

	public void setShurui(String shurui) {
		this.shurui = shurui;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(shurui);
		System.out.println(size);
	}
}
