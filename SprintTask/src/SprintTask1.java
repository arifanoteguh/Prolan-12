public class SprintTask1<T> {
    public static <T> void metodePertama(T metodePertama){
        System.out.println("1. "+metodePertama);
    }
    
    public static <T> void metodeKedua(T metodeKedua){
        System.out.println("2. "+metodeKedua);
    }
    
    public static <T> void metodeKetiga(T metodeKetiga){
        System.out.println("3. "+metodeKetiga);
    }
    
    public static <T,N> void metodeKeempat(T x, N y){
        System.out.println("4. "+x+" dan "+y);
    }

    public static void main (String[]args){
        metodePertama("Pertama");
        metodeKedua("Kedua");
        metodeKetiga("Ketiga");
        metodeKeempat("ke-4","Keempat");
    }
}