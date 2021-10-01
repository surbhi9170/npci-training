package junitExample;

public class Calculator {
    int a;
    int b;
    Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int add()
    {
        return a+b;
    }
    int sub()
    {
        return a-b;
    }
    int prod(){
        return a*b;
    }
    int div()
    {
        return (a/b);
    }
    void all()
    {
        System.out.println("add:"+add()+" sub: "+sub());
    }
}
