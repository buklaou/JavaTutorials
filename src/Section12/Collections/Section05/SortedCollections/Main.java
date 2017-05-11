package Section12.Collections.Section05.SortedCollections;

import java.util.Map;

/**
 * @author Raffi
 */
public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);


        for (String s : stockList.Items().keySet()) {
            System.out.println(s);
        }

        System.out.println(stockList);
        System.out.println("---------------");
        Basket basket = new Basket("BASKET");
        sellItem(basket, "car", 1);
//        System.out.println(basket);

        sellItem(basket, "door", 1);
//        System.out.println(basket);

        sellItem(basket, "chair", 1);
//        System.out.println(basket);


//        System.out.println(stockList);


        Basket basket2 = new Basket("CUSTOMER");
        sellItem(basket2, "cup", 100);
        sellItem(basket2, "juice", 5);
        removeItem(basket2, "cup", 1);

        System.out.println(basket2);

        removeItem(basket, "car", 1);
        removeItem(basket,"door", 1);
        removeItem(basket, "chair", 1);

        System.out.println(basket);

        System.out.println("-----------");

        System.out.println(basket2);
        System.out.println(stockList);
        checkOut(basket2);
        System.out.println(basket2);
        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {

        StockItem stockitem = stockList.get(item.toLowerCase());
        if (stockitem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockitem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {

        StockItem stockitem = stockList.get(item.toLowerCase());
        if (stockitem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (basket.removeFromBasket(stockitem, quantity) == quantity) {
            basket.addToBasket(stockitem, quantity);
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkOut(Basket basket) {
        for(Map.Entry<StockItem,Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
