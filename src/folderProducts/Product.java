package folderProducts;

import java.util.Objects;

public class Product {

    private int id;
    private String name;
    private String category;
    private int price;
    private int count;

    public Product(){
        //Generic
    }



    public Product(int id, String name, int price, int count, String category){
        setId(id);
        setName(name);
        setPrice(price);
        setCount(count);
        setCategory(category);

    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    @Override
    public String toString() {
        return  "ID:"+id +
                ", Name:" + name +
                ", Category:" + category  +
                ", Price:" + price +
                ", Count:" + count ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && count == product.count && Objects.equals(name, product.name) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, price, count);
    }
}
