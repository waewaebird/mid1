package enumeration.ref1;

public class ClassGrade {
    //등급과 할인율을 같이가니깐 합친다.
    public static final ClassGrade BASIC = new ClassGrade(10); // x001
    public static final ClassGrade GOLD = new ClassGrade(20); // x002
    public static final ClassGrade DIAMOND= new ClassGrade(30); // x003

    private final int discountPercent;

    //private 생성자 추가(외부 생성 안됨)
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
