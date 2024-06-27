package WebDriver_Arch_Interface;

public class FirefoxDriver implements WebDriver{

	public FirefoxDriver() {
		System.out.println("firefox is launched");
	}

	@Override
	public void findElement(String name) {
		System.out.println("finding element  with name : " + name);
	}

	@Override
	public void findElements(String name) {
		System.out.println("finding elements  with name : " + name);

	}

	@Override
	public void get(String url) {
		System.out.println("launching url : " + url);
		//10 lines
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter the value : " + value + " in element " + element);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}
	
	
	
	
	
}
