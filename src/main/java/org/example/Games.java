package org.example;

import java.lang.annotation.Annotation;

public class Games implements Annotation {
    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
