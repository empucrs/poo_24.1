public class PrecoFinal {
    private float valor;

    public PrecoFinal(float v) {
        this.valor = v;
    }

    public float calculaPreco(ICalcula calc) {
        return calc.calcula(this.valor)*1.1f;
    }

}
