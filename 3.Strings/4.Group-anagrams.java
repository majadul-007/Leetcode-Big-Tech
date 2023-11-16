class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> mymap = new HashMap<>();
        int n = strs.length;
        String temp;



        for (int i = 0; i < n; ++i) {
            temp = strs[i];
            char[] charArray = temp.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!mymap.containsKey(sortedStr)) {
                mymap.put(sortedStr, new ArrayList<>());
            }
            mymap.get(sortedStr).add(temp);
        }

        

        for (Map.Entry<String, List<String>> entry : mymap.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
