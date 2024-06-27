package WebDriver_Arch_Interface;

public interface WebDriver extends SearchContext {

	
	@Override
	public void findElement(String name);

	@Override
	public void findElements(String name);
	
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void close();
	
	
	

}
