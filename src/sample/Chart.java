package sample;

import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by A565673 on 26.11.2014.
 */
public class Chart {
    public String colleague1 = "Filipescu Andrei";
    public String colleague2 = "Ban Lucian";
    public String colleague3 = "Jinaru Armand";
    public String colleague4 = "Szabo Cristina";
    public String colleague5 = "Tripa Raul";
    public String ComentariiSaptamanaTotalPrelucrate = "Weekly total comments";
    public String weekOfYear = new SimpleDateFormat("w").format(new java.util.Date());
    public Integer inchisFilipescu = 0;
    public Integer inchisBan = 0;
    public Integer inchisJinaru = 0;
    public Integer inchisSzabo = 0;
    public Integer inchisTripa = 0;
    List<Date> dates = new ArrayList<Date>();
    List<Integer> comentariiFilipescu = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(0);
        add(0);
        add(0);
    }};
    List<Integer> comentariiBan = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(0);
        add(0);
        add(0);
    }};
    List<Integer> comentariiJinaru = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(0);
        add(0);
        add(0);
    }};
    List<Integer> comentariiSzabo = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(0);
        add(0);
        add(0);
    }};
    List<Integer> comentariiTripa = new ArrayList<Integer>() {{
        add(0);
        add(0);
        add(0);
        add(0);
        add(0);
    }};
    ReadWrite reader = new ReadWrite();


    public void setColleague1(String colleague) {
        colleague1 = colleague;
    }

    public void setColleague2(String colleague) {
        colleague2 = colleague;
    }

    public void setColleague3(String colleague) {
        colleague3 = colleague;
    }

    public void setColleague4(String colleague) {
        colleague4 = colleague;
    }

    public void setColleague5(String colleague) {
        colleague5 = colleague;
    }

    public void setDates(List<Date> list) {
        dates = list;
    }

    public void setComentariiFilipescu(List<Integer> list) {
        comentariiFilipescu = list;
    }

    public void setComentariiBan(List<Integer> list) {
        comentariiBan = list;
    }

    public void setComentariiJinaru(List<Integer> list) {
        comentariiJinaru = list;
    }

    public void setComentariiSzabo(List<Integer> list) {
        comentariiSzabo = list;
    }

    public void setComentariiTripa(List<Integer> list) {
        comentariiTripa = list;
    }

    public void setInchisFilipescu(Integer x) {
        inchisFilipescu = x;
    }

    public void setInchisBan(Integer x) {
        inchisBan = x;
    }

    public void setInchisJinaru(Integer x) {
        inchisJinaru = x;
    }

    public void setInchisSzabo(Integer x) {
        inchisSzabo = x;
    }

    public void setInchisTripa(Integer x) {
        inchisTripa = x;
    }


    public void start(Stage stage) {
        stage.setTitle("Weekly Report");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Number of comments");
        xAxis.setLabel("Nume");
        yAxis.setLabel("Numar Tichete");


        XYChart.Series series1 = new XYChart.Series();
        series1.setName(String.valueOf(dates.get(0)));
        series1.getData().add(new XYChart.Data(colleague1, Integer.valueOf(comentariiFilipescu.get(0))));
        series1.getData().add(new XYChart.Data(colleague2, Integer.valueOf(comentariiBan.get(0))));
        series1.getData().add(new XYChart.Data(colleague3, Integer.valueOf(comentariiJinaru.get(0))));
        series1.getData().add(new XYChart.Data(colleague4, Integer.valueOf(comentariiSzabo.get(0))));
        series1.getData().add(new XYChart.Data(colleague5, Integer.valueOf(comentariiTripa.get(0))));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName(String.valueOf(dates.get(1)));
        series2.getData().add(new XYChart.Data(colleague1, Integer.valueOf(comentariiFilipescu.get(1))));
        series2.getData().add(new XYChart.Data(colleague2, Integer.valueOf(comentariiBan.get(1))));
        series2.getData().add(new XYChart.Data(colleague3, Integer.valueOf(comentariiJinaru.get(1))));
        series2.getData().add(new XYChart.Data(colleague4, Integer.valueOf(comentariiSzabo.get(1))));
        series2.getData().add(new XYChart.Data(colleague5, Integer.valueOf(comentariiTripa.get(1))));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName(String.valueOf(dates.get(2)));
        series3.getData().add(new XYChart.Data(colleague1, Integer.valueOf(comentariiFilipescu.get(2))));
        series3.getData().add(new XYChart.Data(colleague2, Integer.valueOf(comentariiBan.get(2))));
        series3.getData().add(new XYChart.Data(colleague3, Integer.valueOf(comentariiJinaru.get(2))));
        series3.getData().add(new XYChart.Data(colleague4, Integer.valueOf(comentariiSzabo.get(2))));
        series3.getData().add(new XYChart.Data(colleague5, Integer.valueOf(comentariiTripa.get(2))));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName(String.valueOf(dates.get(3)));
        series4.getData().add(new XYChart.Data(colleague1, Integer.valueOf(comentariiFilipescu.get(3))));
        series4.getData().add(new XYChart.Data(colleague2, Integer.valueOf(comentariiBan.get(3))));
        series4.getData().add(new XYChart.Data(colleague3, Integer.valueOf(comentariiJinaru.get(3))));
        series4.getData().add(new XYChart.Data(colleague4, Integer.valueOf(comentariiSzabo.get(3))));
        series4.getData().add(new XYChart.Data(colleague5, Integer.valueOf(comentariiTripa.get(3))));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName(String.valueOf(dates.get(4)));
        series5.getData().add(new XYChart.Data(colleague1, Integer.valueOf(comentariiFilipescu.get(4))));
        series5.getData().add(new XYChart.Data(colleague2, Integer.valueOf(comentariiBan.get(4))));
        series5.getData().add(new XYChart.Data(colleague3, Integer.valueOf(comentariiJinaru.get(4))));
        series5.getData().add(new XYChart.Data(colleague4, Integer.valueOf(comentariiSzabo.get(4))));
        series5.getData().add(new XYChart.Data(colleague5, Integer.valueOf(comentariiTripa.get(4))));

        Scene scene = new Scene(bc, 1200, 768);
        bc.getData().addAll(series1, series2, series3, series4, series5);
        stage.setScene(scene);
        stage.show();
    }


    public void totalTicketsWeeklyReport(Stage stage) throws FileNotFoundException {

        Integer sumaTicheteLuna = Integer.valueOf(comentariiFilipescu.get(0)) + Integer.valueOf(comentariiBan.get(0)) + Integer.valueOf(comentariiJinaru.get(0)) + Integer.valueOf(comentariiSzabo.get(0)) + Integer.valueOf(comentariiTripa.get(0)) +
                Integer.valueOf(comentariiFilipescu.get(1)) + Integer.valueOf(comentariiBan.get(1)) + Integer.valueOf(comentariiJinaru.get(1)) + Integer.valueOf(comentariiSzabo.get(1)) + Integer.valueOf(comentariiTripa.get(1)) +
                Integer.valueOf(comentariiFilipescu.get(2)) + Integer.valueOf(comentariiBan.get(2)) + Integer.valueOf(comentariiJinaru.get(2)) + Integer.valueOf(comentariiSzabo.get(2)) + Integer.valueOf(comentariiTripa.get(2)) +
                Integer.valueOf(comentariiFilipescu.get(3)) + Integer.valueOf(comentariiBan.get(3)) + Integer.valueOf(comentariiJinaru.get(3)) + Integer.valueOf(comentariiSzabo.get(3)) + Integer.valueOf(comentariiTripa.get(3)) +
                Integer.valueOf(comentariiFilipescu.get(4)) + Integer.valueOf(comentariiBan.get(4)) + Integer.valueOf(comentariiJinaru.get(4)) + Integer.valueOf(comentariiSzabo.get(4)) + Integer.valueOf(comentariiTripa.get(4));
        List<String> lastWeeks = reader.read("weeklySum.txt");

        stage.setTitle("Total Month Report");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Number of comments");
        xAxis.setLabel("Week");
        yAxis.setLabel("Number of comments");


        XYChart.Series series1 = new XYChart.Series();
        series1.setName(String.valueOf(Integer.parseInt(weekOfYear) - 4));
        series1.getData().add(new XYChart.Data(ComentariiSaptamanaTotalPrelucrate, Integer.parseInt(lastWeeks.get(lastWeeks.size() - 3))));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName(String.valueOf(Integer.parseInt(weekOfYear) - 3));
        series2.getData().add(new XYChart.Data(ComentariiSaptamanaTotalPrelucrate, Integer.parseInt(lastWeeks.get(lastWeeks.size() - 2))));


        XYChart.Series series3 = new XYChart.Series();
        series3.setName(String.valueOf(Integer.parseInt(weekOfYear) - 2));
        series3.getData().add(new XYChart.Data(ComentariiSaptamanaTotalPrelucrate, Integer.parseInt(lastWeeks.get(lastWeeks.size() - 1))));


        XYChart.Series series4 = new XYChart.Series();
        series4.setName(String.valueOf(Integer.parseInt(weekOfYear) - 1));
        series4.getData().add(new XYChart.Data(ComentariiSaptamanaTotalPrelucrate, sumaTicheteLuna));


        Scene scene = new Scene(bc, 1200, 768);
        bc.getData().addAll(series1, series2, series3, series4);
        stage.setScene(scene);
        stage.show();
    }


    public void resolvedTickets(Stage stage){

        stage.setTitle("Total Resolved Report");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Number of resolved tickets");
        xAxis.setLabel("Week");
        yAxis.setLabel("Number of resolved tickets");


        XYChart.Series series1 = new XYChart.Series();
        series1.setName(String.valueOf(Integer.parseInt(weekOfYear) - 1));
        series1.getData().add(new XYChart.Data(colleague1, inchisFilipescu));
        series1.getData().add(new XYChart.Data(colleague2, inchisBan));
        series1.getData().add(new XYChart.Data(colleague3, inchisJinaru));
        series1.getData().add(new XYChart.Data(colleague4, inchisSzabo));
        series1.getData().add(new XYChart.Data(colleague5, inchisTripa));

        Scene scene = new Scene(bc, 1200, 768);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();

    }

    public void sum4WeeksResolvedTickets(Stage stage) throws FileNotFoundException {
        List<String> filipescuLastWeeks = reader.read("ResolvedFilipescu.txt");
        List<String> banLastWeeks = reader.read("ResolvedBan.txt");
        List<String> jinaruLastWeeks = reader.read("ResolvedJinaru.txt");
        List<String> tripaLastWeeks = reader.read("ResolvedTripa.txt");
        List<String> szaboLastWeeks = reader.read("ResolvedSzabo.txt");

        stage.setTitle("Sum of resolved tickets");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc =
                new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Number of resolved tickets");
        xAxis.setLabel("The sum of last 4 weeks");
        yAxis.setLabel("Number of resolved tickets");


        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Sum of last 4 weeks resolved tickets");
        series1.getData().add(new XYChart.Data(colleague1, (Integer.parseInt(filipescuLastWeeks.get(filipescuLastWeeks.size()-2))+Integer.parseInt(filipescuLastWeeks.get(filipescuLastWeeks.size()-1))+Integer.parseInt(filipescuLastWeeks.get(filipescuLastWeeks.size()))+inchisFilipescu)));
        series1.getData().add(new XYChart.Data(colleague2, (Integer.parseInt(banLastWeeks.get(banLastWeeks.size()-2))+Integer.parseInt(banLastWeeks.get(banLastWeeks.size()-1))+Integer.parseInt(banLastWeeks.get(banLastWeeks.size()))+inchisBan)));
        series1.getData().add(new XYChart.Data(colleague3, (Integer.parseInt(jinaruLastWeeks.get(jinaruLastWeeks.size()-2))+Integer.parseInt(jinaruLastWeeks.get(jinaruLastWeeks.size()-1))+Integer.parseInt(jinaruLastWeeks.get(jinaruLastWeeks.size()))+inchisJinaru)));
        series1.getData().add(new XYChart.Data(colleague4, (Integer.parseInt(szaboLastWeeks.get(szaboLastWeeks.size()-2))+Integer.parseInt(szaboLastWeeks.get(szaboLastWeeks.size()-1))+Integer.parseInt(szaboLastWeeks.get(szaboLastWeeks.size()))+inchisSzabo)));
        series1.getData().add(new XYChart.Data(colleague5, (Integer.parseInt(tripaLastWeeks.get(tripaLastWeeks.size()-2))+Integer.parseInt(tripaLastWeeks.get(tripaLastWeeks.size()-1))+Integer.parseInt(tripaLastWeeks.get(tripaLastWeeks.size()))+inchisTripa)));

        Scene scene = new Scene(bc, 1200, 768);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();


    }

    public void writeResolvedFilipescu(){
        reader.write("ResolvedFilipescu.txt",String.valueOf(inchisFilipescu));
    }

    public void writeResolvedBan(){
        reader.write("ResolvedBan.txt",String.valueOf(inchisBan));
    }

    public void writeResolvedJinaru(){
        reader.write("ResolvedJinaru.txt",String.valueOf(inchisJinaru));
    }

    public void writeResolvedSzabo(){
        reader.write("ResolvedSzabo.txt",String.valueOf(inchisSzabo));
    }

    public void writeResolvedTripa(){
        reader.write("ResolvedTripa.txt",String.valueOf(inchisTripa));
    }

    public void writeTotalWeeklySum() {

        reader.write("weeklySum.txt",String.valueOf(Integer.valueOf(comentariiFilipescu.get(0)) + Integer.valueOf(comentariiBan.get(0)) + Integer.valueOf(comentariiJinaru.get(0)) + Integer.valueOf(comentariiSzabo.get(0)) + Integer.valueOf(comentariiTripa.get(0)) +
            Integer.valueOf(comentariiFilipescu.get(1)) + Integer.valueOf(comentariiBan.get(1)) + Integer.valueOf(comentariiJinaru.get(1)) + Integer.valueOf(comentariiSzabo.get(1)) + Integer.valueOf(comentariiTripa.get(1)) +
            Integer.valueOf(comentariiFilipescu.get(2)) + Integer.valueOf(comentariiBan.get(2)) + Integer.valueOf(comentariiJinaru.get(2)) + Integer.valueOf(comentariiSzabo.get(2)) + Integer.valueOf(comentariiTripa.get(2)) +
            Integer.valueOf(comentariiFilipescu.get(3)) + Integer.valueOf(comentariiBan.get(3)) + Integer.valueOf(comentariiJinaru.get(3)) + Integer.valueOf(comentariiSzabo.get(3)) + Integer.valueOf(comentariiTripa.get(3)) +
            Integer.valueOf(comentariiFilipescu.get(4)) + Integer.valueOf(comentariiBan.get(4)) + Integer.valueOf(comentariiJinaru.get(4)) + Integer.valueOf(comentariiSzabo.get(4)) + Integer.valueOf(comentariiTripa.get(4))));
    }
}
