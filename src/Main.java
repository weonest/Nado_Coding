class Cal {

    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}


public class Main{
    public static void main(String[] args) {
        Cal c1 = new Cal();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

    }
}
