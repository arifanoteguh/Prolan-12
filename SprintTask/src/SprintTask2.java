public class SprintTask2<T> {
    public static <T> void metodeGenPertama(T metodeGenPertama){
        System.out.println("1. "+metodeGenPertama);
    }
    
    public static <T> void metodeGenKedua(T metodeGenKedua){
        System.out.println("2. "+metodeGenKedua);
    }
    
    public void metodeNative(T x, T z){
        System.out.println(x+" dan "+z);
    }
    
    public static void main(String[] args){
        SprintTask2 obj = new SprintTask2();
        
        metodeGenPertama("A");
        metodeGenKedua("B");
        obj.metodeNative("A", "B");
    }
}
