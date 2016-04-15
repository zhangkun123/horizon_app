package com.laioffer.horizon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shuodeng on 2/1/2016.
 */
public class DataService {

    /**
     * Fake all the news data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<News> getRestaurantData() {
        List<News> restaurantData = new ArrayList<News>();
        for (int i = 0; i < 10; ++i) {
            restaurantData.add(
                    new News("568e97e27988104ebd4961a6",
                            "For Stock Markets, January Is a Cloudy Crystal Ball",
                            "http://www.nytimes.com/2016/01/08/business/for-markets-january-is-a-cloudy-crystal-ball.html",
                            "The Stock Trader’s Almanac first posited that January markets can foretell the direction of the trading year, but statistics experts say causation is impossible to prove — or disprove.",
                            "http://www.nytimes.com/images/2016/01/08/business/08stewart-web2/08stewart-web2-thumbWide.jpg",
                            Arrays.asList("Stocks and Bonds",
                                    "Statistics",
                                    "Standard & Poor's 500-Stock Index",
                                    "Stock Trader's Almanac (Book)"),
                            false
                    ));
        }
        return restaurantData;
    }
}
