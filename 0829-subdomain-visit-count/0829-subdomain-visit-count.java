
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String entry : cpdomains) {
            String[] parts = entry.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];

            // add full domain
            countMap.put(domain, countMap.getOrDefault(domain, 0) + count);

            // add subdomains after each dot
            for (int i = 0; i < domain.length(); i++) {
                if (domain.charAt(i) == '.') {
                    String sub = domain.substring(i + 1);
                    countMap.put(sub, countMap.getOrDefault(sub, 0) + count);
                }
            }
        }

        List<String> res = new ArrayList<>(countMap.size());
        for (Map.Entry<String, Integer> e : countMap.entrySet()) {
            res.add(e.getValue() + " " + e.getKey());
        }
        return res;
    }
}
