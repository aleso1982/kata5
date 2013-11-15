package kata5;

public class Kata5 {

    public static void main(String[] args) {
        MockMailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>();
        builder.build(loader.load());
        HistogramViewer<Mail> viewer = new HistogramViewer<>();
        viewer.show(builder.getHistogram());
    }
}
