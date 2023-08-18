public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("12345", "Mouse", 5, 29.99);
        Invoice invoice2 = new Invoice("67890", "Keyboard", -2, -49.99);

        System.out.println("Invoice 1:");
        System.out.println("Number: " + invoice1.getNumber());
        System.out.println("Description: " + invoice1.getDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per Item: " + invoice1.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice1.getInvoiceAmount());

        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println("Number: " + invoice2.getNumber());
        System.out.println("Description: " + invoice2.getDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per Item: " + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice2.getInvoiceAmount());
    }
}