
package BT2;


public class Hinh {
    private double dt;
    Hinh(){}
    Hinh(double dt){
        this.dt = dt;
    }

    public double getDt() {
        return dt;
    }

    public void setDt(double dt) {
        this.dt = dt;
    }
    
    public double dienTich(){
        double dt = 0;
        return dt;
    }

    @Override
    public String toString() {
        return "Hinh{" + "dt=" + dt + '}';
    }
    
}