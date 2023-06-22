package com.company.openbanking.controller;

import com.company.openbanking.service.TransactionService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = TransactionController.class)
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
public class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private TransactionService transactionService;


}
