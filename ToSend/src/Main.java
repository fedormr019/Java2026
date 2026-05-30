<<<<<<< Updated upstream
=======
enum Season {
    WINTER(-10), SPRING(10), SUMMER(25), AUTUMN(8);

    private int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }
}

class Main {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s + " средняя температура: " + s.getAverageTemp());
    }
}

enum Planet {
    MERCURY(3.3e23, 2.44e6),
    VENUS(4.87e24, 6.05e6),
    EARTH(5.98e24, 6.38e6),
    MARS(6.42e23, 3.40e6);

    private double mass;
    private double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return 6.67e-11 * mass / (radius * radius);
    }

    public String getInfo() {
        return name() + ": масса = " + mass + " кг, радиус = " + radius + " м";
    }
}

class Main {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p.getInfo());
            System.out.println("  сила тяжести: " + p.getSurfaceGravity() + " м/с2");
        }

        Planet earth = Planet.EARTH;
        System.out.println("\nЗемля: " + earth.ordinal() + "-я планета от Солнца");
    }
}
>>>>>>> Stashed changes
