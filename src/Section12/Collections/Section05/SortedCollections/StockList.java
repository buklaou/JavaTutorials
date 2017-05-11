package Section12.Collections.Section05.SortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Raffi
 */
public class StockList {

    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem stockItem) {
        if (stockItem != null) {
            StockItem inStock = list.getOrDefault(stockItem.getName(), stockItem);
            if (inStock != stockItem) {
                stockItem.adjustStock(inStock.availableStock());
            }

            list.put(stockItem.getName(), stockItem);
            return stockItem.availableStock();

        }

        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if((inStock != null) && (quantity > 0)) {
            inStock.finalStock(quantity);

        }
        return 0;
//        StockItem inStock = list.getOrDefault(item, null);
//
//        if ((inStock != null) && (inStock.availableStock() >= quantity) && (quantity > 0)) {
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//
//        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if((inStock != null) && (quantity > 0)) {
            return inStock.reserveStock(quantity);
        }

        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);
        if((inStock != null) && (quantity > 0)) {
            return inStock.unreserveStock(quantity);
        }

        return 0;
    }


    public StockItem get(String key) {
        return list.get(key);
    }


    public Map<String,StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() + stockItem.availableStock();

            s = s + stockItem + ". There are " + stockItem.availableStock() + " in stock. Value of item: ";
            s = s + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + String.format("%.2f", totalCost);
    }
}