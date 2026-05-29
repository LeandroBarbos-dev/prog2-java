package exemplos.exp16;

public class MyClass {
    public static void main(String[] args) throws Exception {
        int[] vet = {1,2,3,4,5};
       
        while(true){
       
            try {
                for(int i=0;i<6;i++)
                    System.out.print(vet[i] + " ");
            }  
       
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: tentou acessar uma posicao que nao existe " + e);
            }

        }
    }
}

