package com.health.sentry.service;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface SentryService {

    public void createExceptionLogs(String body) throws IOException;
}
