package com.yash.oops;

class Shape
{
    void draw()
    {
        System.out.println("Shape draw method");
    }
    void erase()
    {
        System.out.println("Shape erase method");
    }
}
class Circle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape
{
    @Override
    void draw()
    {
        System.out.println("Drawing Square");
    }

    @Override
    void erase()
    {
        System.out.println("Erasing Square");
    }
}
class TestShape
{
    public static void main(String[] args)
    {
        Shape c=new Circle();
        Shape t=new Triangle();
        Shape s=new Square();

        c.draw();
        c.erase();

        t.draw();
        t.erase();

        s.draw();
        s.erase();

    }
}
