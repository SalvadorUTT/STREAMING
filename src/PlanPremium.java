public class PlanPremium implements PlanSuscripcion{
    public double calcularCosto(int meses){
        return (14*meses)+3;
    }
    public String toString(){
        return "Plan Premium";
    }
}
