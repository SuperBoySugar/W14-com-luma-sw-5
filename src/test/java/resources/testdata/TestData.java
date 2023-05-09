package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Register details")
    public Object[][] getData(){
        Object[][]data = new Object[][]{
                {"Henry","Smith", },

        };
        return data;
    }

}
