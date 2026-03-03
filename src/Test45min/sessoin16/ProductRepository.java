package Test45min.sessoin16;

import java.util.*;

public class ProductRepository implements IRepository<Product> {

    private  List<Product> productList = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();


    public boolean add(Product item) {
        if (item == null || item.getId() == null) {
            return false;
        }

        if (productMap.containsKey(item.getId())) {
            return false; // Trùng id
        }

        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeByid(String id) {
        return false;
    }

    @Override
    public Product findByid(String id) {
        return null;
    }
    public boolean removeById(String id) {
        if (id == null) return false;

        Product product = productMap.remove(id);
        if (product != null) {
            productList.remove(product);
            return true;
        }
        return false;
    }

    public Product findById(String id) {
        if (id == null) return null;
        return productMap.get(id);
    }


    public List<Product> findAll() {
        return productList;
    }


    public Map<String, Integer> countByType() {
        Map<String, Integer> result = new HashMap<>();

        for (Product p : productList) {
            String type = p.getClass().getSimpleName();
            result.put(type, result.getOrDefault(type, 0) + 1);
        }

        return result;
    }
}

