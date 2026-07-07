public class PlanEstandar implements PlanSuscripcion {
    @Override
    public double calcularCosto(int meses){
        return 9*meses;
    }
    @Override
    public String toString(){
        return "Plan Estandar";
    }
}
