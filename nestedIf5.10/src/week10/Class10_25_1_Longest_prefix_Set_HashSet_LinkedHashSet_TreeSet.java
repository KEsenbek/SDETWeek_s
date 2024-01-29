package week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

    public class Class10_25_1_Longest_prefix_Set_HashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList(new String[]{"apple", "application", "aptitude"}));

        findLongestCommonPrefix(set);
    }

    public static String findLongestCommonPrefix(Set<String> stringSet) {
        if (stringSet == null || stringSet.isEmpty()) {
            return ""; // Return empty string if the set is null or empty
        }

        String firstString = stringSet.iterator().next();
        int commonPrefixLength = firstString.length();

        for (String str : stringSet) {
            int i = 0;
            while (i < commonPrefixLength && i < str.length() && firstString.charAt(i) == str.charAt(i)) {
                i++;
            }

            // Update commonPrefixLength to the length of the current common prefix
            commonPrefixLength = i;
        }

        return firstString.substring(0, commonPrefixLength);
    }

}
