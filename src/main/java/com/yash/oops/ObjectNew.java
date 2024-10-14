package com.yash.oops;

class Company
{
    int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}

public class ObjectNew {
    public static void main(String[] args) {

        Company obj=new Company();
        obj.setEmpId(9);
        obj.setEmpName("Dhanashri");
        System.out.println(obj.getEmpId());
        System.out.println(obj.getEmpName());

    }
}
