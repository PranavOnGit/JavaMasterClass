package Challanges.OOP_Master;

//please refer challenge.txt for problem statement.
public class Main {
    public static void main(String[] args) {

/////////////////First Object
        Hamburger hum = new Hamburger("Plain", "salami",45.3F, 5.4F);
        hum.setLettuce(true);
        hum.setTomato(false);
        hum.setCarrot(true);
        hum.setName("Classic Ham");

        System.out.println();
        System.out.println("Order: #1 ");
        System.out.println("Name: "+hum.getName());
        System.out.println("Bread Type: "+hum.getBreadRoll());
        System.out.println("Meat Type: "+hum.getMeat());
        System.out.println("Hamburger for base price: "+hum.getBaseCharge());

        System.out.println();
        System.out.println("Additional Charges per Item: "+ hum.getAdditionalCharge());
        String isLettuce = (hum.isLettuce()) ? "Yes": "No";
        String isTomato = (hum.isTomato()) ? "Yes": "No";
        String isCarrot = (hum.isCarrot()) ? "Yes": "No";
        System.out.println("Lettuce added: "+ isLettuce);
        System.out.println("Tomato added: "+ isTomato);
        System.out.println("Carrot added: "+isCarrot);

        System.out.println();
        System.out.println("Hamburger for final price: "+hum.additionalItems());
        System.out.println("------------------------------------------------");

/////////////////Second Object
        DeluxHamburger Dhum = new DeluxHamburger("Plain", "Double Meat", 45.3F, 5.4F, false, true );
        Dhum.setLettuce(false);
        Dhum.setTomato(true);
        Dhum.setCarrot(true);
        Dhum.setName("Delux Hamburger");

        System.out.println();
        System.out.println("Order: #2 ");
        System.out.println("Name: "+Dhum.getName());
        System.out.println("Bread Type: "+ Dhum.getBreadRoll());
        System.out.println("Meat Type: "+Dhum.getMeat());

        System.out.println(Dhum.getName()+ "base price: "+Dhum.getBaseCharge());

        System.out.println();
        System.out.println("Additional Charges per Item: "+ Dhum.getAdditionalCharge());
        isLettuce = (Dhum.isLettuce()) ? "Yes": "No";
        isTomato = (Dhum.isTomato()) ? "Yes": "No";
        isCarrot = (Dhum.isCarrot()) ? "Yes": "No";
        String isChips = (Dhum.isChips()) ? "Yes": "No";
        String isDrinks = (Dhum.isDrinks()) ? "Yes": "No";
        System.out.println("Lettuce added: "+ isLettuce);
        System.out.println("Tomato added: "+ isTomato);
        System.out.println("Carrot added: "+isCarrot);
        System.out.println("Chips added: "+isChips);
        System.out.println("Drinks added: "+isDrinks);

        System.out.println();
        System.out.println(Dhum.getName()+" for final price: "+Dhum.additionalItems());

        System.out.println("------------------------------------------------");

/////////////////Third Object
        HealthyBurger Hhum = new HealthyBurger("Brown rye bread roll", " - ", 45.3F, 6.4F, true, false );

        Hhum.setName("Healthy Hamburger");
        System.out.println();
        System.out.println("Order: #3 ");
        System.out.println("Name: "+Hhum.getName());
        System.out.println("Bread Type: "+ Hhum.getBreadRoll());
        System.out.println("Meat Type: "+Hhum.getMeat());

        System.out.println(Hhum.getName()+ "base price: "+Hhum.getBaseCharge());

        System.out.println();
        System.out.println("Additional Charges per Item: "+ Hhum.getAdditionalCharge());
        String isPotato = (Hhum.isPotato()) ? "Yes": "No";
        String isSpinach = (Hhum.isSpinach()) ? "Yes": "No";
        System.out.println("Potato added: "+ isPotato);
        System.out.println("Spinach added: "+ isSpinach);

        System.out.println();
        System.out.println(Hhum.getName()+" for final price: "+Hhum.additionalItems());

        System.out.println("------------------------------------------------");

    }
}
