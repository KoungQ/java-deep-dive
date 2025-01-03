package poly.practice.domain;

public class Triangle implements Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
//        this.base = base;
//        this.height = height;
        setBase(base);
        setHeight(height);
    }

    private void setBase(int base) {
        if (base <= 0)
            throw new IllegalArgumentException("삼각형의 밑변은 0보다 커야합니다.");

        this.base = base;
    }

    private void setHeight(int height) {
        if(height <= 0)
            throw new IllegalArgumentException("삼각형의 높이는 0보다 커야합니다.");

        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("밑변이 " + base + ", 높이가 " + height + "인 삼각형을 그립니다.");
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
