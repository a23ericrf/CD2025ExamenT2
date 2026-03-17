public class Pedido {
    int numero;
    String fecha;
    private Cliente cliente;
    private Producto producto;

    public Pedido(int numero, String fecha, Cliente cliente, Producto producto){
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
    }

    public int getNumero(){
        return  numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public Cliente getCliente(){
        return  cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Producto getProducto(){
        return producto;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }

    public double calcularTotal(){
        return producto.getPrecio();
    }
}
