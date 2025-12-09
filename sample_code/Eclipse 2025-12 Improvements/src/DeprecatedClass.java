@Deprecated 
public class DeprecatedClass {
	
	public String f;
	
	protected void m(String param) {};
	
	static class Nested {};

}

@SuppressWarnings("deprecation")
class NewApi extends DeprecatedClass {}