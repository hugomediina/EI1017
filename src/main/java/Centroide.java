import java.util.HashMap;
import java.util.Map;

public class Centroide {
    private Map<Integer,Row> centroides;
    private Integer identificador;
    private Row data;

    public Centroide(){
        centroides=new HashMap<>();
    }
    public Map<Integer, Row> getCentroides() {
        return centroides;
    }
    public void putInCentroides(int i,Row data){
        centroides.put(i,data);
    }

    public Row getInCentroides(int n){
        return centroides.get(n);
    }
}
