package awsprog;

class Hello {
	private String name;
	
	Hello() {}
	
	Hello(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
