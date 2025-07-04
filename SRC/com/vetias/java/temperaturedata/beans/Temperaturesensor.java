
public class Temperaturesensor implements Sensor {
    private float temperature;
    public static void main(String[] args) {
        
    }
    
    public Temperaturesensor(float atemperature)
     {
    temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }

 }
    

