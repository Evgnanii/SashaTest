public class Product {
    private Long id;
    private String name;
    private Long price;
    private Long rating;

    public Product(Long id, String name, Long price, Long rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

   public Long getId(){
        return this.id;
   }
    public boolean setId(Long id) {
        this.id = id;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }
}
