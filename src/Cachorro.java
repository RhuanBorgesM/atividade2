public class Cachorro extends Animal {
        public Cachorro (String nome){
    super(nome);
}
@Override
public void fazerSom() {
    System.out.println(getClass() + "Diz: Au Au!");
}
}