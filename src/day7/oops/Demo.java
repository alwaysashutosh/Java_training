//package day7.oops;
//
//public class Demo {
//
//        static int a = 10;     // static variable
//        int b = 20;            // non-static variable
//
//        static void staticMethod() {
//            System.out.println(a);   //  static → static
//            // System.out.println(b); // static → non-static (ERROR)
//            staticMethod2();         //  static → static
//            // nonStaticMethod();    //  static → non-static (ERROR)
//        }
//
//        static void staticMethod2() {
//            System.out.println("Static Method");
//        }
//
//        void nonStaticMethod() {
//            System.out.println(a);   // ✔ non-static → static
//            System.out.println(b);   // ✔ non-static → non-static
//            staticMethod();          // ✔ non-static → static
//            nonStaticMethod2();      // ✔ non-static → non-static
//        }
//
//        void nonStaticMethod2() {
//            System.out.println("Non-Static Method");
//        }
//    }
//
////public static void main(String args[]){
//    Demo.staticMethod();
//}