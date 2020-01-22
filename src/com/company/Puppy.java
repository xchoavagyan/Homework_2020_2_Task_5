package com.company;

public class Puppy {
    private String name;
    private int age;

    public Puppy(String name, int age) {
        this.name = name;
        if (age < 1) {
            this.age = age;
        } else {
            System.out.println("Puppy is small then 1 year");
        }
    }

    public Puppy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            this.age = age;
        } else {
            System.out.println("Puppy is small then 1 year");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puppy puppy = (Puppy) o;

        if (age != puppy.age) return false;
        return name != null ? name.equals(puppy.name) : puppy.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
