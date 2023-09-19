package course55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;

	//デフォルトコンストラクタ
	public Typhoon() {
		System.out.println("あ");
	}

	//引数有りコンストラクタ]
	public Typhoon(int x, String y, String z) {
		this.typhoonbango = x;
		this.hasseibi = y;
		this.asiaName = z;
	}

	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}

	public String getHasseibi() {
		return hasseibi;
	}

	public String getAsiaName() {
		return asiaName;
	}
	
	public void setTyphoonbango(int typhoonbangoo) {
		this.typhoonbango=typhoonbangoo;
	}

	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}

	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
	
}