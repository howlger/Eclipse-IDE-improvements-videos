package generated;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Register {

    public enum AccessType {
        readOnly, readWrite;
    }

    String name;
    String description;
    long addressOffset;
    long size;
    AccessType accessType;
    long resetValue;
    long resetMask;
    long value;

    Map<String, Field> fieldsMap;

    public Register(String name, String description, long addressOffset, long size,
            AccessType accessType, long resetValue, long resetMask) {
        this.name = name;
        this.description = description;
        this.addressOffset = addressOffset;
        this.size = size;
        this.accessType = accessType;
        this.resetValue = resetValue;
        this.resetMask = resetMask;

    }

    private void initFieldsMap(){
    	if (fieldsMap != null) {
    		return;
    	}
    	fieldsMap = new TreeMap<>();
    	for (java.lang.reflect.Field field : this.getClass().getDeclaredFields()) {
        	if (!Field.class.isAssignableFrom(field.getType())){
        		continue;
        	}
        	try {
				fieldsMap.put(field.getName(), (Field) field.get(this));
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }

    public void setValue(long value){
    	this.value = value;
    }

    public long getValue(){
    	return this.value;
    }

    public Collection<Field> getFields(){
    	initFieldsMap();
    	return fieldsMap.values();
    }

	@Override
	public String toString() {
		return "Register [name=" + name + ", description=" + description + ", addressOffset=" + addressOffset
				+ ", size=" + size + ", accessType=" + accessType + ", resetValue=" + resetValue + ", resetMask="
				+ resetMask + "]";
	}


}

