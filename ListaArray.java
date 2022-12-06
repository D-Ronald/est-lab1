public class ListaArray implements EstruturaDeDados{
    private int[] elementos;
    private int indice;

    public ListaArray(){
        this.elementos = new int[1000];
        this.indice = 0;

    } 

    @Override
    public boolean insert(int chave) {
        if (indice < elementos.length){
            elementos[indice] = chave;
            indice +=1;
            return true;
            }
        return false;
    }

    @Override
    public boolean delete(int chave) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < indice; i++){
            if (elementos[i] == chave){
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }
  
    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(1);
        System.out.println(r.elementos[0]);
    }
}
