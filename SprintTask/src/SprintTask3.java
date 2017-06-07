public class SprintTask3<T> {
        
    
    public <T> SprintTask2 objParameter (T objParameter){
        return (SprintTask2) objParameter;
    }
    
    public static void main(String[] args){
        SprintTask3 obj = new SprintTask3();
        
        obj.objParameter(new SprintTask2<>()).metodeNative("A", "B");
    }
}
