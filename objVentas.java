public class objVentas {
    private int numVentas;
    private String mes;
    public objVentas() {
    }
    public objVentas(int numVentas, String mes) {
        this.numVentas = numVentas;
        this.mes = mes;
    }
    public int getNumVentas() {
        return numVentas;
    }
    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    @Override
    public String toString() {
        return "objVentas [numVentas=" + numVentas + ", mes=" + mes + "]";
    }

    
}
