import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();
        System.out.println("Dimension");
        int n = teclado.nextInt();

        objVentas[][] ventasmes = m.registrarVentas(n);
        m.sumarVentas(ventasmes);
    }
}
