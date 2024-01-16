interface Figure {
    void getName();
}

class Circle implements Figure {
    public void getName() {
        System.out.println("Circle");
    }
}
class Quad implements Figure {
    public void getName() {
        System.out.println("Quad");
    }
}
class Triangle implements Figure {
    public void getName() {
        System.out.println("Triangle");
    }
}
class Rectangle implements Figure {
    public void getName() {
        System.out.println("Rectangle");
    }
}
class Parallelogram implements Figure {
    public void getName() {
        System.out.println("Parallelogram");
    }
}
class Diamond implements Figure {
    public void getName() {
        System.out.println("Diamond");
    }
}

class Shape {
    public void printName(Figure shape) {
        shape.getName();
    }
}

class ShapeTest {
    public static void main(String[] args) {
        new Shape().printName(new Circle());
        new Shape().printName(new Rectangle());
        new Shape().printName(new Parallelogram());
        new Shape().printName(new Quad());
        new Shape().printName(new Triangle());
        new Shape().printName(new Diamond());
    }
}