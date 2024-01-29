package week10;

public class CLass10_5_3_Extract_Double_Number_Wrapper_Class {
    public static void main(String[] args) {
        String companyInfo = "Apple,127083.32,329.10,982";
        String delimiter = "%";
        double ans =  extractDoubleNumber(companyInfo,delimiter);

        System.out.println(ans);

    }

    public static Double extractDoubleNumber(String companyInfo, String delimiter) {

        int indexFirstDelimiter = companyInfo.indexOf(delimiter)+1;

        if (indexFirstDelimiter == 0) {
            return 0.0;
        }

        int indexSecondDelimiter = companyInfo.indexOf(delimiter, indexFirstDelimiter);

        double answer = Double.parseDouble(companyInfo.substring(indexFirstDelimiter,indexSecondDelimiter));

        return answer;
    }
}
