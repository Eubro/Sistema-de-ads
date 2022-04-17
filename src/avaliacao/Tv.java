
package avaliacao;

public class Tv extends Propaganda{
    private String horario;
    private int tipo;

    public Tv(String horario, int tipo, int duracao) {
        super(duracao);
        this.horario = horario;
        this.tipo = tipo;
        super.valor=calcularValor();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public double calcularValor(){
        double total =0;
        switch(tipo){
            case 1:
                total =500*super.duracao;
                break;
            case 2:
                total=300*super.duracao;
                break;
        }
        if(horario.equalsIgnoreCase("dia"))
            total = total+100;
        else
            if(horario.equalsIgnoreCase("nobre"))
                    total = total+200;
        else
                total = total+50;
        return total;
    }

    @Override
    public String toString() {
        String str=super.toString()+ "\n\tTipo: Tv \n\tHorario:"+ horario+ "Tipo de propaganda:";
        switch(tipo){
            case 1:
                str+= "Merchandising";
                break;
            case 2:
                str+="Comercial";
                break;
        }
        return str;
    }
    
    
    
    
    
    
}
