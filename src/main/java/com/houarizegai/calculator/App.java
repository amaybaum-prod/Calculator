package com.houarizegai.calculator;
import org.apache.log4j.LogManager;

import org.apache.log4j.Logger;
import com.houarizegai.calculator.ui.CalculatorUI;

public class App {
    protected static final Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("starting calculator app...");
        new CalculatorUI();
    }
}
