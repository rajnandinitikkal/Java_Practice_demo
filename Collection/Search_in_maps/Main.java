package Collection.Search_in_maps;

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
        map.put(new code("a1", "11"), "Tushar");
        map.put(new code("a2", "12"), "Rut");
        map.put(new code("a3", "13"), "pilav");
        map.put(new code("a4", "14"), "nayat");
        map.put(new code("a5", "15"), "kiv");

        code code = null;

        for(code key: map.keySet()){
            if(map.get(key).equals("Rut")){
                code = key;
            }
        }
        System.out.println(code);

    }
}