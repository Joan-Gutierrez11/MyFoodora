package fr.ecp.is1220.MyFoodora;

public abstract class Meal extends FoodItem {
	
	private static final long serialVersionUID = 5331853906083701302L;
	/**
	 * the name of the meal
	 */
	private String name;
	/**
	 * the main-dish of the meal
	 */
	protected MainDish mainDish;
	
	/**
	 * the type of the dish : standard, vegetarian or gluten-free
	 */
	protected String type = "standard";
	/**
	 * The discount factor of the dish
	 */
	protected double discountFactor = 0.05; 
	
	/**
	 * creates a Meal object of a given mainDish
	 * @param name : the name of the meal
	 * @param mainDish
	 */
	public Meal(String name) {
		this.mainDish = null;
	}
	
	/**
	 * creates a Meal object of a given mainDish
	 * @param name : the name of the meal
	 * @param mainDish
	 */
	public Meal(String name, MainDish mainDish) {
		this.mainDish = mainDish;
	}
	
	abstract void update (Menu menu);
	
	abstract void addDish2Meal (Dish dish) throws NoPlaceInMealException;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MainDish getMainDish() {
		return mainDish;
	}

	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return ("Meal : " + this.getName() + " price " + this.getPrice() + " type : " + this.getType() + "/n"
				+ mainDish.toString() + "/n");
	}
}
