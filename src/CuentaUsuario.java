public abstract class CuentaUsuario {
    private String CorreoElectronico;
    private int mesesActivos;
    private PlanSuscripcion plan;

    public CuentaUsuario(String CorreoElectronico, int mesesActivos, PlanSuscripcion plan) {
        this.CorreoElectronico = CorreoElectronico;
        this.mesesActivos = mesesActivos;
        this.plan = plan;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public int getMesesActivos() {
        return mesesActivos;
    }

    public double obtenerTotalapagar() {
        return plan.calcularCosto(mesesActivos);
    }
    public PlanSuscripcion getPlan() {
        return plan;
    }

}

