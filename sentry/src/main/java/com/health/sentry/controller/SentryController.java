package com.health.sentry.controller;

import com.health.sentry.service.SentryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentryController {

    @Autowired
    private SentryService sentryService;

    @PostMapping("test")
    public void publishSentryData(@RequestBody String data) throws Exception {
        sentryService.createExceptionLogs(data);
    }

}