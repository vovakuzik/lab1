
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0.0 ? pricePerItem : 0.0;
    }


    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity > 0 ? quantity : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {

        this.pricePerItem = pricePerItem > 0.0 ? pricePerItem : 0.0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }


    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}


public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("12345", "Widget", 10, 5.99);

        // Вывод информации о счете-фактуре
        System.out.println("Счет-фактура:");
        System.out.println("Номер детали: " + invoice.getPartNumber());
        System.out.println("Описание детали: " + invoice.getPartDescription());
        System.out.println("Количество: " + invoice.getQuantity());
        System.out.println("Цена за единицу товара: $" + invoice.getPricePerItem());
        System.out.println("Общая сумма счета: $" + invoice.getInvoiceAmount());
    }
}
