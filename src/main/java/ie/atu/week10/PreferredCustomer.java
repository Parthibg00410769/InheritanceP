package ie.atu.week10;

public class PreferredCustomer extends Customer {
    private String purchase;
    private String DiscountLevel;


    public PreferredCustomer() {

    }

    public PreferredCustomer(String name, String address, String number, String customerNumber, boolean mailingList, String purchase, String discountLevel) {
        super(name, address, number, customerNumber, mailingList);
        this.purchase = purchase;
        DiscountLevel = discountLevel;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getDiscountLevel() {
        return DiscountLevel;
    }

    public void setDiscountLevel(String discountLevel) {
        DiscountLevel = discountLevel;
    }



    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "purchase='" + purchase + '\'' +
                ", DiscountLevel='" + DiscountLevel + '\'' +
                '}';
    }
}

