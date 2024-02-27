package FirstClass.java;

public interface ShapeInt {
	
	
	interface Shape {
	    double getArea();
	}
	

	class Rectangle implements Shape {
	    double length;
	    double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	
	    public double getArea() {
	        return length * width;
	    }
	}

	class Circle implements Shape {
		double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}

	class Triangle implements Shape {
	    private double base;
	    private double height;
	    

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    public double getArea() {
	        return 0.5 * base * height;
	        
	    }
	}
	

	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 4);	      
	        System.out.println("Rectangle Area: " + rectangle.getArea());

	        Circle circle = new Circle(3);
	        System.out.println("Circle Area: " + circle.getArea());

	        Triangle triangle = new Triangle(4, 6);
	        System.out.println("Triangle Area: " + triangle.getArea());
	    }
	}

