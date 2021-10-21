package livraria;

public class Order {
    private Book book;
    private ShippingInfo shippingInfo;
    private User user;
    private String compra;
    private BillingInfo billingInfo;
    
    //Métodos de Operação
    
    public boolean modify(){
        return false;
    }
    
    public boolean checkAvailibility(){
        return false;
    }
    
    public boolean isFullFilled(){
        if(book!=null && shippingInfo!=null && billingInfo!=null && user!=null){
            return true;
        }
        return false;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }
    
}
