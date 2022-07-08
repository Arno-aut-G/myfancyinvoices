package com.dachsbau.myfancypdfinvoices.context;

import com.dachsbau.myfancypdfinvoices.model.User;
import com.dachsbau.myfancypdfinvoices.service.InvoiceService;
import com.dachsbau.myfancypdfinvoices.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

    public static final UserService userService = new UserService();
    public static final InvoiceService invoiceService = new InvoiceService(userService);
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
