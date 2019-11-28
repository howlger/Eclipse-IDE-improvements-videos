package generated;

import generated.Register.AccessType;

public class Field {
    String name;
    String description;
    long bitRange;
    AccessType accessType;

    public Field(String name, String description, long bitRange, AccessType accessType) {
        super();
        this.name = name;
        this.description = description;
        this.bitRange = bitRange;
        this.accessType = accessType;
    }

	@Override
	public String toString() {
		return "Field [name=" + name + ", description=" + description + ", bitRange=" + bitRange + ", accessType="
				+ accessType + "]";
	}
   
}
