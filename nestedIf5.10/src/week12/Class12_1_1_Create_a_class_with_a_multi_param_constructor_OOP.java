package week12;

public class Class12_1_1_Create_a_class_with_a_multi_param_constructor_OOP {
    class Investment{
        public String investmentId;
        public String investmentName;
        public double initialInvestment;
        public double currentValue;
        public boolean isProfitable;

        public Investment(){

        }
        public Investment(String id, String name, double initial, double current, boolean isProfitableParam) {

            investmentId=id;
            investmentName=name;
            initialInvestment=initial;
            currentValue=current;
            isProfitable=isProfitableParam;
        }
    }
}
