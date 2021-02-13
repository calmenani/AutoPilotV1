package factoryDesignPattern;

public class CallFactory {

	public static void main(String[] args) {
		factoryOS fos=new factoryOS();
		OS os=fos.getOS("Android");
		os.spec();

	}

}
