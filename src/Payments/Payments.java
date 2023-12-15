package Payments;

public class Payments {


        double pix;
        double money;
        double debit;
        double credit;
        String voucher;

    public Payments(double pix, double money, double debit, double credit, String voucher) {
        this.pix = pix;
        this.money = money;
        this.debit = debit;
        this.credit = credit;
        this.voucher = voucher;

    }

    public double getPix() {
        return pix;
    }

    public void setPix(double pix) {
        this.pix = pix;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
}



