package testcase.example;

import org.testng.annotations.Factory;
import org.testng.reporters.EmailableReporter2;

public class FactoryTest extends EmailableReporter2 {
    @Factory
    public Object[] test_factory(){
//        Object[] instances = new Object[1];
//        for (int i =0; i < 1 ; i++){
//            instances[i] = new LoginPageTest(i);
//        }
//        return instances;
        return new Object[]{new LoginPageTest(0)};
    }
}
