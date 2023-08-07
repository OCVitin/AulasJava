package carrinhos;

public class seguro {
    private float valor;
    private boolean vigencia;
    private cliente proprietario;
    private cliente[] assegClient;
    private veiculo[] assegVeic;

    public seguro(float valor, boolean vigencia, cliente proprietario, cliente[] assegurado) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public boolean isVigencia() {
        return vigencia;
    }
    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    public cliente getProprietario() {
        return proprietario;
    }
    public void setProprietario(cliente proprietario) {
        this.proprietario = proprietario;
    }
    public cliente[] getAsseguradoCliente() {
        return assegClient;
    }
    public void setAsseguradoCliente(cliente[] assegurado) {
        this.assegClient = assegurado;
    }
    public veiculo[] getAssegVeic() {
        return assegVeic;
    }
    public void setAssegVeic(veiculo[] assegVeic) {
        this.assegVeic = assegVeic;
    }
}