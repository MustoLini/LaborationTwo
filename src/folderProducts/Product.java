package folderProducts;

public class Product {

    private String name;
    private String category;
    private int price;
    private int count;

    public Product(){
        //Generic
    }
    public Product(String name, int price, int count, String category){
        setName(name);
        setPrice(price);
        setCount(count);
        setCategory(category);

    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
