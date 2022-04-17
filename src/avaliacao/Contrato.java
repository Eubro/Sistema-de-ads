package avaliacao;

import java.util.Calendar;

public class Contrato {
    private int numero;
    private int ano;
    private Cliente cliente;
    private Propaganda[] propagandas;
    private double valor;
    private static int gerador=0;

    public Contrato(Cliente cliente) {
        this.cliente = cliente;
        this.ano = Calendar.getInstance().get(Calendar.YEAR);
        this.numero = gerador+1;
        gerador++;
        this.propagandas = new Propaganda[20];
        this.valor =0;
    }

    public int getNumero() {
        return numero;
    }

    public int getAno() {
        return ano;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Propaganda[] getPropagandas() {
        return propagandas;
    }

   

    public double getValor() {
        
        return valor;
    }
    
     public void adicionarPropagandas(Propaganda propaganda){
        boolean flag = false;
        for(int i = 0;i<this.propagandas.length;i++){
            if(this.propagandas[i] == null){
                this.propagandas[i]= propaganda;
                flag=true;
                this.valor=valor+propaganda.getValor();
                System.out.println("item adicionado ao contrato com sucesso");
                break;
            }
        }
    }
    @Override
     public String toString(){
         String s = "Contrato:" + numero+ "/" + "\n Cliente:" + cliente.toString() + "\n Propaganda" + propagandas;
         for(Propaganda p: propagandas){
             if(p!=null)
                 s=s+p.toString()+"\n";
         }
         return s+"Total do Contrato: R$" +valor;
         
     }
     

   
    
    
    
        
}
