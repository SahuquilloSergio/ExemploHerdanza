package exemplo_herdanza;

public class Persoa {
 
    private String nome;
    public String apelido;

  
    private int idade;
    
    public Persoa(String no, String ap, int id){
        nome=no;
        apelido=ap;
        idade=id;
    }
    
    public String getNome(){
//        System.out.println("Nome da persoa:"+nome);
        return nome;
}
    
    public String getApelido(){
//        System.out.println("Apelido da persoa:"+apelido);
        return apelido;
    }
    public int getIdade(){
//        System.out.println("Idade da persoa:"+idade);
        return idade;
    }
    
      @Override
    public String toString() {
        return "Persoa:\n" + "nome=" + nome + "\napelido=" + apelido + "\nidade=" + idade;
    }
}
