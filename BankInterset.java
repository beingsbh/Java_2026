
class Bank {

    double getRateOfInterest() {
        return 0;

    }
}

class SBI extends Bank {

    double getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {

    double getRateOfInterest() {
        return 7;

    }
}

class AXIS extends Bank {

    double getRateOfInterest() {
        return 9;
    }
}

public class BankInterset {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        System.out.println(sbi.getRateOfInterest());
        System.out.println(icici.getRateOfInterest());
        System.out.println(axis.getRateOfInterest());

    }

}
