    public class Teste {

        public static void main(String[] args) {
    
            Pessoa[] arrei = {
                new Pessoa(4, "Renato", 55),
                new Pessoa(1, "Coudet", 48),
                new Pessoa(2, "Valencia", 33),
                new Pessoa(3, "Suarez", 36),
            };
    
            System.out.println("Array Original: ");
    
            PessoaMergeSort.imprimirArray(arrei);
    
            PessoaMergeSort.mergeSort(arrei, 0, arrei.length - 1);
    
            System.out.println("\nArray Ordenado: ");
            PessoaMergeSort.imprimirArray(arrei);
    
        }

        
}
