import java.time.LocalDateTime;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Ebook> ebooks;
    private double valorTotal;
    private LocalDateTime dataCompra;


    public CarrinhoDeCompras() {
        ebooks = new ArrayList<>();
        valorTotal = 0.0;
        dataCompra = LocalDateTime.now();
    }
    public double getValorTotal() {
        return valorTotal;
    }

    // Setter para o atributo valorTotal
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Getter para o atributo dataCompra
    public LocalDateTime getDataCompra() {
        return dataCompra;
    }

    // Setter para o atributo dataCompra
    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void addAoCarrinho(Ebook ebook) {
        ebooks.add(ebook);
        valorTotal += ebook.getPreco();
    }

    public void removerDoCarrinho(Ebook ebook) {
        if (ebooks.contains(ebook)) {
            ebooks.remove(ebook);
            valorTotal -= ebook.getPreco();
        }
    }

    public ArrayList<Ebook> realizarPagamento() {
        dataCompra = LocalDateTime.now();
        return ebooks;
    }
}