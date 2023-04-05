package lesson2.shape;

public class FigureTester {
    public static void main(String[] args) {

        Figure [] figures = new Figure[10];
        figures[0] = new Circle(15);
        figures[1] = new Circle(20);
        figures[2] = new Rectanlge(10,15);
        figures[3] = new Rectanlge(20,25);
        figures[4] = new Triangle (12 ,15 ,20);
        figures[5] = new Triangle (20, 30 ,40);

        System.out.println("---------------------------------------");
        System.out.println("Площадь Круга нр.1 = " + (int)figures[0].area());
        System.out.println("Периметр Круга нр.1 = " + (int)figures[0].perimeter());
        System.out.println("---------------------------------------");
        System.out.println("Площадь Круга нр.2 = " + (int)figures[1].area());
        System.out.println("Периметр Круга нр.2 = " + (int)figures[1].perimeter());
        System.out.println("---------------------------------------");
        System.out.println("Площадь Прямоугольника нр.1 = " +(int) figures[2].area());
        System.out.println("Периметр Прямоугольника нр.1 = " + (int)figures[2].perimeter());
        System.out.println("---------------------------------------");
        System.out.println("Площадь Прямоугольника нр.2 = " +(int) figures[3].area());
        System.out.println("Периметр Прямоугольника нр.2 = " + (int)figures[3].perimeter());
        System.out.println("---------------------------------------");
        System.out.println("Площадь Треугольника нр.1 = " +(int)figures[4].area());
        System.out.println("Периметр Треугольника нр.1 = " + (int)figures[4].perimeter());
        System.out.println("---------------------------------------");
        System.out.println("Площадь Треугольника нр.2 = " +(int) figures[5].area());
        System.out.println("Периметр Треугольника нр.2 = " +(int)figures[5].perimeter());

        System.out.println("---------------------------------------");

        double sumArea = 0;
        for(int i = 0; i < figures.length; i++)
        if (figures[i] != null) {
            sumArea += figures[i].area();
        }
        System.out.println("Сумма площади всех фигур: " + (int)sumArea);
        System.out.println("---------------------------------------");

//        public static double perimeter(Figure [] figures)
//        {
//            double result = 0;
//            for(int i = 0; i < figures.length; i++)
//            {
//                if(figures[i] != null)
//                    result += figures[i].area();
//            }
//            return result;
//        }

//        public static double perimeter(Figure [] figures)
//        {
//            double result = 0;
//            for(int i = 0; i < figures.length; i++)
//            {
//                if(figures[i] != null)
//                    result += figures[i].perimeter();
//            }
//            return result;
//        }


        double sumPerimeter = 0;
        for(int i = 0; i < figures.length; i++)
            if (figures[i] != null) {
                sumPerimeter += figures[i].perimeter();
            }
        System.out.println("Сумма периметра всех фигур: " + (int)sumPerimeter);
        System.out.println("---------------------------------------");
    }
}



