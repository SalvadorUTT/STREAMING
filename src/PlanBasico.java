public class PlanBasico implements PlanSuscripcion {
    @Override
    public double calcularCosto(int meses){
        return 5*meses;
    }

    @Override
    public String toString(){
        return "Plan Basico";
    }
}
