import java.util.*;

class SubArrayRemmoval {
	private static void removeSub(ArrayList<Integer> main,
			ArrayList<Integer> sub)

	{
		for (int i = 0; i < sub.size(); i++) {

			removeNumberfrom(main, sub.get(i));

		}

	}

	public static void removeNumberfrom(ArrayList<Integer> main, Integer number) {
		if (main.contains(number)) {
			main.remove(number);
			removeNumberfrom(main, number);
		}

	}

	public static void main(String[] args) {
		int[] m = { 1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5, 6 };
		int[] s = { 2, 4 };

		ArrayList<Integer> main = new ArrayList();
		for (int i = 0; i < m.length; i++)
			main.add(new Integer(m[i]));

		ArrayList<Integer> sub = new ArrayList();
		for (int i = 0; i < s.length; i++)
			sub.add(new Integer(s[i]));

		removeSub(main, sub);
		// removeNumberfrom(main,2);

		System.out.println(main); // 1, 3, 5, 6

	}

}

/*
 * Public void LogintestCase(String userid,String password) {
 * 
 * WebDriver driver=null;
 * 
 * System.setproperty('webdriver.chrome.driver',"D:/chromedriver.exe"); driver=
 * new ChromeDriver(); driver.get("www.shopee.com");
 * 
 * WebELement userid= driver.findElement(By.id("userid")); WebELement pwd=
 * driver.findElement(By.id("password")); WebELement btn=
 * driver.findElement(By.id("loginBtn")); userid.sendkey(userid);
 * userid.sendkey(password); btn.click(); Webdriver wait = new
 * WebDriverwait(driver,30); wait.until(ExpectedCondtion(dr))
 * 
 * Assert.assertEquals("nextPage",driver.getTitile());
 * 
 * 
 * }
 */

