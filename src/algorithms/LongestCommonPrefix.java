package algorithms;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"pillow", "pill", "pillgrim", "piller"};
//        System.out.println(findLCP(strs));
//
//
//        System.out.println(findLCPUsingContains(strs));

        System.out.println(findLCPUsingContainsNew(strs));
    }

    private static String findLCPUsingContainsNew(String[] strs) {

        String lcp = strs[0];

        for (int i = 1; i< strs.length; i++){
            while (!strs[i].contains(lcp)){
                lcp = lcp.substring(0, lcp.length() -1);
                if (lcp.isEmpty())
                    return "";
            }
        }
        return lcp;
    }

    private static String findLCPUsingContains(String[] stringArray) {

        String lcp = stringArray[0];
        for(int i = 1; i<stringArray.length; i++) {
            while(!stringArray[i].contains(lcp)){
                lcp = lcp.substring(0, lcp.length() -1);
            }
            if (lcp.isEmpty()){
                return "";
            }
        }
        return lcp;
    }

//    static String findLCP(String[] strs) {
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            while (strs[i].indexOf(prefix) != 0) {
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()) {
//                    return "";
//                }
//            }
//        }
//        return prefix;
//    }






    static String findLCP(String[] strs){

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,  prefix.length() -1 );
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}
