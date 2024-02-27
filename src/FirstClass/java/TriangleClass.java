package FirstClass.java;

	/*abstract class Shape {
		
	    abstract double calculateArea();
	    abstract double calculatePerimeter();
	
	
	public static void main(String[] args) {
		
	}*/
		abstract class Shape {
		    abstract double calculateArea();
		    abstract double calculatePerimeter();
		}

		class Rectangle extends Shape {
		    private double length;
		    private double width;

		    public Rectangle(double length, double width) {
		        this.length = length;
		        this.width = width;
		    }

		    @Override
		    double calculateArea() {
		        return length * width;
		    }

		    @Override
		    double calculatePerimeter() {
		        return 2 * (length + width);
		    }
		}

		class Circle extends Shape {
		    private double radius;

		    public Circle(double radius) {
		        this.radius = radius;
		    }

		    @Override
		    double calculateArea() {
		        return Math.PI * radius * radius;
		    }

		    @Override
		    double calculatePerimeter() {
		        return 2 * Math.PI * radius;
		    }

		    public static void main(String[] args) {
		        Rectangle rectangle = new Rectangle(5, 4);
		        System.out.println("Rectangle Area: " + rectangle.calculateArea());
		        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

		        Circle circle = new Circle(3);
		        System.out.println("Circle Area: " + circle.calculateArea());
		        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		    }
		}

		



