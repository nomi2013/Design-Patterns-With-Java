package com.nomankhan.designpatternjava.designpatterns.creational.builder;

/**
 * Created by Noman Khan on 27/06/17.
 */

class Persion {

    private String name;
    private int age;
    private String email;
    private String address;

    public Persion(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class Builder {
        private final String name;
        private final int age;
        private String email;
        private String address;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Persion build() {
            return new Persion(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
