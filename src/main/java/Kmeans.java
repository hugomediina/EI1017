import java.util.*;

public class Kmeans {
    private int numClusters;
    private int numIterations;
    private Random random;
    private Map<Integer,Centroide> cluster;

    public Kmeans(int numClusters, int numIterations, long seed){
        this.random=new Random(seed);
        this.numClusters=numClusters;
        this.numIterations=numIterations;
    }
    public void train(Table datos){
        Centroide centro=new Centroide();
        for(int i=0;i<numClusters;i++){
            centro.putInCentroides(i,datos.getRowAt(random.nextInt()));
        }
        for(int j=0;j<numIterations;j++){
            for(int k=0;k<datos.getRows().size();k++){
                List<Double> distancia=coordenadas(centro.getInCentroides(j).getData(),datos.getRowAt(k).getData());
            }
        }
    }
    public Integer estimate(List<Double> dato){
        return -1;
    }
    private List<Double> coordenadas(List<Double> centroide,List<Double> punto){
        int M=centroide.size();
        List<Double> resultado = new ArrayList<>();
        for(int i=0;i<M;i++){
            resultado.add((centroide.get(i)+punto.get(i))/M);
        }
        return resultado;
    }
    //HAY QUE REALIZAR UN METODO AUXILIAR PARA ESTIMATE Y PARA TRAIN PERO AUN NO SABEMOS CUAL ES.
}
