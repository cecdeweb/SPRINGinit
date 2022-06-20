package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        InvoiceController controller = new InvoiceController();
        controller.createInvoiceUsingConsole();
    }
}
