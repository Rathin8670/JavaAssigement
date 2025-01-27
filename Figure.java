import mypack.Shape;
public class Figure {
    public static void main(String[] args) {
        Shape sp=new Shape();

        int areaRectangle=sp.getArea(10,20);
        int areaSq=sp.getArea(10);
        double areaCircle=sp.getArea(12.9);

        System.out.println(areaCircle+ " "+ areaRectangle+" "+areaSq);

    }
}
