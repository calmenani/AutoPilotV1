package factoryDesignPattern;

public class factoryOS {
public OS getOS(String oSType) {
	if(oSType.equals("IOS"))
		return new IOS();
	else if(oSType.equals("Android"))
		return new Android();
	else if(oSType.equals("Windows"))
		return new Windows();
	
	return null;
	}
}
