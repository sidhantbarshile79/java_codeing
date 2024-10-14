package com.yash.oops
        ;

class Fruit
{
    String name;
    String taste;
    String size;

    void eat(String name, String taste)
    {
        System.out.println("Fruit name is :" +name+ "Taste is : "+taste);
    }
}
class Apple extends Fruit
{
    @Override
    void eat(String name, String taste )
    {
        super.eat(name,taste);
    }
}

class Orange extends Fruit
{
    @Override
    void eat(String name, String taste) {
        super.eat(name,taste);
    }
}

class test
{
    public static void main(String[] args)
    {
        Apple a = new Apple();
        Orange o = new Orange();
        a.eat("Apple","Sweet");
        o.eat("Orange","Sweet");
    }
}
