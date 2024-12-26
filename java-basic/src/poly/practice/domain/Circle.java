package poly.practice.domain;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    private void setRadius(int radius) {
        if(radius <= 0)
            throw new IllegalArgumentException("원의 반지름은 0보다 커야합니다.");

        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원을 그립니다.");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
