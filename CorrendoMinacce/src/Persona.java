public class Persona implements Runnable{
    private String nome;

    public Persona(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(nome + " " + i + " metri!");
        }
        System.out.println(nome + " è arrivato!");
    }
}
