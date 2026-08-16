class Solution {
    public List<String> removeAnagrams(String[] words) {

        int size = words.length;

        for (int i = 1; i < size; i++) {

            if (words[i].length() != words[i - 1].length()) {
                continue;
            }

            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            boolean anagram = true;
            for (char c : words[i - 1].toCharArray()) {

                if (!map.containsKey(c)) {
                    anagram = false;
                    break;
                }

                map.put(c, map.get(c) - 1);

                if (map.get(c) < 0) {
                    anagram = false;
                    break;
                }
            }
            if (anagram) {
                for (int num : map.values()) {
                    if (num != 0) {
                        anagram = false;
                        break;
                    }
                }
            }

            if (anagram) {
                for (int index = i; index < size - 1; index++) {
                    words[index] = words[index + 1];
                }

                size--;
                i--;
            }
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            result.add(words[i]);
        }

        return result;
    }
}