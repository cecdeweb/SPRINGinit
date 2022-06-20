package com.mycompany.invoice.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceService;

import java.util.Scanner;

public class InvoiceController {

    public void createInvoiceUsingConsole(){

        // je permets à l'utilisateur de faire une saisie
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer name : ");
        String customerName = scanner.nextLine();

        // générer une facture
        Invoice newInvoice = new Invoice();
        newInvoice.setCustomerInvoice(customerName);

        // appeler service qui va appeler repository
        InvoiceService service = new InvoiceService();
        service.createInvoice(newInvoice);

    }

}
