package com.sparta.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logger1 {
    private static Logger logger = LogManager.getLogger("My Sparta App"); // LoggingDemo.getClass().getName()

    public void logSortTime(String a, double b) {
        logger.info("This is an info message:" + a + " completed in " + b + " nanoseconds");
        //a will be the sort name
        // And b will be how long it has taken to complete that task
    }

    public void logError(String otherInfo) {
        logger.warn("Error message" + otherInfo);
    }
}
