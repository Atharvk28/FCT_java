package com.Oops;

 class Methods {
//    void method
    void greatMethod(){
        System.out.println("Welcome to Fortune Cloud Technology...");
    }

//    method with parameters and return type
    public int additon(int num1,int num2){
        return num1 + num2;
    }

    static void main() {

        Methods m1 = new Methods();
        m1.greatMethod();


        System.out.println( m1.additon(4,8));

    }
}
