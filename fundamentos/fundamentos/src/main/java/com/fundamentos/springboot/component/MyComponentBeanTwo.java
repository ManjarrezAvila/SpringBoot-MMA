package com.fundamentos.springboot.component;

import org.springframework.stereotype.Component;

@Component("cualquierNombre")
public class MyComponentBeanTwo implements MyComponent {
    @Override
    public void printSomething() {
        System.out.println("Imprimiendo algo de MyComponentBeanTwo");
    }
}
