    // abstract String get_price();
    // abstract String get_catogery();

    /**
 * BMW extends Car
 */
package packages;

 class BMW extends Car {

    public String get_name(){
        return "BMW";
    }
}

public class Hello {
    public static void main(String[] args) {
        Car car = new BMW();

        System.out.println("Learned Java as a Python developer"+car.get_name());
    }
}

