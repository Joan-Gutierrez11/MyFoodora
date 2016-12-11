package Group9_Project_IS1220_part1_Colas_Prabakaran;

public class FastestDeliveryPolicy implements DeliveryPolicy {

	public FastestDeliveryPolicy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Allocates a courier to the order according to the fastest delivery 
	 * @param myFoodora : MyFoodora system
	 * @param order : the order which need to be allocated to a courier
	 */

	@Override
	public void allocateCourierToOrder(MyFoodora myFoodora, Order order) {
		//the address of delivery
		double xOrder = order.getAddressOfDelivery().getX();
		double yOrder = order.getAddressOfDelivery().getY();
		
		Courier chosenCourier = null;
		//distanceMin is initiated to infinite
		double distanceMin = 999999999;
		
		for (User user: myFoodora.getUsers()){
			if (user instanceof Courier){
				Courier courier = (Courier)user;
				double x = courier.getPosition().getX();
				double y = courier.getPosition().getY();
				//compute the distance between the address of delivery and the position of the courier 
				double distance = Math.pow(Math.pow(x-xOrder, 2)*Math.pow(y-yOrder, 2), 0.5);
				
				if (distance < distanceMin){
					chosenCourier = courier;
				}
			}
		}
		order.setCourier(chosenCourier);
	}
}
