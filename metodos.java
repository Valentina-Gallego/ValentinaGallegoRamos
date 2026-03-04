import java.util.Scanner;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    public objVentas[][] registrarVentas(int n) {

        objVentas[][] P = new objVentas[n][n];

        System.out.print("Ingrese mes: ");
        String mes = teclado.next();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Ingrese venta: " + "(" + i + ")" + "(" + j + ")" + ": ");
                int venta = teclado.nextInt();

                P[i][j] = new objVentas(venta, mes);
            }

        }
        return P;
    }

    public void sumarVentas(objVentas[][] P) {

        int suma = 0;

        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P.length; j++) {

                suma += P[i][j].getNumVentas();
            }
        }

        System.out.println("Cantidad de ventas del mes: " + suma);
    }

}
