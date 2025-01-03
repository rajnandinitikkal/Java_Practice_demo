package Collection.Equals_and_Hashmaps;

import java.util.Objects;

class code implements Comparable<code>{
    private String sectionNo;
    private String lectureNo;

    public code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    @Override
    public String toString() {
        return "code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }
    @Override
    public int compareTo(code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        code code = (code) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }
}

public class Main {
    public static void main(String[] args) {

        String x1 = "Study";
         x1 += "Easy";
        String x2 = "StudyEasy";

       System.out.println(x1.hashCode());
       System.out.println(x2.hashCode());
       System.out.println(x1.equals(x2));
       System.out.println(x1 == x2);

        code code1 =new code("01","11");
        code code2 =new code("01","11");
        System.out.println(code1.equals(code2));
        System.out.println(code1.hashCode());
        System.out.println(code2.hashCode());

    }
}