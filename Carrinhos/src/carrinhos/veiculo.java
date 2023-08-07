package carrinhos;

public class veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private modelo modelo;

    public veiculo(int ano, String marca, String cor, String placa, modelo modelo) {
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public modelo getModelo() {
        return modelo;
    }
    public void setModelo(modelo modelo) {
        this.modelo = modelo;
    }
}