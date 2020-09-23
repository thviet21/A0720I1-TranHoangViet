package B2.LoopInJava.BaiTap.ShowFigure;

public class ShowFigure {
    public ShowFigure() {
    }

    public static void main(String[] args) {
        squareTriangle2();
    }

    public static void showRectangle() {
        for(int i = 1; i < 3; ++i) {
            for(int j = 1; j < 7; ++j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public static void squareTriangle() {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public static void squareTriangle2() {
        for(int i = 1; i <= 5; ++i) {
            for(int j = 5; j >= i; --j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}
