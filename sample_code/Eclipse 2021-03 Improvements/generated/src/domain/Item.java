package domain;
/******************************************************************************
 *                                                                            *
 *                                DO NOT EDIT!                                *
 *                                                                            *
 ******************************************************************************/
public class Item {

	private final String name;

	private int count;
	
	public Item(String name) {
		this.name= name;
	}

	public String getName() {
		return name;
	}

	public void setCount(int count) {
		this.count= count;
	}
	
	public int getCount() {
		return count;
	}

}