package generated;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Peripheral {

    String name;
    String version;
    String description;
    String groupName;
    long baseAddress;
    long size;

    Map<String, Register> registersMap;

    public Peripheral(String name, String version, String description, String groupName,
            long baseAddress, long size) {
        super();
        this.name = name;
        this.version = version;
        this.description = description;
        this.groupName = groupName;
        this.baseAddress = baseAddress;
        this.size = size;
    }

    private void initRegistersMap(){
    	if (registersMap != null) {
    		return;
    	}
    	registersMap = new TreeMap<>();
    	for (java.lang.reflect.Field field : this.getClass().getDeclaredFields()) {
        	if (!Register.class.isAssignableFrom(field.getType())){
        		continue;
        	}
        	try {
        		registersMap.put(field.getName(), (Register) field.get(this));
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }

    public Register getRegister(String name) {
    	return registersMap.get(name);
    }
    public Collection<Register> getRegisters(){
    	initRegistersMap();
    	return registersMap.values();
    }
}

