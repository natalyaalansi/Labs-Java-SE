import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import static java.lang.Math.*;


public class Plot extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("myPlot");
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("X");
        yAxis.setLabel("Y");
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("My plot");
        //Создаем линию графика
        XYChart.Series series = new XYChart.Series();
        series.setName("y = x*cos(x)");
        lineChart.getData().addAll(series);

        for (double i = -10.0; i<10.0; i=i+0.01)
        {
            series.getData().add(new XYChart.Data(i,(i*cos(i))));
        }

        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        scene.getStylesheets().addAll(getClass().getResource("style.css").toString());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


