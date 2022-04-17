
package avaliacao;
import java.util.Scanner;
public class Radio extends Propaganda {
    private String transmissao;
    private int tipo;
    
    Scanner gt = new Scanner (System.in);
    
    public Radio(int duracao, String transmissao, int tipo) {
        super(duracao);
        this.transmissao =transmissao;
        this.tipo = tipo;
        super.valor=calcularValor();
        
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double calcularValor(){
        double total = 0;
        switch(tipo){
            case 1:
                total=500*super.duracao;
                break;
            case 2:
                total=300*super.duracao;
                break;
            case 3:
                total = 250*super.duracao;
                break;
        }
        if(transmissao.equalsIgnoreCase("ambas"))
            total = total+100;
        return total;
    }
    
   
  
    
    
    
    
}
