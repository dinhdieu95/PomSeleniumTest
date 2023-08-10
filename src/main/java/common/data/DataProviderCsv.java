package common.data;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataProviderCsv {
    @DataProvider(name ="loginDataCsv")
    public static Object[][] getLoginDataCsv() {
        try {
            return ReadfromCSV("/file/login/login.csv");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static String[][] ReadfromCSV(String path) throws InterruptedException {

        int count =0;
        String[] data= null;
        String returnObj[][] = null;

        //System.out.println(System.getProperty("user.dir"));
        String csvFile = System.getProperty("user.dir")+ "/src/test/resources" + path;

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> content = new ArrayList<String>();

        try {

            //this loop is pseudo code
            br = new BufferedReader(new FileReader(csvFile));
            int datalength = 0;
            int listsize =0;;

            while ((line = br.readLine()) != null) {
                // use comma as separator

                content.add(line);
            }
            System.out.println(content);

            listsize = content.size();
            datalength = content.get(0).split(cvsSplitBy).length;
            returnObj = new String[listsize][datalength];

            for (int i = 0; i<listsize; i++) {

                data = content.get(i).split(cvsSplitBy);
                for (int j=0; j< datalength ; j++) {
                    returnObj[i][j] = data[j];

                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Done");
        return returnObj;

    }}

