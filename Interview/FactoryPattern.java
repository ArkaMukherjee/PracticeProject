// Product interface
interface Product {
    String operation();
}

// Concrete products
class ConcreteProductA implements Product {
    public String operation() {
        return "Product A";
    }
}

class ConcreteProductB implements Product {
    public String operation() {
        return "Product B";
    }
}

// Factory
class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}

// Usage
public class FactoryPattern {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct("A");
        Product productB = ProductFactory.createProduct("B");
        
        System.out.println(productA.operation()); // Output: Product A
        System.out.println(productB.operation()); // Output: Product B
    }
}