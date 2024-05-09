package com.driver;

public class Main {

//    Task 2: Create object of Product in Main function called p
    Product p = new Product();
    int ans = p.product(10,20);
    int ans2 = p.product(10,40, 50 );
    double ans3 = p.product(1.0, 3.0);
    System.out.println(ans+" "ans2+" "+ans3);

//    Task 1: Create a class Product inside Main class
    public static class Product{

//    Task 3: Create a method with the following definition:
//    public int product(int x, int y) {}
//    Call this method from Main using Product class object p
        public int product(int x, int y) {
            return x*y;
        }

//    Task 4: Create an overloaded method with the following definition:
//    public int product(int x, int y, int z) {}
//    Call this method also from Main using Product class object p

        public int product(int x, int y, int z) {
            return x*y*z;
        }

//            Task 5: Create an overloaded method with the following definition:
//    public double product(double x, double y) {}
//    Call this method also from Main using Product class object p
        public double product(double x, double y) {
            return x*y;
        }
    }

}