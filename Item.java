import java.io.IOException;
import java.io.Writer;

public class Item {
    private String invoiceNo;
    private String stockCode;
    private String description;
    private int quantity;
    private double unitPrice;

    public Item(String invoiceNo, String stockCode, String description, int quantity, double unitPrice) {
        this.invoiceNo = invoiceNo;
        this.stockCode = stockCode;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

    }

    public void printDetails(Writer w) {
        try {
            w.write("Invoice Number: " + this.invoiceNo + "\n");
            w.write("Stock Code: " + this.stockCode + "\n");
            w.write("Description: " + this.description + "\n");
            w.write("Quantity: " + this.quantity + "\n");
            w.write("Unit Price: " + this.unitPrice+ "\n");
        } catch (IOException e) {
            System.out.println("IO Exception: file in unexpected format or not found");
        }
    }
}
