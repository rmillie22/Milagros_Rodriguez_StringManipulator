public class StringManipulator {
    public String trimAndConcat(String a, String b) {
        return (a.trim()) + (b.trim());
    }

    public Integer getIndexOrNull(String source, char target) {
        int index = source.indexOf(target);
        return (index == -1) ? null : index;
    }

    public Integer getIndexOrNull(String source, String target) {
        int index = source.indexOf(target);
        return (index == -1) ? null : index;
    }

    public String concatSubstring(String source, int start, int end, String target) {
        return source.substring(1, 2) + target;
    }
}