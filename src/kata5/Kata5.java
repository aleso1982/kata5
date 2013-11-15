package kata5;

public class Kata5 {

    public static void main(String[] args) {
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(new MockMailLoader().load());
        Histogram<String> histogram = builder.build(new AttributeExtractor<Mail, String>() {

            @Override
            public String extract(Mail entity) {
                return entity.getDomain();
            }
        });
        HistogramViewer<String> viewer = new ChartHistogramViewer<>();
        viewer.show(histogram);
    }
}
