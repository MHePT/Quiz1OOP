package quiz1;

public class Triangle {
    private double side1, side2, side3;

        Triangle() {
            side1 = 1.0;
            side2 = 1.0;
            side3 = 1.0;
        }

        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        double GetSide1() {
            return side1;
        }

        double GetSide2() {
            return side2;
        }

        double GetSide3() {
            return side3;
        }

        void SetSide1(int side1) {
            this.side1 = side1;
        }

        void SetSide2(int side2) {
            this.side2 = side2;
        }

        void SetSide3(int side3) {
            this.side3 = side3;
        }

        double GetArea() {
            if(sidenonnegative()){
            double s = GetPerimeter() * 0.5;
            return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
            }
            return 0;
        }

        double GetPerimeter() {
            if(sidenonnegative())
            return side1 + side2 + side3;
            return 0;
        }
        
        boolean sidenonnegative(){
            if(side1>0&&side2>0&&side3>0)
                return true;
            return false;
        }
    
}
