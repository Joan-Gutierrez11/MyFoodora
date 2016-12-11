package fr.ecp.is1220.MyFoodora;

public abstract class Meal implements FoodItem {
	
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
	 * the total price of the meal
	 */
	protected double price = 0;
	/**
	 * the generic discount factor for meals
	 */
	protected double discountFactor = 0.05; 
	/**
	 * the number of times the meal has been shipped 
	 */
	int counter = 0 ;
	
	/**
	 * creates a Meal object of a given mainDish
	 * @param mainDish
	 */
	public Meal(String name, MainDish mainDish) {
		this.mainDish = mainDish;
	}
	
	abstract void update (Menu menu);

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
	public int getCounter(){
		return counter ;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void increaseCounter() {
		this.counter++ ;
	}
	
	@Override
	public String toString() {
		return ("Meal : " + this.getName() + " price " + this.getPrice() + " type : " + this.getType() + "/n"
				+ mainDish.toString() + "/n");
	}
}