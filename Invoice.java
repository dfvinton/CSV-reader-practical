public class Invoice {

    private String invoiceNo;
    private double invPrice;

    public Invoice (String invoiceNo, double invPrice) {
        this.invoiceNo = invoiceNo;
        this.invPrice = invPrice;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public double getInvPrice() {
        return invPrice;
    }

}