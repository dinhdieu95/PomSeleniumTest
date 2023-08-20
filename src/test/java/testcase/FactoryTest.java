package testcase;

import org.testng.annotations.Factory;

public class FactoryTest {
    @Factory
    public Object[] test_factory(){
//        Object[] instances = new Object[1];
//        for (int i =0; i < 1 ; i++){
//            instances[i] = new LoginPageTest(i);
//        }
//        return instances;
        return new Object[]{new LoginPageTest(0), new LoginPageTest(1)};
    }
}
