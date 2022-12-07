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
        if (search(chave) == true){
            for (int i = 0; i < indice; i ++){
                if (elementos[i] == chave){
                    elementos[i] = 0;
                    for (int j = i; j < indice; j++){
                        elementos[j] = elementos[j+1];
                    }
                }
            }
            return true;
        }
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
        for (int i = 0; i < indice; i++){
            if (elementos[i] == chave){
                return elementos[i+1];
            }
        }
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        for (int i = 0; i < indice; i++){
            if (elementos[i] == chave){
                return elementos[i-1];
            }
        }
        return 0;
    }
  
    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(100);
        r.insert(25);
        r.insert(1);
        r.insert(60);
        System.out.println(r.elementos[0]);
        System.out.println(r.elementos[1]);
        System.out.println(r.elementos[2]);
        System.out.println(r.elementos[3]);
        System.out.println(r.search(100));
        System.out.println(r.delete(100));
        System.out.println(r.search(100));
        System.out.println(r.elementos[0]);
        System.out.println(r.elementos[1]);
        System.out.println(r.elementos[2]);
        System.out.println(r.elementos[3]);
    }
}