package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("Spring-config.xml");
        System.out.println(applicationContext.getBean("databaseBeanByUsingSetters"));
        System.out.println(applicationContext.getBean("databaseBeanByUsingConstructor"));
        System.out.println(applicationContext.getBean("complexBean"));
        Restaurant restaurant=
                applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant.getHotDrinks().prepareHotDrink();
        Restaurant restaurant1=
                applicationContext.getBean("expressTeaRestaurantViaInnerBean",Restaurant.class);
        restaurant1.getHotDrinks().prepareHotDrink();
        Restaurant restaurant2=
                applicationContext.getBean("teaViaAutowireByName",Restaurant.class);
        restaurant2.getHotDrinks().prepareHotDrink();

        Restaurant restaurant3=
                applicationContext.getBean("teaRestaurant",Restaurant.class);
        restaurant3.getHotDrinks().prepareHotDrink();

        Restaurant restaurant4=
                applicationContext.getBean("teaRestaurant",Restaurant.class);
        System.out.println(restaurant4);
        System.out.println(restaurant3);

    }
}
