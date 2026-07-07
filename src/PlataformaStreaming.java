import java.util.ArrayList;

public class PlataformaStreaming {
    private ArrayList<CuentaUsuario> cuentas;
    public PlataformaStreaming (){
        cuentas = new ArrayList<>();
    }
    public void registrarUsuarios(CuentaUsuario){
        cuentas.add(Usuario);
    }
    public void imprimirReporte(){
        double total = 0;

        System.out.println("=====DATOS=====");
        for (CuentaUsuario u: cuentas){
            double pago = u.obtenerTotalapagar();

            System.out.println("CORREO :  "  + u.getCorreoElectronico());
            System.out.println("MESES DE SUSCRIPCION :" + u.getMesesActivos());
            System.out.println("PAGO TOTAL :  $ " + pago);
            System.out.println("=========================");
            total += pago;
        }
        System.out.println("MONTO TOTAL REUNIDO:  $" + total);
    }
}



