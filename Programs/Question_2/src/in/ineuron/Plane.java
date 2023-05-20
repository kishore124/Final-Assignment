package in.ineuron;

public class Plane {

	private String name;
	private String type;
	private Double totalweight;

	public Plane(String name, String type, Double totalweight) {
		super();
		this.name = name;
		this.type = type;
		this.totalweight = totalweight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getTotalweight() {
		return totalweight;
	}

	public void setTotalweight(Double totalweight) {
		this.totalweight = totalweight;
	}

	@Override
	public String toString() {
		return "Plane [name=" + name + ", type=" + type + ", totalweight=" + totalweight + "]";
	}

}
