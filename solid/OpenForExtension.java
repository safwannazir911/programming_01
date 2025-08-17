package solid;

public class OpenForExtension {
    public interface InvoiceFormat {
        void print();
    }

    public static class PdfInvoice implements InvoiceFormat {
        public void print() {
            System.out.println("Printing PDF invoice...");
        }
    }

    public static class HtmlInvoice implements InvoiceFormat {
        public void print() {
            System.out.println("Printing HTML invoice...");
        }
    }
    // open for extension(DocInvoice)


    //closed for modification
    public static class InvoicePrinter {
        private final InvoiceFormat invoice;

        InvoicePrinter(InvoiceFormat invoice) {
            this.invoice = invoice;
        }

        public void print() {
            invoice.print();
        }
    }


    public static void main(String[] args) {
        InvoiceFormat invoice = new HtmlInvoice();
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.print();


    }

}
