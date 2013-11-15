package kata5;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import sun.font.CreatedFontTracker;

public class ChartHistogramViewer<T> implements HistogramViewer<T>{

    @Override
    public void show(Histogram<T> histogram) {
        JFrame frame = new JFrame("Histogram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(createChartPanel(histogram));
        frame.pack();
        frame.setVisible(true);
    }
    
    private ChartPanel createChartPanel(Histogram<T> histogram) {
        ChartPanel panel = new ChartPanel(createChart(histogram));
        return panel;
    }
    
    private JFreeChart createChart(Histogram<T> histogram) {
        JFreeChart chart = ChartFactory.createBarChart("Histogram", 
                "Emails", 
                "Frequency", 
                createdDataSet(histogram));
        return chart;
    }
    
    private CategoryDataset createdDataSet(Histogram<T> histogram) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (T item : histogram.keySet()) {
            dataset.addValue(histogram.get(item), "emails", (String)item);
        }
        return dataset;
    }
    
}
