public class Triangle {
    // define de variables of the attributes from the class Triangle
    double base;
    double height;
    double sizeLenOne;
    double sizeLenTwo;
    double sizeLenThree;
    public Triangle(double base,double height,double sizeLenOne,double sizeLenTwo, double sizeLenThree){
        this.base=base;
        this.height=height;
        this.sizeLenOne=sizeLenOne;
        this.sizeLenTwo=sizeLenTwo;
        this.sizeLenThree=sizeLenThree;
    }
    public double findArea(){
        double area=(this.base*this.height)/2;
        return area;
    }

    
}
