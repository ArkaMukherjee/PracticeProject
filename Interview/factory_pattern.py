from abc import ABC, abstractmethod

# Product interface
class Product(ABC):
    @abstractmethod
    def operation(self):
        pass

# Concrete products
class ConcreteProductA(Product):
    def operation(self):
        return "Product A"

class ConcreteProductB(Product):
    def operation(self):
        return "Product B"

# Factory
class ProductFactory:
    @staticmethod
    def create_product(product_type):
        if product_type == "A":
            return ConcreteProductA()
        elif product_type == "B":
            return ConcreteProductB()
        else:
            raise ValueError(f"Unknown product type: {product_type}")

# Usage
if __name__ == "__main__":
    factory = ProductFactory()
    
    product_a = factory.create_product("A")
    product_b = factory.create_product("B")
    
    print(product_a.operation())  # Output: Product A
    print(product_b.operation())  # Output: Product B