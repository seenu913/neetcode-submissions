class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i=0;
        int j=0;
        char[] charSeq = str.toCharArray();
        while(j<charSeq.length) {
            int strLen = 0;
            if(charSeq[j] == '#') {
                strLen = Integer.valueOf(str.substring(i,j));
                i=strLen+j+1;
                decodedList.add(str.substring(j+1, i));
                j=i;
            }
            j++;
        }
        return decodedList;
    }
}
