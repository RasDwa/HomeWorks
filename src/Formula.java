import static java.lang.Math.*;

public class Formula {
    public static void main(String[] args) {
        double x = 10000000;
        one(x);
        two(x);
        three(x);
        four(x);
        five(x);
        six(x);
        seven(x);
        eight(x);
        nine(x);
        ten(x);
        eleven(x);
        twenty(x);
        threiteen(x);
        fourteen(x);
        fiveteen(x);
        sixteen(x);
        eighteen(x);
        seventeen(x);
    }

    private static void twenty(double x) {
        double y =(pow(pow(log(x),2),1./3)+tan(cos(PI*x)))*abs(log(x/10.5)+1./3);
        System.out.println("Решенее дванадцчтого "+y);
    }

    private static void seventeen(double x) {
        double y =pow(log10(acos((abs(pow(x,3.4)+2.5*pow(x,1.2) - 0.7))/(pow(pow(E,2.5*x),1./3)))),1./4) +1;
        System.out.println("Решенее семнадцятого "+y);
    }

    private static void eighteen(double x) {
        double y = log(abs(sin(x)))+2*pow(E,x)+2*cos(abs(x))+2;
        System.out.println("Решенее восемнадцятого "+y);
    }

    private static void sixteen(double x) {
        double y = atan((8.3-21.*pow(x,2)-0.8*x)/pow(2.5+1./pow(x,2),1./3));
        System.out.println("Решенее шестнадцятого "+y);
    }

    private static void fiveteen(double x) {
        double y =acos(tan((5.*x)/PI))+pow(x,5.7)/23.;
        System.out.println("Решенее пятнадцятого "+y);
    }

    private static void fourteen(double x) {
        double y =asin(log10(x)/(pow(x,2)+5*x+1.))-pow(x,3.2)/28. ;
        System.out.println("Решенее чотирнадцятого "+y);
    }

    private static void threiteen(double x) {
        double y =(pow(log10(x),1./4)+acos(x+3))*(1./abs(x+2*pow(x,2))) ;
        System.out.println("Решенее тринадцятого "+y);
    }

    private static void eleven(double x) {
        double y =acos(tan(5.*x/PI))+pow(x,3.2)/28.;
        System.out.println("Решенее одинадцятого "+y);
    }

    private static void ten(double x) {
        double y =(abs(7.2-10.*x))/(pow(pow(x,2)+pow(E,x),1./3))*atan((4.*(x/3.)/sqrt(pow(1.1,3)+pow(x,2))));
        System.out.println("Решенее десятого "+y);
    }

    private static void nine(double x) {
        double y =(pow(x,3)/3.)-pow(E,x)*log(abs(pow(1.3,3)+pow(x,3)))+4./3;
        System.out.println("Решенее девятого "+y);
    }

    private static void eight(double x) {
        double y = pow(pow(E,2*x)*sqrt(x)-(x+1./3)/x,1./3)*abs(cos(2.5*x));
        System.out.println("Решенее восьмого "+y);
    }

    private static void seven(double x) {
        double y = (abs(x*log(x)-4)*sqrt(x))*(1./pow(pow(E,4*x-1),1./5));
        System.out.println("Решенее седьмого "+y);
    }

    private static void six(double x) {
        double y = (sqrt(pow(sin(x/2.),3))+pow(pow(E,1.3*x)+pow(E,-1.3*x),1./3))*(1./abs(x+5./2));
        System.out.println("Решенее шестого "+y);
    }

    private static void five(double x) {
        double y = (pow(pow(E,(-2+x)),1./5))*(1./sqrt(pow(x,2)+pow(x,4)+log(abs(x-3.14))));
        System.out.println("Решенее пятого "+y);
    }

    private static void four(double x) {
        double y = log(sqrt(abs(2.-x))+1.2)*(1./(2.+pow(E,-1*x))+pow(2./x,1./3));
        System.out.println("Решенее четвертого "+y);
    }

    private static void three(double x) {
        double y =2.*PI*x-abs(sin(pow(10.5*x,1./2)))-(1./(pow(pow(x,2)+1./7,1./3)));
        System.out.println("Решенее третьего "+y);
    }

    private static void two(double x) {
        double y =(1./3)*(sqrt(abs(sin(x)))*pow(pow(E,0.12*x),1./3));
        System.out.println("Решенее второго "+y);
    }

    private static void one(double x) {
        double y = 1.1*pow(E,-1*x)+abs(cos(sqrt(PI*x))-3./8);
        System.out.println("Решенее первого "+y);
    }
}
