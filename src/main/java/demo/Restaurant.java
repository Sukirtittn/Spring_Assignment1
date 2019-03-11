package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.HashMap;

interface HotDrinks {
    public void prepareHotDrink();
}

@Component
class Tea implements HotDrinks {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepairing Tea");
    }
}

class ExpressTea implements HotDrinks {

    @Override
    public void prepareHotDrink() {
        System.out.println("Prepairing ExpressTea");

    }
}

public class Restaurant {
    @Autowired()
    HotDrinks hotDrinks;

    public Restaurant(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public Restaurant() {
    }

    public HotDrinks getHotDrinks() {
        return hotDrinks;
    }

    @Required
    public void setHotDrinks(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
}
