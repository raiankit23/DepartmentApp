package com.ankit.Springboot.tutorial.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeatureEndPoint {

    private final Map<String, Feature> featureMap = new ConcurrentHashMap<>()
}
