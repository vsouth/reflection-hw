package org.example.model;

import org.example.annotations.Autowired;
import org.example.annotations.Component;

@Component("Car")
public class Car {
    @Autowired
    private Body body;
    @Autowired
    private Engine engine;



    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                '}';
    }
}
