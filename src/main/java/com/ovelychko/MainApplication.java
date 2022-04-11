package com.ovelychko;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class MainApplication implements RequestHandler<Map<String, String>, String> {

    public MainApplication() {
        System.out.println("MainApplication created");
    }

    @Override
    public String handleRequest(Map<String, String> stringStringMap, Context context) {
        LambdaLogger logger = context.getLogger();

        String response = "200 OK";

        // log execution details
        logger.log("ENVIRONMENT VARIABLES: " + System.getenv());
        logger.log("CONTEXT: " + context);

        // process event
        logger.log("EVENT: " + stringStringMap.toString());
        logger.log("EVENT TYPE: " + stringStringMap.getClass());
        return response;
    }
}
