package ch.bbw.zork;

/**
 * Mit dieser Klasse können sie Gegenstände kreieren
 * 
 * @author Jeremy Colameo
 *
 */
public class Item {

	private String name;
	private String description;
	private Double weight;

	public Item(String name, String description, double weight) {
		this.name = name;
		this.weight = weight;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String shortDescription() {
		return description;
	}
}
