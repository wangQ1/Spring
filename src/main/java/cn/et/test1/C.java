package cn.et.test1;

public class C {
	private String id;
	private String name;
	private B b;
	public C(String id, String name, B b) {
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
}
