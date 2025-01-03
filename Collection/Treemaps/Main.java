package Collection.Treemaps;

// import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
}
public class Main {
    public static void main(String[] args) {

        Map<code, String> map = new TreeMap<>();
        map.put(new code("81","20"),"Tushar");
        map.put(new code("24","50"),"Rutuja");
        map.put(new code("25","17"),"Rahul");
        map.put(new code("81","10"),"Mohini");
        map.put(new code("71","19"),"Sakshi");

        System.out.println(map);
    }
}