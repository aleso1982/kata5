package Kata5;

public class HistogramBuilder<T> {
    
    private Histogram<T> histogram;
    
    public void build(T[] items){
        histogram = new Histogram<>();
        for (T item : items) {
            histogram.put(item, getFrequency(item) + 1);
        }
    }

    public Histogram<T> getHistogram() {
        return histogram;
    }
    
    public Integer getFrequency (T item){
        if(histogram.containsKey(item))
            return histogram.get(item);
        return 0;
    }
}