import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlataformaStreaming plataforma = new PlataformaStreaming();
        boolean menu = true;

        while (menu){
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Imprimir Reporte");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el correo electronico");
                    String correo = sc.next();
                    System.out.println("Ingrese el numero de meses");
                    int meses = sc.nextInt();
                    System.out.println("Seleccione el plan");
                    System.out.println("1. Plan Basico");
                    System.out.println("2. Plan Estandar");
                    System.out.println("3. Plan Premium");
                    int plan = sc.nextInt();

                    switch (plan){
                        case 1:
                            Usuario usuario = new Usuario(correo,meses,new PlanBasico());
                            plataforma.registrarUsuarios(usuario);
                            System.out.println("Usuario Registrado");
                            break;
                        case 2:
                            Usuario usuario2 = new Usuario(correo,meses,new PlanEstandar());
                            plataforma.registrarUsuarios(usuario2);
                            System.out.println("Usuario Registrado");
                            break;
                        case 3:
                            Usuario usuario3 = new Usuario(correo,meses,new PlanPremium());
                            plataforma.registrarUsuarios(usuario3);
                            System.out.println("Usuario Registrado");
                            break;
                        default:
                            System.out.println("Plan no valido");
                            break;
                    }
                    break;
                case 2:
                    plataforma.imprimirReporte();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    menu = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }


    }
}