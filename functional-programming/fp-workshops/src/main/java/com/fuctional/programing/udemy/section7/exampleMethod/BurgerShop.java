package com.reactive.programming.udemy.reactive.section7.exampleMethod;


import java.util.function.Function;

public class BurgerShop {

    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger,Burger> decoration){
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger){
        System.out.println("Base Burger :" + baseBurger);
        return decoration.apply(baseBurger);
    }

}
