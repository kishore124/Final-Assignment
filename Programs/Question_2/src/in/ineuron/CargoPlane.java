package in.ineuron;

public class CargoPlane extends Plane {

	private Double totalGoodsWeigth;

	public CargoPlane(String name, String type, Double totalweight, Double totalGoodsWeigth) {
		super(name, type, totalweight);

		this.totalGoodsWeigth = totalGoodsWeigth;
	}

	@Override
	public String toString() {
		return "CargoPlane [totalGoodsWeigth=" + totalGoodsWeigth + "]";
	}

}
