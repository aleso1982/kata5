package kata5;

public class Kata5 {

    public static void main(String[] args) {
        MockMailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(loader.load());
        Histogram<String> histogram = builder.build(new AttributeExtractor<Mail, String>() {

            @Override
            public String extract(Mail entity) {
                return entity.getDomain();
            }
        });
        HistogramViewer<String> viewer = new HistogramViewer<>();
        viewer.show(histogram);
    }
}
