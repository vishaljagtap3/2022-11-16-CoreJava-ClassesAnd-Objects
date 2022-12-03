public class Product {
    private int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product() {
        this(0, "NA", 0);
        System.out.println("default");
        /*this.id = 0;
        this.title = "NA";
        this.price = 0;*/
    }

    public void display() {
        System.out.println(id  + " " + title + " " + price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void init(int id, String title, int price) {
        this.setId(id);
        setTitle(title);
        setPrice(price);
    }
}
