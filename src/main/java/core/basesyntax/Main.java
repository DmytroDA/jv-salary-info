package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"John", "Andrew", "Kate"};
        String[] data = new String[] {"26.04.2019 John 4 50",
                "05.04.2019 Andrew 3 200",
                "10.04.2019 John 7 100",
                "22.04.2019 Kate 9 100",
                "25.06.2019 John 11 50",
                "26.04.2019 Andrew 3 150",
                "13.02.2019 John 7 100",
                "26.04.2019 Kate 9 100"};
        SalaryInfo salaryInfo = new SalaryInfo();
        String result = salaryInfo.getSalaryInfo(names, data, "01.04.2019", "30.04.2019");
        System.out.println(result);
    }
}