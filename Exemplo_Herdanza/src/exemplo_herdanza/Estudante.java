package exemplo_herdanza;

public class Estudante extends Persoa{
    private String codigo;
    private int notaFinal;
    
    public Estudante(String no, String ap, int id, String co, int not){
        super(no,ap,id);
        codigo=co;
        notaFinal=not;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getNota(){
        return notaFinal;
    }
    public void amosar(){
        System.out.println("Nome: "+getNome()+"\n"+"Apelido: "+apelido+"\n"
        +"Idade: "+super.getIdade()+"\n"+"Codigo: "+codigo+"\n"+"Nota Final: "+notaFinal);
    }

    @Override
    public String toString() {
        return "Estudante\n" + "codigo=" + codigo + "\nnotaFinal=" + notaFinal +"\n"+ super.toString();
    }



}


