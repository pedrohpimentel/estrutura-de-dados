package TAD;

public class Numero {

    public Numero(){
        this.valor = 0;
    }

    private float valor;

    public float getValor(){
        return valor;
    }

    public void setValor(float valor){
        if (valor < 0){
            valor = 0;
            System.out.println("Valor menor que zero -> corrigido para zero");
        } else if (valor > 40 && valor < 60) {
            if (valor < 50){
                valor = 40;
                System.out.println("Valor no intervalo não suportado -> corrigido para 40");
            }
            else {
                valor = 60;
                System.out.println("Valor no intervalo não suportado -> corrigido para 60");
            }
        } else if (valor > 100) {
            valor = 100;
            System.out.println("Valor maior que 100 -> corrigido para 100");
        }
        this.valor = valor;
        System.out.println("Novo valor atribuído.");
    }
}
