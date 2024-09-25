package entities;

public class outsourcedEmployee extends Employee{
    private Double additionalCharge;

    public outsourcedEmployee(){
        super();
    }

    public outsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payments(){
        return super.payments() + additionalCharge * 1.1;
    }
}
