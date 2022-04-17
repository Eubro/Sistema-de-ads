package avaliacao;
public class Propaganda {
    protected int codigo ;
    protected int duracao ;
    protected double valor;
    
    private static int gerador=0;
    
    public Propaganda(int duracao) {
        this.duracao = duracao;
        this.codigo = gerador +1;
        gerador++;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }
    
    

    @Override
    public String toString() {
        return "Propaganda{" + "codigo=" + codigo + ", duracao=" + duracao + ", valor=" + valor + '}';
    }
}

    