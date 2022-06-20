package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepository;

public class InvoiceService {

    private static long lastNumber = 0L;

    private InvoiceRepository repository = new InvoiceRepository();

    public void createInvoice(Invoice invoice){

        // donner un numéro à ma facture
        invoice.setNumber(String.valueOf(++lastNumber));
        // appeler le repository pour l'enregistrer
        repository.creationInvoice(invoice);

    }

}
