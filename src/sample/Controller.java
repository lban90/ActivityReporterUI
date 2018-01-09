package sample;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    public TextArea tAfisare; //text area where are resoults added
    public TextField tNume; //name repository
    public TextField tPrenume;// given name repository
    public TextField tsDay;// start day repository
    public TextField tsMonth;// start month repository
    public TextField tsYear;// start year repository
    public TextField teYear;// end year repository
    public TextField teMonth;// end month repository
    public TextField teDay; //end day repository
    public TextField tAdress;// given adress repository
    public TextField banInchis;
    public TextField filipescuInchis;
    public TextField jinaruInchis;
    public TextField szaboInchis;
    public TextField tripaInchis;
    Chart test = new Chart();
    List<Integer> numarComentarii= new ArrayList<Integer>();
    ReadWrite fisier=new ReadWrite();


    public void Start(ActionEvent actionEvent) throws ParseException, FileNotFoundException {
        List<Date> dates = new ArrayList<Date>();

        String str_date =tsDay.getText()+"\\."+tsMonth.getText()+"\\."+tsYear.getText();     //"01\\.05\\.2014";
        String end_date =teDay.getText()+"\\."+teMonth.getText()+"\\."+teYear.getText();     //"10\\.10\\.2014";

        //tAfisare.appendText(str_date+"||||"+"01\\.05\\.2014"+"+++++++++++++++++"+ end_date+"||||"+"10\\.10\\.2014"  );

        DateFormat formatter ;

        formatter = new SimpleDateFormat("dd\\.MM\\.yy");
        Date  startDate = (Date)formatter.parse(str_date);
        Date  endDate = (Date)formatter.parse(end_date);
        long interval = 24*1000 * 60 * 60; // 1 hour in millis
        long endTime =endDate.getTime() ; // create your endtime here, possibly using Calendar or Date
        long curTime = startDate.getTime();
        while (curTime <= endTime) {
            dates.add(new Date(curTime));
            curTime += interval;
        }

        for(int i=0;i<dates.size();i++) {
            Date lDate = (Date) dates.get(i);
            String ds = formatter.format(lDate);
            int numberOfComments = 0;
            File folder = new File(tAdress.getText());//File("C:\\Users\\a565673\\Documents\\luci\\Rapoarte\\Octombrie\\csvs");
            for (File fileEntry : folder.listFiles()) {
                if (fileEntry.isFile()) {
                    File csvData = new File(tAdress.getText()+"\\" + fileEntry.getName());
                    CSVParser parser = null;

                    String nume =tNume.getText()+", "+tPrenume.getText();                 //"Ban, Lucian";

                    String pattern = String.format("%s \\d{2}:\\d{2}:\\d{2} \\(GMT \\+.:00\\) %s", ds, nume);

                    try {
                        parser = CSVParser.parse(csvData, Charset.forName("UTF-8"), CSVFormat.newFormat(';'));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    for (CSVRecord csvRecord : parser) {
                        int fieldNumber = 0;
                        for (String field : csvRecord) {
                            if (!field.trim().isEmpty()) {
                                Pattern r = Pattern.compile(pattern);
                                Matcher m = r.matcher(field);
                                if (m.find()) {
                                    //System.out.println(m.group());
                                    numberOfComments++;
                                }
                            }
                        }
                    }
                }

            }
            ds = ds.replace("\\", "");
            tAfisare.appendText("In date: " + ds + " there were " + numberOfComments + " comments writed by   "+tNume.getText()+"  "+tPrenume.getText()+"\n");
            numarComentarii.add(numberOfComments);
            //System.out.println("In date: " + ds + " there were " + numberOfComments + " comments");
        }
        tAfisare.appendText("\n"+"\n"+"\n");



        //--------------------------------------------------------------
        test.setDates(dates);

        if(tNume.getText().equals("Filipescu")){
            test.setColleague1("Filipescu Andrei");
            test.setComentariiFilipescu(numarComentarii);

        }
        else if(tNume.getText().equals("Ban")){
            test.setColleague2("Ban Lucian");
            test.setComentariiBan(numarComentarii);

        }
        else if(tNume.getText().equals("Jinaru")){
            test.setColleague3("Jinaru Armand");
            test.setComentariiJinaru(numarComentarii);

        }
        else if(tNume.getText().equals("Szabo")){
            test.setColleague4("Szabo Cristina");
            test.setComentariiSzabo(numarComentarii);

        }
        else if(tNume.getText().equals("Tripa")){
            test.setColleague5("Tripa Raul");
            test.setComentariiTripa(numarComentarii);

        }


        /*List<Integer> listaTest=new ArrayList<Integer>();
        listaTest.add(1);
        listaTest.add(2);
        listaTest.add(3);

        fisier.writeList(listaTest);

        List<String> lista= fisier.read("MyFile.txt");
        System.out.println(weekOfYear);
        */

        numarComentarii=new ArrayList<Integer>();


    }

    public void Chart(ActionEvent actionEvent) throws FileNotFoundException {
        Stage stage= new Stage();
        Stage stage1= new Stage();
        Stage stage2=new Stage();
        Stage stage3=new Stage();
        test.start(stage);
        test.totalTicketsWeeklyReport(stage1);
        test.resolvedTickets(stage2);
        test.sum4WeeksResolvedTickets(stage3);
    }

    public void saveInFile(ActionEvent actionEvent) {
        test.writeResolvedBan();
        test.writeResolvedFilipescu();
        test.writeResolvedJinaru();
        test.writeResolvedTripa();
        test.writeResolvedSzabo();
        test.writeTotalWeeklySum();
        tAfisare.appendText("Datele au fost salvate cu success"+"\n");
    }

    public void addResolvedTickets(ActionEvent actionEvent) {
        test.setInchisFilipescu(Integer.parseInt(filipescuInchis.getText()));
        test.setInchisBan(Integer.parseInt(banInchis.getText()));
        test.setInchisJinaru(Integer.parseInt(jinaruInchis.getText()));
        test.setInchisSzabo(Integer.parseInt(szaboInchis.getText()));
        test.setInchisTripa(Integer.parseInt(tripaInchis.getText()));
        tAfisare.appendText("Datele au fost introduse cu success"+"\n");
    }
}

