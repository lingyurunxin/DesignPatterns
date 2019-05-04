public class SmartPhone implements Phone{
    private NonSmartPhone nonSmartPhone;
    public SmartPhone(NonSmartPhone nonSmartPhone) {
        this.nonSmartPhone = nonSmartPhone;
    }

    @Override
    public void play() {

        System.out.println("智能手机可以上网！");
        nonSmartPhone.play();
        System.out.println("智能手机可以打游戏！");

    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(new NonSmartPhone());
        smartPhone.play();
    }
}
