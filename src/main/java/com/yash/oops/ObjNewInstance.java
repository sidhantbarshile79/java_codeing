package com.yash.oops;

class ObjNewInstance
{
    void show()
    {
        System.out.println("A new object created.");
    }

    public static void main(String[] args)
    {
        try {
            Class cls = Class.forName("com.yash.corejava.opps.ObjNewInstance");
            ObjNewInstance obj = (ObjNewInstance) cls.newInstance();
            obj.show();
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}