package headfirst.iterator.dinermerger;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ArrayList에 대한 처리
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem) breakfastItems.get(i);
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");
		}

		// 배열에대한 처리
		for (int i = 0; i < lunchItems.size(); i++) {
			MenuItem menuItem = lunchItems[i];
			System.out.println(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription() + " ");
		}
	}

}
