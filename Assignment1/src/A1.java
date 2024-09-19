import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A1 {

    public static void main(String[] args) throws IOException {
        BufferedReader test1 = new BufferedReader(new FileReader("src/productTest.txt"));
        BufferedReader test2 = new BufferedReader(new FileReader("src/productTest.txt"));

        CostOfLiving testObj = new CostOfLiving();
        int test = testObj.loadProductHistory(test1);
        int test3 = testObj.loadProductHistory(test2);
        System.out.println(test3);

        BufferedReader test4 = new BufferedReader(new FileReader("src/cartTest.txt"));
        BufferedReader test5 = new BufferedReader(new FileReader("src/cartTest.txt"));

        int test6 = testObj.loadShoppingCart(test4);
        int test7 = testObj.loadShoppingCart(test5);
        System.out.println(test7);
    }
}
